package com.cybertek.tests.Practice;

import com.cybertek.Utilities.BrowserUtils;
import com.cybertek.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DragNDrop {
    @Test
    public void dragNdrop(){
        WebDriver driver = Driver.getDriver();
        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        BrowserUtils.sleep(2);
        WebElement smallCircle = driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement bigCircle = driver.findElement(By.xpath("//div[@id='droptarget']"));
        Actions actions = new Actions(driver);
        actions.dragAndDrop(smallCircle,bigCircle).perform();

        String actualText = driver.findElement(By.xpath("//div[@id='droptarget']")).getText();
        String expectedText = "You did great!";
        Assert.assertEquals(actualText,expectedText);

    }
}
