package com.cybertek.tests.Practice;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FacebookAttributeValue {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com");
        WebElement createPage = driver.findElement(By.xpath("//a[@class='_8esh']"));
        String expectedText =  createPage.getAttribute("href");
        String actualText = "registration_form";

        if(expectedText.contains(actualText)){
            System.out.println("VERIFIED");
        } else {
            System.out.println("FAILED");
        }
    }
}
