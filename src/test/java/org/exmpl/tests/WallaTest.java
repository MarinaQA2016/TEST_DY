package org.exmpl.tests;

import org.exmpl.pages.WallaPageHelper;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WallaTest extends TestBase{
    WallaPageHelper wallaPage;
    @BeforeMethod
    public void initTests(){
        wallaPage = PageFactory.initElements(driver, WallaPageHelper.class);
        driver.get("https://www.walla.co.il/");
    }
    @Test
    public void dollarCheck(){
        wallaPage.clickMoneyMenu();
        Assert.assertEquals("3.156",wallaPage.getDollarValue());

    }
}
