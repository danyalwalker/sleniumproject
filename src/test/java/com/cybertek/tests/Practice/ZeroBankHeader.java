package com.cybertek.tests.Practice;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ZeroBankHeader {
    public static void main(String[] args) {
      WebDriver driver = WebDriverFactory.getDriver("chrome");
      driver.manage().window().maximize();
      driver.get("http://zero.webappsecurity.com/login.html");

        WebElement header = driver.findElement(By.tagName("h3"));

        String expectedText = header.getText();
        String actualText = "Log in to ZeroBank";

        if(actualText.equals(expectedText)){
            System.out.println("Header verified");
        } else {
            System.out.println("Header not verified");
        }
    }
}
