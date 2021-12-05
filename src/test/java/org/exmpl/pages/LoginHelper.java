package org.exmpl.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginHelper extends PageBase{
    @FindBy (xpath = "//div[@class='d-flex justify-content-center']/button")
    WebElement submitButton;
    @FindBy (id = "email")
    WebElement emailField;
    @FindBy (id = "password")
    WebElement passwordField;


    public LoginHelper(WebDriver driver) {
        super(driver);
    }

    public LoginHelper waitUntilPageIsLoaded(){
        waitUntilElementIsClickable(emailField,30);
        waitUntilElementIsClickable(passwordField,30);
        waitUntilElementIsClickable(submitButton,30);
        return this;
    }

    public LoginHelper login (String login, String  password){
        fillField(emailField, login);
        fillField(passwordField, password);
        submitButton.click();
        return this;
    }
}
