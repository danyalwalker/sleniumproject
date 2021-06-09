package com.cybertek.tests.Practice;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FIndElements {
    public static void main(String[] args) {
       WebDriver driver = WebDriverFactory.getDriver("chrome");
       driver.manage().window().maximize();

       driver.get("https://www.apple.com");
       driver.findElement(By.xpath("//body//a[@class = 'ac-gn-link ac-gn-link-iphone']")).click();

       List<WebElement> links = driver.findElements(By.xpath("//body//a"));
        int countLinkText = 0;
        int countNoText = 0;
       for (WebElement link : links) {
            if(!link.getText().isEmpty()){
                System.out.println(link.getText());
                countLinkText++;
            }else{
                countNoText++;
            }
        }
       int sum = countLinkText + countNoText;
        System.out.println("countLinkText = " + countLinkText);
        System.out.println("countNoText = " + countNoText);
        System.out.println("sum = " + sum);
    }
}
