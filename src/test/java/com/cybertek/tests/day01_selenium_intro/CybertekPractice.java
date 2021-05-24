package com.cybertek.tests.day01_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CybertekPractice {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://practice.cybertekschool.com");
       String expectedWord = "cybertekschool";
       String actualUrl = driver.getCurrentUrl();


       if(actualUrl.contains(expectedWord)){
           System.out.println("Expected word found");
       } else{
           System.out.println("Expected word not found");
       }

       String expectedTitle = "Practice";
       String actualTitle = driver.getTitle();


        if(expectedTitle.equals(actualTitle)){
           System.out.println("Title match passed");
       } else {
           System.out.println("Title \"match\" failed");
       }

        driver.close();


    }
}
