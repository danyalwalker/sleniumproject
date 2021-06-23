package com.cybertek.tests.Practice;

import com.cybertek.Utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ContextClick {

    @Test
    public void contextClick(){
        Driver.getDriver().get("https://the-internet.herokuapp.com/context_menu");
        WebElement boxToRightClick = Driver.getDriver().findElement(By.xpath("//div[@id='hot-spot']"));
        Actions actions = new Actions(Driver.getDriver());
        actions.contextClick(boxToRightClick).perform();

        Alert alert = Driver.getDriver().switchTo().alert();
        alert.accept();
    }
}
