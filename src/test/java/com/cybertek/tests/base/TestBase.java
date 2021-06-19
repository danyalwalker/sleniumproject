package com.cybertek.tests.base;

import com.cybertek.Utilities.ConfigurationReader;
import com.cybertek.Utilities.TableUtils;
import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public abstract class TestBase {
   public WebDriver driver;

    @BeforeMethod
    public void setupMethod(){

        String browser = ConfigurationReader.getProperty("browser");
        driver = WebDriverFactory.getDriver(browser);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

    }
    @Test
    public void task4_verify_order_method(){
        TableUtils.verifyOrder(driver, "Tim");
    }
}
