package com.cybertek.tests.Practice;

import com.cybertek.Utilities.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookIncorrectLogin {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com");

        WebElement Username = driver.findElement(By.xpath("//input[@id='email']"));
        Username.sendKeys("kamilfeyyaz@gmail.com");
        WebElement passWord = driver.findElement(By.xpath("//input[@id='pass']"));
        passWord.sendKeys("merhaba" + Keys.ENTER);

        BrowserUtils.sleep(2);

        String actualTitle = driver.getTitle();

        System.out.println("actualTitle = " + actualTitle);
        String expectedTitle = "Log into Facebook";



        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title verified");
        } else {
            System.out.println("Title not verified");
        }

    }
}
