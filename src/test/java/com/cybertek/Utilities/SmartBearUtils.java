package com.cybertek.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class SmartBearUtils {

    public static void verifyOrder(WebDriver driver, String expectedName) {

        //1- Create a locator that is returning us all of the lists in the table
        //table[@id='ctl00_MainContent_orderGrid']//tr//td[2]

        List<WebElement> allNames = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr//td[2]"));

        //we need to loop through 'allName' List of WebElement and make sure 'expectedName' is in there

        for (WebElement each : allNames) {

            if (each.getText().equals(expectedName)) {
                Assert.assertTrue(each.getText().equals(expectedName));
                return;
            }

        }
        //The only condition where the Assert.fail() line below executed is if 'expectedName' is not in the list.

        //Assert.fail(); method will FAIL THE TEST NO MATTER WHAT.
        Assert.fail("The expectedName is not in the table. ");
    }

    public static void loginToSmartBear(WebDriver driver) {
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

    public static void printNamesAndCities(WebDriver driver){
        List<WebElement> allNames = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr//td[2]"));
        List<WebElement> allCities = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr//td[7]"));
        List<String> nameAndCity = new ArrayList<String>();
        for (int i = 1; i <= 8; i++) {
            nameAndCity.add("Name" + i + ": "+allNames.get(i) + " , City" + i + ": "  + allCities.get(i));
        }
        System.out.println(nameAndCity);
    }


}
