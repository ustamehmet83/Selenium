package com.cydeo.tests.day08_Properties_Configuraiton_Reader;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_WebTableOrderVerify {
    //TC #1: Web table practice
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = WebDriverFactory.getWebdriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void Test1() {
        // 1. Go to: https://practice.cydeo.com/web-tables
        driver.get("https://practice.cydeo.com/web-tables ");
        //2. Verify Bob’s name is listed as expected.
        WebElement bobMartinName = driver.findElement(By.xpath("//td[.='Bob Martin']"));
        String bobMarinNameText = bobMartinName.getText();
        //Expected: “Bob Martin”
        Assert.assertTrue(bobMarinNameText.equals("Bob Martin"));
        //3. Verify Bob Martin’s order date is as expected
        //Expected : 12/31/2021
        WebElement bobMartinOrderDate = driver.findElement(By.xpath("//td[.='Bob Martin']/following-sibling::td[3]"));
        String bobMartinOrderDateText = bobMartinOrderDate.getText();
        Assert.assertTrue(bobMartinOrderDateText.equals("12/31/2021"));
    }


}
