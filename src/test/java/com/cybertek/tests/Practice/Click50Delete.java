package com.cybertek.tests.Practice;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Click50Delete {
    WebDriver driver;

    @BeforeClass
    public void classSetup() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/add_remove_elements/");
    }

    @Test
    public void addMultipleTimes(){
        WebElement addButton = driver.findElement(By.xpath("//button[@onclick='addElement()']"));
        for (int i = 1; i <= 50; i++) {
            addButton.click();
            WebElement deleteButton = driver.findElement(By.xpath("//button[@class='added-manually']"));
            Assert.assertTrue(deleteButton.isDisplayed());
            deleteButton.click();
        }
    }

    @AfterClass
    public void tearDownClass(){
        driver.close();
    }
}
