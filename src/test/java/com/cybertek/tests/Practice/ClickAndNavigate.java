package com.cybertek.tests.Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickAndNavigate {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");

        WebElement gmail = driver.findElement(By.linkText("Gmail"));
        gmail.click();

        String expectedTitle = "Gmail - Email from Google";
        String actualTitle = driver.getTitle();
        System.out.println("actualTitle = " + actualTitle);

        if(expectedTitle.equals(actualTitle)){
            System.out.println("Title verified and Test passed");
        } else{
            System.out.println("Title not verified and Test failed");
        }
        
        driver.navigate().back();
         expectedTitle = "Google";
         actualTitle = driver.getTitle();
        System.out.println("actualTitle = " + actualTitle);

        if(expectedTitle.equals(actualTitle)){
            System.out.println("Title verified and Test passed");
        } else{
            System.out.println("Title not verified and Test failed");
        }
         


    }
}
