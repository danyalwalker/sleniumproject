package com.cybertek.tests.Practice;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MerriamWebster {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.merriam-webster.com");

        List <WebElement> links = driver.findElements(By.xpath("//body//a"));
        int emptyLink = 0;
        int notEmptyLink = 0;
        for (WebElement link : links) {
            if(link.getText().isEmpty()){
                emptyLink++;

            } else{
                notEmptyLink++;
                System.out.println(link.getText());
            }

        }
        System.out.println(emptyLink);
        System.out.println(notEmptyLink);
        System.out.println(links.size());

    }
}
