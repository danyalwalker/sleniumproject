package com.cybertek.Utilities;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class VerifyOrderTest {
WebDriver driver = WebDriverFactory.getDriver(ConfigurationReader.getProperty("browser"));
    @BeforeClass
    public void setupClass(){
        SmartBearUtils.loginToSmartBear(WebDriverFactory.getDriver("chrome"));

    }

    @AfterClass
    public void tearDownClass(){
        driver.close();
    }
    @Test

    public void checkName(){
        SmartBearUtils.verifyOrder( driver,"Mark Smith");
    }

    @Test

    public void PrintCheck(){
        SmartBearUtils.printNamesAndCities(driver);
    }
}
