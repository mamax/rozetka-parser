package com.parser.rozetka.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

public class WinePage extends BasePageObject{

    public WinePage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getBlockList() {
        return listblock;
    }

    @FindBys( {
            @FindBy(xpath = "//div[@class='g-i-tile-i-image']")
    } )
    private List<WebElement> listblock;

    public WebElement getNameProduct() {
        return nameProduct;
    }

    @FindBy(xpath = "//div[@class='g-i-tile-i-title clearfix']/a")
    private WebElement nameProduct;


    public WebElement getPrice() {
        return price;
    }

    @FindBy(xpath = "//div[@class='g-price']/div")
    private WebElement price;


}
