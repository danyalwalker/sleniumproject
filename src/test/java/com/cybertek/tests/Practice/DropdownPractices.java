package com.cybertek.tests.Practice;

import com.cybertek.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DropdownPractices {
    WebDriver driver;

    @BeforeClass
    public void setupClass(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");
    }

    @Test
    public void tc1SimpleDropdownTest(){
        Select dropdown = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
        WebElement currentlySelectedOption = dropdown.getFirstSelectedOption();
        String actualTextOfCurrentOption = currentlySelectedOption.getText();
        String expectedText = "Please select an option";
        Assert.assertTrue(actualTextOfCurrentOption.equals(expectedText));

        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));
        String actualStateSelectionText = stateDropdown.getFirstSelectedOption().getText();
        String expectedStateText = "Select a State";
        Assert.assertEquals(actualStateSelectionText,expectedStateText);
    }

    @Test
    public void tc2StateDropdownTest(){
        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));
        stateDropdown.selectByVisibleText("Illinois");

        stateDropdown.selectByValue("VA");
        stateDropdown.selectByIndex(5);

        String expectedOption = "California";
        String actualTextState = stateDropdown.getFirstSelectedOption().getText();
       Assert.assertEquals(actualTextState,expectedOption);

    }

    @Test
    public void tc3DateDropdown(){
        Select dateDropdownYear = new Select(driver.findElement(By.xpath("//select[@id='year']")));
        dateDropdownYear.selectByVisibleText("1922");
        String year = dateDropdownYear.getFirstSelectedOption().getText();

        Select dateDropdownMonth = new Select(driver.findElement(By.xpath("//select[@id='month']")));
        dateDropdownMonth.selectByValue("11");
        String month = dateDropdownMonth.getFirstSelectedOption().getText();

        Select dateDropdownDay = new Select(driver.findElement(By.xpath("//select[@id='day']")));
        dateDropdownDay.selectByIndex(0);
        String day = dateDropdownDay.getFirstSelectedOption().getText();

        String actualDate = "" + month + " " + day +", " + year;
        System.out.println("actualDate = " + actualDate);
        String expectedDate = "December 1, 1922";

        Assert.assertEquals(actualDate,expectedDate);


    }

    @Test

    public void multipleSelectDropdown(){

        Select languages = new Select(driver.findElement(By.xpath("//select[@name='Languages']")));
        List<WebElement> languagesOptions = languages.getOptions();
        for (WebElement lang : languagesOptions) {
            lang.click();
            Assert.assertTrue(lang.isSelected());
            System.out.println(lang.getText());
            lang.click();
            Assert.assertTrue(!lang.isSelected());
        }

    }

    @Test

    public void nonSelectDropdown(){
        WebElement nonSelect = driver.findElement(By.xpath("//body//a[@id='dropdownMenuLink']"));
        nonSelect.click();

       /* List<WebElement> websites = driver.findElements(By.xpath("//div[@class='dropdown-menu show']//a"));
        for (WebElement website : websites) {
            if(website.getText().equals("Facebook")){
                website.click();
            }

        }*/

        WebElement facebookLink = driver.findElement(By.xpath("//body//a[@href='https://www.facebook.com/']"));
        facebookLink.click();

        String expectedTitle = driver.getTitle();
        String actualTitle = "Facebook - Log In or Sign Up";
        Assert.assertEquals(actualTitle,expectedTitle);
    }

    @AfterClass
    public void teardownClass(){
        driver.close();
    }
}


