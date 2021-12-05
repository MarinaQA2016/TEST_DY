package org.exmpl.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WallaPageHelper extends PageBase{
    @FindBy(xpath = "//li[@role='menuitem'][./a[@href = 'https://finance.walla.co.il']]/*")
    WebElement moneyMenu;
    @FindBy(xpath = "//input[@name = 'q']")
    WebElement searchField;
    @FindBy(xpath = "//div[@class = 'promo mail'][.//div[@class= 'icon ']]")
    WebElement iconMail;
    @FindBy(xpath = "//img[@alt='closeBtnImg']")
    WebElement closeButtonImage;
    @FindBy(xpath="//li[./h3[contains(text(),'דולר $')]]/div[@class='rate']")
    WebElement dollarValue;

    public WallaPageHelper(WebDriver driver) {
        super(driver);
    }
    public void  clickMoneyMenu(){
        //waitUntilElementIsClickable(searchField,20);
        waitUntilAllElementsArePresent(By.tagName("iframe"),40);
        waitUntilElementIsClickable(moneyMenu, 20);
        moneyMenu.click();

    }

    public String getDollarValue(){
        waitUntilElementIsVisible(dollarValue,30);
        return dollarValue.getText();
    }
}
