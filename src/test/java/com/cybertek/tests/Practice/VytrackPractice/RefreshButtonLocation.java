package com.cybertek.tests.Practice.VytrackPractice;

import com.cybertek.Utilities.Driver;
import com.cybertek.Utilities.VytrackUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RefreshButtonLocation {
    //Refresh button should be on the left side of Reset Button
    @BeforeClass
    public void loginVytrack() {
        VytrackUtils.loginToVytrack();
    }

    @BeforeMethod
   public void accessVehicle(){
        VytrackUtils.accessVehiclesPage();
    }

        @Test
        public void locateRefreshButton() {
            WebElement refreshButton = Driver.getDriver().findElement(By.xpath("//a[@title='Refresh']"));
            String actualRefreshButtonTitle = refreshButton.getAttribute("title");

            WebElement resetButton = Driver.getDriver().findElement(By.xpath("//a[@title='Refresh']/following-sibling::a"));
            String actualResetButtonTitle = resetButton.getAttribute("title");

            String expectedRefreshButtonTitle = "Refresh";
            String expectedResetButtonTitle = "Reset";

            Assert.assertTrue(actualRefreshButtonTitle.equals(expectedRefreshButtonTitle));
            Assert.assertTrue(actualResetButtonTitle.equals(expectedResetButtonTitle));
           // Assert.assertTrue(actualRefreshButtonTitle.equals(expectedRefreshButtonTitle) && actualResetButtonTitle.equals(expectedResetButtonTitle));
        }

        @Test
    public void locateRefreshButton2(){

            WebElement refreshButton = Driver.getDriver().findElement(By.xpath("//a[@title='Refresh']/..//a[2]"));
            String actualRefreshButtonTitle = refreshButton.getAttribute("title");

             WebElement resetButton = Driver.getDriver().findElement(By.xpath("//a[@title='Refresh']/..//a[3]"));
            String actualResetButtonTitle = resetButton.getAttribute("title");

            String expectedRefreshButtonTitle = "Refresh";
            String expectedResetButtonTitle = "Reset";

            Assert.assertTrue(actualRefreshButtonTitle.equals(expectedRefreshButtonTitle));
            Assert.assertTrue(actualResetButtonTitle.equals(expectedResetButtonTitle));

        }
    }

