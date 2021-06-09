package com.cybertek.tests.Practice.GitPractice;

import com.cybertek.Utilities.BrowserUtils;
import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FindElementsApple {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.apple.com");
        
        List<WebElement> links = driver.findElements(By.xpath("//ul[@class = 'ac-gn-list']//li//a"));
        for (int i=1; i<links.size()-2; i++) {
            System.out.println(links.get(i).getText());
            links.get(i).click();
            BrowserUtils.sleep(2);
            links = driver.findElements(By.xpath("//ul[@class = 'ac-gn-list']//li//a"));
            List < WebElement > linkers =  driver.findElements(By.xpath("//body//a"));
                    int countTotal = 0;
                            int countNoLinks = 0;
            int countLinks = 0;
            for (WebElement linker : linkers) {
                countTotal++;
                if(linker.getText().isEmpty()){
                    countNoLinks++;
                }else {
                    countLinks++;
                }

            }
            System.out.println("countLinks = " + countLinks);
            System.out.println("countNoLinks = " + countNoLinks);
            System.out.println("countTotal = " + countTotal);
        }
        
    }
}
