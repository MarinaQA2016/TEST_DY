package org.exmpl.tests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {
    WebDriver driver;

    @BeforeMethod
    public void startUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();



    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
