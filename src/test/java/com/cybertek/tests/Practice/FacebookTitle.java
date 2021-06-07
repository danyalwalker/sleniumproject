package com.cybertek.tests.Practice;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class FacebookTitle {
    public static void main(String[] args) {
       WebDriver driver = WebDriverFactory.getDriver("chrome");
       driver.manage().window().maximize();
       driver.get("https://www.facebook.com");

       String actualTitle = driver.getTitle();
        System.out.println("actualTitle = " + actualTitle);
       String expectedTitle = "Facebook - Log In or Sign Up";

       if(actualTitle.equals(expectedTitle)){
           System.out.println("Title verified");
       } else {
           System.out.println("Title not verified");
       }


    }
}
