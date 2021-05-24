package com.cybertek.tests.Practice;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class CheckBoxes {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();


        driver.get("http://practice.cybertekschool.com/checkboxes");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);


        WebElement checkbox1 = driver.findElement(By.xpath("//label[@id='checkbox1']/span"));
        Thread.sleep(2000);
        System.out.println(checkbox1.isSelected());

        boolean expectedResult1 = false;
        boolean actualResult1 = checkbox1.isSelected();

        if (expectedResult1 == actualResult1) {
            System.out.println("checkbox1 is not selected by default");
        } else {
            System.out.println("checkbox1 is selected by default");
        }


            WebElement checkbox2 = driver.findElement(By.xpath("//label[@id='checkbox1']/span"));
            System.out.println(checkbox2.isSelected());

            boolean expectedResult2 = true;
            boolean actualResult2 = checkbox2.isSelected();

            if (expectedResult2 == actualResult2) {
                System.out.println("checkbox2 is selected by default");
            } else {
                System.out.println("checkbox2 is not selected by default");
            }

        //click checkbox1 to select
        checkbox1.click();

        //click checkbox2 to deselect it
        checkbox2.click();

        //Confirm checkbox2 is NOT selected
        if(!checkbox2.isSelected()) {
            System.out.println("TEST PASSED: Checkbox #2 is not selected, TEST PASSED");
        } else {
            System.out.println("Test failed");
        }


    }
    }

