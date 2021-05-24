package com.cybertek.tests.Practice;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class Get_Refresh_Navigate_GetTitle {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://www.tesla.com");
        String currentURL = driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);

        
        driver.get("https://www.google.com");
        String currentUrl = driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);

        
        driver.get("https://www.cnn.com");
        String currentUrl2 = driver.getCurrentUrl();
        System.out.println("currentUrl2 = " + currentUrl2);
        driver.navigate().to("https://www.etsy.com");
        System.out.println(driver.getTitle());
        driver.navigate().to("https://www.ebay.com");
        System.out.println(driver.getTitle());
        driver.navigate().refresh();
        driver.navigate().to("https://www.google.com");
        System.out.println(driver.getTitle());
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        driver.quit();


    }

}
