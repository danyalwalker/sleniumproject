package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2_CybertekUrlVerification {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/");

        String expectedInUrl = "cybertekschool";
        String actualInUrl = driver.getCurrentUrl();

        if (actualInUrl.contains(expectedInUrl)){
            System.out.println("passed");
        } else{
            System.out.println("not passed");
        }

        String  expectedTitle = "Practice";
        String actualTitle = driver.getTitle();

        if(actualTitle.equals((expectedTitle))){
            System.out.println("Title verification passed");
        } else {
            System.out.println("Title verification failed");
        }
    }
}
