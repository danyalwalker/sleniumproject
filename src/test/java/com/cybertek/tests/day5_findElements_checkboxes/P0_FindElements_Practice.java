package com.cybertek.tests.day5_findElements_checkboxes;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class P0_FindElements_Practice {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();


        // If a web element is not found, this will wait UP TO given seconds
        // If web element is located before 15 seconds, it will move on
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        //2. Go to http://practice.cybertekschool.com/forgot_password

        driver.get("http://practice.cybertekschool.com/forgot_password");

        List<WebElement> listOfElements = driver.findElements(By.xpath("//body//a"));


        //3. Print out the texts of all links

        for (WebElement each : listOfElements) {
            System.out.println(each.getText());   // iter + tab ==> shortcut foreach loop
            System.out.println(each.getAttribute(("href")));
        }
        //4. Print out how many total link

        int numberOfLinks = listOfElements.size();
        System.out.println("numberOfLinks = " + numberOfLinks);
    }

}
