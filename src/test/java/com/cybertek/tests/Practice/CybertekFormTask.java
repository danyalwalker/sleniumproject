package com.cybertek.tests.Practice;

import com.cybertek.Utilities.ConfigurationReader;
import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CybertekFormTask {
    WebDriver driver;
    @BeforeClass
    public void setUpClass(){
        driver = WebDriverFactory.getDriver(ConfigurationReader.getProperty("browser"));
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/registration_form");
    }
//    @AfterClass
//    public void teardownClass(){
//        driver.close();
//    }

    @Test
    public void RegistrationForm(){
       driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Ekrem");
       driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Walker");
       driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Ekremfast");
       driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Alaluyla");
       driver.findElement(By.xpath("//input[@name='email']")).sendKeys("ekremfast@gmail.com");
       driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("917-234-5678");
       driver.findElement(By.xpath("//input[@name='gender']")).click();
        driver.findElement(By.xpath("//input[@name='birthday']")).sendKeys("06/14/2000");
        Select select = new Select(driver.findElement(By.xpath("//select[@name='department']")));
        select.selectByValue("MO");
        String actualOptionText = select.getFirstSelectedOption().getText();
        System.out.println(actualOptionText);
        Select select1 = new Select(driver.findElement(By.xpath("//select[@name='job_title']")));
        select1.selectByVisibleText("Project Manager");
        System.out.println(select1.getFirstSelectedOption().getText());

        driver.findElement(By.xpath("//input[@id='inlineCheckbox2']")).click();
        driver.findElement(By.xpath("//button[@id='wooden_spoon']")).click();

        String actualtext = driver.findElement(By.xpath("//div[@class='alert alert-success']/p")).getText();
        String expectedText = "You've successfully completed registration!";
        Assert.assertEquals(actualtext,expectedText);
    }
}
