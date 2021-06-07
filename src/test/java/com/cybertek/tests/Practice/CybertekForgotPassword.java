package com.cybertek.tests.Practice;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CybertekForgotPassword {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/forgot_password");

        WebElement emailInput = driver.findElement(By.xpath("//input[@name='email']"));
        emailInput.sendKeys("danyal@gmail.com");
        WebElement clickButton = driver.findElement(By.xpath("//button[@id='form_submit']"));
        clickButton.click();
        String CurrentUrl = driver.getCurrentUrl();
        String ExpectedUrl = "email_sent";

        if(CurrentUrl.contains(ExpectedUrl)){
            System.out.println("Url verified");
        } else{
            System.out.println("Url not verified");
        }

        String actualText = driver.findElement(By.xpath("//h4[@name='confirmation_message']")).getText();
        String expectedText = "Your e-mail's been sent!";

        if(actualText.equals(expectedText)){
            System.out.println("textbox displaced correctly");
        } else {
            System.out.println("textbox displaced not correctly");
        }

    }
}
