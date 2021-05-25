package com.cybertek.tests.day6_testing_intro_dropdowns;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class P0_Checkbox_Practice {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.practice.cybertekschool.com/checkboxes");
        WebElement checkbox1 = driver.findElement(By.xpath("(//input[@type='checkbox'})[1]"));

        WebElement checkbox2 = driver.findElement(By.xpath("(//input[@type='checkbox'})[2]"));

        if(!checkbox1.isSelected()){
            System.out.println("checkbox 1 is not selected.Verification Passed");
        } else {
            System.out.println("checkbox 1 is selected. verification FAILED!!");

        }

        if(checkbox2.isSelected()){
            System.out.println("checkbox 2 is selected.Verification Passed");
        } else {
            System.out.println("checkbox 2 is not selected. verification FAILED!!");

        }

        Thread.sleep(2000);
        checkbox1.click();

        Thread.sleep(2000);
        checkbox2.click();

        if(checkbox1.isSelected()){
            System.out.println("checkbox 1 is  selected.Verification Passed");
        } else {
            System.out.println("checkbox 1 is not selected. verification FAILED!!");

        }

        if(!checkbox2.isSelected()){
            System.out.println("checkbox 2 is not selected.Verification Passed");
        } else {
            System.out.println("checkbox 2 is selected. verification FAILED!!");

        }
        driver.close();


    }
}
