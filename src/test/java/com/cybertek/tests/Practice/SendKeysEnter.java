package com.cybertek.tests.Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysEnter {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com");
        //WebElement searchBox = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
        //WebElement searchBox = driver.findElement(By.cssSelector("input[class='gLFyf gsfi']"));
        WebElement searchBox =driver.findElement(By.name("q"));
        searchBox.sendKeys("apple" + Keys.ENTER);

        String expectedTitle = "apple";
        String actualTitle = driver.getTitle();
        if(actualTitle.startsWith(expectedTitle)){
            System.out.println("Title verified, Test passed");
        }else {
            System.out.println("Title not verified, Test failed");
        }
        driver.close();
    }

}
