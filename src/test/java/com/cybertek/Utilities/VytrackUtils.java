package com.cybertek.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class VytrackUtils {
    public static  void loginToVytrack(){
        Driver.getDriver().get("https://qa3.vytrack.com/user/login");
        WebElement username = Driver.getDriver().findElement(By.id("prependedInput"));
        WebElement password = Driver.getDriver().findElement(By.id("prependedInput2"));
        WebElement loginButton = Driver.getDriver().findElement(By.id("_submit"));
        username.sendKeys("User36");
        password.sendKeys("UserUser123");
        loginButton.click();

    }

    public static void accessVehiclesPage() {
        BrowserUtils.sleep(2);
        WebElement fleet = Driver.getDriver().findElement(By.xpath("//li[@class='dropdown dropdown-level-1'][1]"));
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(fleet).perform();
        WebElement vehicles = Driver.getDriver().findElement(By.xpath("//span[.='Vehicles']"));
//        actions.moveToElement(vehicles).perform();
        vehicles.click();
    }
}
