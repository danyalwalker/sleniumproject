package com.cybertek.tests.Practice;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ForgotPassword {

    WebDriver driver;

    @BeforeClass

    public void setupClass(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/forgot_password");

    }

    @Test
    public void locateElement(){
        WebElement homeLink = driver.findElement(By.xpath("//body//a[@class='nav-link']"));
        WebElement forgotPassword = driver.findElement(By.xpath("//body//h2[.='Forgot Password']"));
        WebElement emailText = driver.findElement(By.xpath("//label[@for='email']"));
        WebElement retrievePassword = driver.findElement(By.xpath("//button/i[@class='icon-2x icon-signin']"));
        WebElement emailBox = driver.findElement(By.xpath("//input[@type='text']"));
        WebElement cybertekLink = driver.findElement(By.xpath("//body//a[@target='_blank']"));

        Assert.assertTrue(homeLink.isDisplayed());
        Assert.assertTrue(forgotPassword.isDisplayed());
        Assert.assertTrue(emailText.isDisplayed());
        Assert.assertTrue(retrievePassword.isDisplayed());
        Assert.assertTrue(emailBox.isDisplayed());
        Assert.assertTrue(cybertekLink.isDisplayed());



    }

    @AfterClass
    public void teardownClass(){
        driver.close();
    }

}
