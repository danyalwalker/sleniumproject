package com.cybertek.tests.Practice;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SeleniumEasyCheckbox {
    WebDriver driver;
    @BeforeClass
   public void setupClass(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get(" https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
    }

    @Test
    public void checkBox(){
        WebElement checkBox = driver.findElement(By.xpath("//input[@id='isAgeSelected']"));
        checkBox.click();
        WebElement displayMessage = driver.findElement(By.xpath("//div[.='Success - Check box is checked']"));
        Assert.assertTrue(displayMessage.isDisplayed());
    }

    @AfterClass
    public void tearDownClass(){
        driver.close();
    }
}
