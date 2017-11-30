package com.parser.rozetka.base;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.testng.ITestContext;
import org.testng.annotations.*;

import java.io.InputStream;
import java.nio.file.NoSuchFileException;

/**
 * Created by Maksym_Mazurkevych on 1/3/2017.
 */
public class BasicTest extends BrowserConf {

    protected static WebDriver driver;
    private static ApplicationContext context;
    protected static BaseUrl url;
    protected static Logger log;

//    @BeforeSuite
//    public static void initSpringConfig(){
//        context = new ClassPathXmlApplicationContext("spring-config.xml");
//        url = context.getBean("baseUrlConf", BaseUrl.class);
//    }

    @BeforeSuite
    public static void setUpLogger(ITestContext itr){
        String testName = itr.getCurrentXmlTest().getName();
        log = LoggerFactory.getLogger(testName);
    }

    @BeforeMethod(alwaysRun = true)
    @Parameters({"browser"})
    public static void setUp(@Optional("PHANTOM_JS") String browser){
        driver = BrowserConf.getDriver(browser, log);
    }

    @AfterTest(alwaysRun = true)
    public void tearDown(){
        if (driver != null) {
            driver.quit();
            log.info("Close browser");
        }
    }


    protected void goToUrlWrapper(String text){
        driver.get(text);
        log.info("On the home page " + text);
    }


    public static InputStream getResource(String properties) throws NoSuchFileException
    {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        InputStream is = loader.getResourceAsStream(properties);

        if(is == null)
        {
            throw new NoSuchFileException("Resource file not found. Note that the current directory is the source folder!");
        }

        return is;
    }

}
