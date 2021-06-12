package com.cybertek.tests.Practice;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class SmartBearLinkVerify {
    WebDriver driver;

    @BeforeClass
    public void setupClass(){
    driver = WebDriverFactory.getDriver("chrome");
    driver.manage().window().maximize();
    driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

    }

    @Test
    public void printLink(){
        WebElement userName = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_username']"));
        userName.sendKeys("Tester");
        WebElement passWord = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_password']"));
        passWord.sendKeys("test");
        WebElement login = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_login_button']"));
        login.click();
        List<WebElement> links = driver.findElements(By.xpath("//body//a"));
        System.out.println(links.size());
        for (WebElement link : links) {
            System.out.println(link.getText());
        }


    }


}
