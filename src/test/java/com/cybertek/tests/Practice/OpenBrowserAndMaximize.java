package com.cybertek.tests.Practice;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class OpenBrowserAndMaximize {
    public static void main(String[] args) {
      // WebDriverManager.chromedriver().setup();
       //WebDriver driver = new ChromeDriver();
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();


    }


}
