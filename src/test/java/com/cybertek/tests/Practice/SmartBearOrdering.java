package com.cybertek.tests.Practice;

import com.cybertek.Utilities.WebDriverFactory;
import com.github.javafaker.Address;
import com.github.javafaker.Faker;
import com.github.javafaker.Name;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SmartBearOrdering {

WebDriver driver;
@BeforeClass
public void setupClass(){
    driver = WebDriverFactory.getDriver("chrome");
    driver.manage().window().maximize();
    driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
    WebElement userName = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_username']"));
    userName.sendKeys("Tester");
    WebElement passWord = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_password']"));
    passWord.sendKeys("test");
    WebElement login = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_login_button']"));
    login.click();

}

    @AfterClass
    public void tearDownClass(){
        driver.close();
    }

    @Test
    public void orderPlacing(){
//        SmartBearUtils login = new SmartBearUtils();
//        login.loginToSmartBear(WebDriverFactory.getDriver("chrome"));
        WebElement orderLink = driver.findElement(By.xpath("//a[@href='Process.aspx']"));
        orderLink.click();
        Select select = new Select(driver.findElement(By.xpath("//select[@id='ctl00_MainContent_fmwOrder_ddlProduct']")));
        select.selectByValue("FamilyAlbum");
        driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_txtQuantity']")).sendKeys("2");
        driver.findElement(By.xpath("//input[@value='Calculate']")).click();

        Faker faker = new Faker();
        Name name = faker.name();
        Address address = faker.address();
       driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_txtName']")).sendKeys(name.fullName());
       driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox2']")).sendKeys(address.streetName());
       driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox3']")).sendKeys(address.city());
       driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox4']")).sendKeys(address.state());
       driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox5']")).sendKeys("12235");

        WebElement visa = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_cardList_0']"));
        visa.click();


       driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox6']")).sendKeys("12312348234753967");
        driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox1']")).sendKeys("11/22");
       driver.findElement(By.xpath("//body//a[@id='ctl00_MainContent_fmwOrder_InsertButton']")).click();

        WebElement confirmText = driver.findElement(By.xpath("//div[@class='buttons_process']//strong"));
        String actualText = confirmText.getText();
        String expectedText = "New order has been successfully added.";
        Assert.assertEquals(actualText,expectedText);

    }


}
