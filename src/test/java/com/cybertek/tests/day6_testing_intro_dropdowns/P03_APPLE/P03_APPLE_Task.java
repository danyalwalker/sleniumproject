package com.cybertek.tests.day6_testing_intro_dropdowns.P03_APPLE;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class P03_APPLE_Task {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.apple.com");
// storing 9 web elements including "apple" logo, and search box
        List<WebElement> headerlinks = driver.findElements(By.xpath("//ul[@class='ac-gn-list']//li/a"));
     //   Apple logo
//        Mac
////      iPad
////      iPhone
////      Watch
////      TV
////      Music
////      Support
       // search icon
      //  bag


//        3. Click to all of the headers one by one
//        a. Mac, iPad, iPhone, Watch, TV, Music, Support

        for(int eachLink = 1; eachLink < headerlinks.size()-1; eachLink++){
          System.out.println(headerlinks.get(eachLink).getText());

            headerlinks.get(eachLink).click();
            Thread.sleep(2000);
            headerlinks = driver.findElements(By.xpath("//ul[@class='ac-gn-list']//li/a"));

            //        4. Print out the titles of the each page
            System.out.println("Current title in the page " + driver.getTitle());

            //        5. Print out total number of links in each page
            List<WebElement> allLinks = driver.findElements(By.xpath("//body//a"));
            System.out.println("Total number of links in current page: " + allLinks.size());

            int linksWithNoText = 0;
            int linksWithText = 0;

            for (WebElement each : allLinks) {
                if(each.getText().isEmpty()){
                    linksWithNoText++;
                } else {
                    linksWithText++;
                }

        }
  //          6. While in each page:
//        a. Print out how many link is missing text TOTAL
            System.out.println("Current page links with No Text " + linksWithNoText);
//        b. Print out how many link has text TOTAL
            System.out.println("Current page links with Text " + linksWithText);







        }
//

    }
}
