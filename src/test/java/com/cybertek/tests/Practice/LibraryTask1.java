package com.cybertek.tests.Practice;

import com.cybertek.Utilities.BrowserUtils;
import com.cybertek.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class LibraryTask1 {



       @Test
       public void softwareLinkVerify(){
           WebDriver driver = Driver.getDriver();
           driver.get("http://library2.cybertekschool.com/login.html");
           driver.findElement(By.xpath("//input[@id='inputEmail']")).sendKeys("student11@library");
           driver.findElement(By.xpath("//input[@id='inputPassword']")).sendKeys("tScBPCUr");
           driver.findElement(By.xpath("//button[@class='btn btn-lg btn-primary btn-block']")).click();
//           LibraryUtils.loginToLibrary(driver);
           BrowserUtils.sleep(2);
           List<WebElement> links = driver.findElements(By.xpath("//body//a"));
           System.out.println(links.size());
           for (WebElement link : links) {
               System.out.println(link.getText());
           }
       }


}
