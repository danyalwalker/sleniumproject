package com.cybertek.tests.day10_webtable_properties_practices;

import com.cybertek.Utilities.ConfigurationReader;
import com.cybertek.Utilities.TableUtils;
import com.cybertek.tests.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TableTasks extends TestBase {

    @Test
    public void task3_return_tims_due_amount(){
        String Url = ConfigurationReader.getProperty("dataTablesUrl");
        driver.get(Url);
        //1.	Open browser and go to: http://practice.cybertekschool.com/tables#edit
        //2.	Locate first table and verify Tim has due amount of “$50”
        //
        //Note: Create locator for Tim that will be dynamic and doesn’t care in which row Tim is.
        WebElement timsDueAmountCell = driver.findElement(By.xpath("//table[@id='table1']//td[.='Tim']/../td[4]"));

        System.out.println("timsDueAmountCell = " + timsDueAmountCell.getText());

        String actualTimResult = timsDueAmountCell.getText();
        String expectedTimResult = "$50.00";

        Assert.assertEquals(actualTimResult, expectedTimResult, "Tim's cell is not returning as expected.");



        //Note: Create locator for Tim that will be dynamic and doesn’t care in which row Tim is.
    }

    @Test
    public void task4_verify_order_method(){
        String Url = ConfigurationReader.getProperty("dataTablesUrl");
        driver.get(Url);
        TableUtils.verifyOrder(driver, "Tim");
    }

    @Test
    public void task5_print_all_names_and_emails(){
        String Url = ConfigurationReader.getProperty("dataTablesUrl");
        driver.get(Url);

    }
}
