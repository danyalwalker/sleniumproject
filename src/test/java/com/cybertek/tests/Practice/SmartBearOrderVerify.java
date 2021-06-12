package com.cybertek.tests.Practice;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SmartBearOrderVerify {
    WebDriver driver;
    @BeforeClass
    public void setupClass(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        WebElement userName = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_username']"));
        userName.sendKeys("Tester");
        WebElement passWord = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_password']"));
        passWord.sendKeys("test");
        WebElement login = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_login_button']"));
        login.click();

    }

//    @AfterClass
//    public void tearDownClass(){
//        driver.close();
//    }

    @Test
    public void orderVerify(){
        WebElement susanDate = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_orderGrid_ctl06_OrderSelector']/../..//td[5]"));
        String actualDate = susanDate.getText();
        String expectedDate = "01/05/2010";
        Assert.assertEquals(actualDate,expectedDate);

    }
}
