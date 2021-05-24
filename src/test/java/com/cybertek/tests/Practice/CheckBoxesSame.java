package com.cybertek.tests.Practice;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class CheckBoxesSame {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        //go to webpage
        WebElement checkbox1;
        driver.get("http://practice.cybertekschool.com/checkboxes");

                //Confirm checkbox #1 is not selected by default
              checkbox1 = driver.findElement(By.xpath("//input[@type='checkbox']"));
        if (!checkbox1.isSelected()) {
            System.out.println("TEST PASSED: Checkbox #1 is NOT selected by default");
        } else {
            System.out.println("Test Failed");
        }
         Thread.sleep(3000);
        //Confirm checkbox #2 IS selected by default
        WebElement checkbox2 = driver.findElement(By.xpath("//input[@type='checkbox'][2]"));
        if (checkbox2.isSelected()) {
            System.out.println("TEST PASSED: Checkbox #2 is selected by default");
        } else {
            System.out.println("Test Failed");
        }

        //click checkbox #1 to select it
        checkbox1.click();

        //click checkbox #2 to deselect it
        checkbox2.click();

        //Confirm checkbox#2 is NOT selected
        if(!checkbox2.isSelected()) {
            System.out.println("TEST PASSED: Checkbox #2 is not selected, TEST PASSED");
        } else {
            System.out.println("Test failed");
        }

    }
    }

