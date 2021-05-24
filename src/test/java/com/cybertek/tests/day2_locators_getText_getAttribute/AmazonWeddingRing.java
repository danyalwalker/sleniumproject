package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonWeddingRing {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://amazon.com");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("wedding ring" + Keys.ENTER);

        String expectedResult = "wedding ring";
        String actualResult = driver.getTitle();


        if(actualResult.contains(expectedResult)){
            System.out.println("Title verification passed");
        } else {
            System.out.println("Title verification failed");
        }
    }
}
