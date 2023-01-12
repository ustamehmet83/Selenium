package com.cydeo.tests.day08_Properties_Configuraiton_Reader;

import com.cydeo.utilities.WebDriverFactory;
import com.cydeo.utilities.WebTableUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static com.cydeo.utilities.WebTableUtils.returnOrderDate;

public class T1_WebTableOrderVerify {
    //TC #1: Web table practice
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = WebDriverFactory.getWebdriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // 1. Go to: https://practice.cydeo.com/web-tables
        driver.get("https://practice.cydeo.com/web-tables ");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void order_name_verify_test() {
        //2. Verify Bob’s name is listed as expected.
        WebElement bobMartinCell =
                driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']"));
        String bobMarinCellText = bobMartinCell.getText();

        //Expected: “Bob Martin”
        String expectedBobMartinName = "Bob Martin";
        Assert.assertEquals(bobMarinCellText, expectedBobMartinName);

        //3. Verify Bob Martin’s order date is as expected
        //Expected : 12/31/2021
        WebElement bobMartinOrderDate =
                driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']/following-sibling::td[.='12/31/2021']"));
        String actualBobMartinOrderDateText = bobMartinOrderDate.getText();
        String expectedBobMartinOrderDateText = "12/31/2021";
        Assert.assertEquals(actualBobMartinOrderDateText, expectedBobMartinOrderDateText);
    }
    @Test
    public void order_name_verify_test2() {
        String customerOrderDate1=returnOrderDate(driver,"John Doe");
        String customerOrderDate2=returnOrderDate(driver,"Alexandra Gray");
        System.out.println("customerOrderDate1 = " + customerOrderDate1);
        System.out.println("customerOrderDate2 = " + customerOrderDate2);

    }
    @Test
    public void Test3(){
        WebTableUtils.orderVerify(driver,"Ned Stark","05/12/2021");
    }







}
