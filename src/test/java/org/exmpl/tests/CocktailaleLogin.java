package org.exmpl.tests;

import org.exmpl.pages.HelloInterviewerPageHelper;
import org.exmpl.pages.LoginHelper;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CocktailaleLogin extends TestBase{
    LoginHelper loginPage;
    HelloInterviewerPageHelper helloInterviewerPage;
    @BeforeMethod
    public void initTests(){
        loginPage = PageFactory.initElements(driver, LoginHelper.class);
        helloInterviewerPage = PageFactory.initElements(driver, HelloInterviewerPageHelper.class);
        driver.get("https://cocktailale.web.app/getStarted");
    }

    @Test
    public void loginTest(){
        loginPage.waitUntilPageIsLoaded()
                .login("inter@gmail.com","Aa123123");
        helloInterviewerPage.waitUntilPageIsLoaded();
        Assert.assertEquals("Hello Interview,", helloInterviewerPage.getHeader());
    }
}
