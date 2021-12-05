package org.exmpl.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HelloInterviewerPageHelper extends PageBase{
    @FindBy (xpath = "//h1")
    WebElement header;
    @FindBy (xpath = "//a[@class ='nav-link text-logout']")
    WebElement signOutOption;

    public HelloInterviewerPageHelper(WebDriver driver) {
        super(driver);
    }
    public void waitUntilPageIsLoaded(){
        waitUntilElementIsClickable(signOutOption,20);
        waitUntilElementIsVisible(header, 20);
    }

    public String getHeader(){
        return header.getText();
    }
}
