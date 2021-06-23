package com.cybertek.tests.Practice;

import com.cybertek.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DoubleClick {
    @Test
           public void doubleClickIframe(){
        Driver.getDriver().get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2");
        Driver.getDriver().switchTo().frame("iframeResult");
        WebElement element = Driver.getDriver().findElement(By.xpath("//p[@id='demo']"));

        Actions actions = new Actions(Driver.getDriver());
        actions.doubleClick(element).perform();

        WebElement redElement = Driver.getDriver().findElement(By.xpath("//p[@style='color: red;']"));
        Assert.assertTrue(redElement.isDisplayed());
        Assert.assertTrue(redElement.getAttribute("style").contains("red"));
    }
}
