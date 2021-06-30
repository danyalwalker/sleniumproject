package com.cybertek.OfiiceHours.day06;

import com.cybertek.Utilities.BrowserUtils;
import com.cybertek.Utilities.ConfigurationReader;
import com.cybertek.Utilities.Driver;
import com.cybertek.pages.AmazonDashboardPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class hatsForMen {

    @Test
    public void findHats(){
        AmazonDashboardPage amazonDashboardPage = new AmazonDashboardPage();
        Driver.getDriver().get(ConfigurationReader.getProperty("amazonUrl"));
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        amazonDashboardPage.searchBox.sendKeys(ConfigurationReader.getProperty("searchHats"));
        amazonDashboardPage.submitButton.click();

        WebElement firstHat = Driver.getDriver().findElement(By.xpath("//div[@id='search']//a//img[1]"));
        firstHat.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[id='a-autoid-10-announce']")));

        WebElement amountSelect = Driver.getDriver().findElement(By.cssSelector("[id='a-autoid-10-announce']"));
        amountSelect.click();

        WebElement selectTwo = Driver.getDriver().findElement(By.xpath("//a[@id='quantity_1']"));
        selectTwo.click();

        WebElement addToCart = Driver.getDriver().findElement(By.cssSelector("[id='add-to-cart-button']"));
        addToCart.click();

        WebElement updateCart = Driver.getDriver().findElement(By.cssSelector("[id='hlb-view-cart-announce']"));
        updateCart.click();

        WebElement updateAmount = Driver.getDriver().findElement(By.cssSelector("[id='a-autoid-0-announce']"));
        updateAmount.click();

        WebElement selectOne = Driver.getDriver().findElement(By.cssSelector("[id='dropdown1_1']"));
        selectOne.click();

        //wait.until(ExpectedConditions.);
        BrowserUtils.sleep(2);
        String actualPrice = Driver.getDriver().findElement(By.cssSelector("[id='sc-subtotal-amount-activecart']")).getText();
        System.out.println(actualPrice);
        String expectedPrice =" $25.99";
        Assert.assertEquals(actualPrice,expectedPrice);

    }

}
