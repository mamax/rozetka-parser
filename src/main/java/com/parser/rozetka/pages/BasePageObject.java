package com.parser.rozetka.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementDecorator;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementLocatorFactory;

/**
 * Created by Maksym_Mazurkevych on 1/3/2017.
 */
public abstract class BasePageObject {

    protected WebDriver driver;
    protected WebDriverWait wait;

    protected BasePageObject(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 20);
        PageFactory.initElements(new HtmlElementDecorator(new HtmlElementLocatorFactory(driver)), this);
    }

    public void waitFor(ExpectedCondition<WebElement> condition, Integer timeOutInSeconds){
        int temp = timeOutInSeconds != null ? timeOutInSeconds : 30;
        WebDriverWait webDriverWait = new WebDriverWait(driver, temp);
        webDriverWait.until(condition);
    }
}
