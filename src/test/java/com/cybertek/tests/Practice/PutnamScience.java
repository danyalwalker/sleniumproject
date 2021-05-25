package com.cybertek.tests.Practice;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PutnamScience {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://www.putnamscienceacademy.org");
        String actualUrl = driver.getCurrentUrl();
        System.out.println("Current Url: "+driver.getCurrentUrl());

        WebElement apply = driver.findElement(By.id("1259960616"));
        apply.click();
        System.out.println(driver.getTitle());
    }
}
