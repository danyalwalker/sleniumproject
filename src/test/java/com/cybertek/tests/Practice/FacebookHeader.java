package com.cybertek.tests.Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookHeader {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com");


       WebElement header = driver.findElement(By.xpath("//h2[@class='_8eso']"));

       String expectedHeader = "Connect with friends and the world around you on Facebook.";
       String actualHeader = header.getText();

       if(actualHeader.equals(expectedHeader)){
           System.out.println("Header verified");
       } else {
           System.out.println("Header not verified");
       }
    }
}
