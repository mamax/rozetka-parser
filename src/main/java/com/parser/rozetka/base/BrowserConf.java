package com.parser.rozetka.base;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.PhantomJsDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.slf4j.Logger;

import java.util.concurrent.TimeUnit;

/**
 * Created by Maksym_Mazurkevych on 1/3/2017.
 */
public class BrowserConf {

    public enum browsers
    {
        CHROME, PHANTOM_JS
    }

    public static WebDriver getDriver(String browser, Logger log) {
        WebDriver driver;
        log.info("Starting browser " + browser);
            switch (browsers.valueOf(browser)) {
                case CHROME:
                    ChromeDriverManager.getInstance().setup();
                    driver = new ChromeDriver();
                    break;

                case PHANTOM_JS:
                    PhantomJsDriverManager.getInstance().setup();
                    driver = new PhantomJSDriver();
                    break;

                default:
                    ChromeDriverManager.getInstance().setup();
                    driver = new ChromeDriver();
            }

            driver.manage().deleteAllCookies();
            driver.manage().window().maximize();
            log.info("Dimension : " + driver.manage().window().getSize());
            log.info("Opening browser");
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
            driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);

            return driver;
    }

}
