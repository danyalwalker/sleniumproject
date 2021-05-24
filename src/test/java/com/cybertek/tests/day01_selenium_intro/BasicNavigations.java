package com.cybertek.tests.day01_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {

    public static void main(String[] args) throws InterruptedException {
        //1- set up the browser driver
        WebDriverManager.chromedriver().setup();

        // 2- Create instance of web driver
        WebDriver driver = new ChromeDriver();

        //this line will maximize the browser size
        driver.manage().window().maximize();

       // can use in mac only --> driver.manage().window().fullscreen();

        // 3- get the page for Tesla.com
        driver.get("https://www.tesla.com");

        System.out.println("Current Title: " + driver.getTitle());
       String currentUrl = driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);

        // putting 3 seconds of wait time
        Thread.sleep(2000);

        // Going back using navigations
        driver.navigate().back();

        // putting 3 seconds of wait time
        Thread.sleep(2000);

        // Going forward using navigations
        driver.navigate().forward();

        // putting 3 seconds of wait time
        Thread.sleep(2000);

        // Refreshing the page using navigations
        driver.navigate().refresh();

        // going to another url using .to() method
        driver.navigate().to("https://www.google.com");
        System.out.println("Current Title: " + driver.getTitle());
        currentUrl = driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);

        // this will close the currently opened browser
        driver.close();

        // will close all opened drivers in session
        driver.quit();





    }
}
