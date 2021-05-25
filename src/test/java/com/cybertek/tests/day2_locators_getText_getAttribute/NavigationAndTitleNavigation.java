package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * TC #3: Back and forth navigation
 * 1- Open a chrome browser
 * 2- Go to: https://google.com
 * 3- Click to Gmail from top right.
 * 4- Verify title contains:
 * Expected: Gmail
 * 5- Go back to Google by using the .back();
 * 6- Verify title equals:
 * Expected: Google
 */
public class NavigationAndTitleNavigation {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://google.com");
        driver.findElement(By.linkText("Gmail")).click();

        String expectedInTitle = "Gmail";
        String actualTitle = driver.getTitle();

        if(actualTitle.contains(expectedInTitle)){
            System.out.println("Title verification Passed");
        } else{
            System.out.println("Title verification Failed");
        }

        String expectedGoogleTitle = "Google";
        String actualGoogleTitle = driver.getTitle();

        if(actualGoogleTitle.equals(expectedGoogleTitle)){
            System.out.println("Title verification Passed!");
        } else {
            System.out.println("Title verification Failed!");
        }



    }
}
