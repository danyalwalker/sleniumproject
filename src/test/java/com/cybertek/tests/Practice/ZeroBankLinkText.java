package com.cybertek.tests.Practice;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ZeroBankLinkText {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://zero.webappsecurity.com/login.html");

        WebElement link = driver.findElement(By.className("brand"));
        String actualLinkText =  link.getText();
        String expectedLinkText = "Zero Bank";

        if(expectedLinkText.equals(actualLinkText)){
            System.out.println("linkText verified");
        } else {
            System.out.println("linkText not verified");
        }

        System.out.println(link.getAttribute("href"));

        String expectedInHrefValue = "index.html";

        String actualHrefValue = link.getAttribute("href");

        if (actualHrefValue.contains(expectedInHrefValue)) {
            System.out.println("HREF attribute value verification PASSED!");
        } else {
            System.out.println("HREF attribute value verification FAILED!!!");
        }

    }
}
