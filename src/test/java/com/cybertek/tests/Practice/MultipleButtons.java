package com.cybertek.tests.Practice;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MultipleButtons {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();

        String actualText = driver.findElement(By.xpath("//p[@id='result']")).getText();
        String expectedText = "Clicked on button one!";

        if(actualText.equals(expectedText)){
            System.out.println("Text displayed");
        }else{
            System.out.println("text not displaced as expected");
        }


    }
}
