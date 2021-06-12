package com.cybertek.tests.Practice;

import com.cybertek.Utilities.BrowserUtils;
import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class SleniumEasyCheckBox2 {
    WebDriver driver;
    @BeforeClass
    public void setupClass(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get(" https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
    }
    @Test
    public void checkAll(){
        List<WebElement> checkboxes = driver.findElements(By.xpath("//div[@class='panel-body']//input"));
        for (int i = 2; i < checkboxes.size()-1; i++) {
           checkboxes.get(i).click();
            BrowserUtils.sleep(1);
        }

        WebElement uncheck = driver.findElement(By.xpath("//input[@id='check1']"));
        uncheck.click();
        WebElement checkAll = driver.findElement(By.xpath("//input[@value='Check All']"));
        Assert.assertTrue(checkAll.isDisplayed());
    }

    @AfterClass
    public void tearDownClass(){
        driver.close();
    }
}
