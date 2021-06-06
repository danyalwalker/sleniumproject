package com.cybertek.tests.Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsernamePasswordSignin {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        String expectedTitle = "Web Orders Login";
        String actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Verified, test Passed");
        } else{
            System.out.println("not verified, test failed");
        }

        WebElement Username = driver.findElement(By.id("ctl00_MainContent_username"));
        Username.sendKeys("Tester");
        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test");
        WebElement login = driver.findElement(By.id("ctl00_MainContent_login_button"));
        login.click();


        expectedTitle = "Web Orders";
        actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Verified, test Passed");
        } else{
            System.out.println("not verified, test failed");
        }

        driver.close();
    }
}
