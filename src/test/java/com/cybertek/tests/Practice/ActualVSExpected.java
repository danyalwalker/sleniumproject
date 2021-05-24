package com.cybertek.tests.Practice;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class ActualVSExpected {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://www.google.com");
        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();
        System.out.println("actualTitle = " + actualTitle);

        if(expectedTitle.equals(actualTitle)){
            System.out.println("Title verified, test passed");
        } else {
            System.out.println("Title not verified, test failed");
        }

        driver.navigate().to("https://www.tesla.com");
        String currentUrl = driver.getCurrentUrl();
        String word = "tesla";

        System.out.println("(currentUrl.contains(word)) = " + (currentUrl.contains(word)));
    }
}
