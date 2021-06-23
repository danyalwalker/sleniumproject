package com.cybertek.tests.day12_actions_upload_jsexecutor;

import com.cybertek.Utilities.ConfigurationReader;
import com.cybertek.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DriverUtilPractice {
    @Test
    public void simpleGoogleSearchTest(){
        //1-Go to google.com
        //Driver.getDriver(
        // Driver.getDriver();=driver --> creates driver instance and ready to use
        Driver.getDriver().get("https://www.google.com");
        //2-Search for a value
        WebElement searchBox = Driver.getDriver().findElement(By.name("q"));

        //String searchValue = "wooden spoon";
        String searchValue = ConfigurationReader.getProperty("searchValue");
        //3.verify value is contained in title
        searchBox.sendKeys(searchValue + Keys.ENTER);
        String actualTitle = Driver.getDriver().getTitle();
        String expectedInTitle = searchValue;

        Assert.assertTrue(actualTitle.contains(expectedInTitle));

        //This will terminate the session and assign driver value to null
        Driver.closeDriver();

        Driver.getDriver().get("https://etsy.com");

        Driver.closeDriver();

    }
    }

