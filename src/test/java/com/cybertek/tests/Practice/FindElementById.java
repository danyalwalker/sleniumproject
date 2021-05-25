package com.cybertek.tests.Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementById {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.ebay.com");
        driver.findElement(By.id("gh-ac"));
        WebElement ebayId = driver.findElement(By.id("gh-ac"));
        ebayId.sendKeys("grass trimmer" + Keys.ENTER);
        driver.getTitle();
        System.out.println("driver.getTitle().contains(\"grass trimmer\") = " + driver.getTitle().contains("grass trimmer"));




    }
}
