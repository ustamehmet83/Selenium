package com.cydeo.tests.day05_testNG_Intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T6_SelectDate {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        //TC #6: Selecting date on dropdown and verifying
        //1. Open Chrome browser
        driver = WebDriverFactory.getWebdriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void Test() {
        //2. Go to https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown ");
        //3. Select “December 1st, 1923” and verify it is selected.
        //Select year using  : visible text
        Select dateYearDropdown = new Select(driver.findElement(By.xpath("//select[@id='year']")));
        dateYearDropdown.selectByVisibleText("1924");
        //Select month using   : value attribute
        Select dateMonthDropdown = new Select(driver.findElement(By.xpath("//select[@id='month']")));
        dateMonthDropdown.selectByValue("11");
        //Select day using : index number
        Select dateDayDropdown = new Select(driver.findElement(By.xpath("//select[@id='day']")));
        dateDayDropdown.selectByIndex(0);
        String expectedDateYearDropdown="1924";
        String expectedDateMonthDropdown="December";
        String expectedDateDayDropdown="1";

        String actualDateYearDropdown=dateYearDropdown.getFirstSelectedOption().getText();
        String actualDateMonthDropdown=dateMonthDropdown.getFirstSelectedOption().getText();
        String actualDateDayDropdown=dateDayDropdown.getFirstSelectedOption().getText();

        Assert.assertEquals(expectedDateDayDropdown,actualDateDayDropdown);
        Assert.assertEquals(expectedDateMonthDropdown,actualDateMonthDropdown);
        Assert.assertEquals(expectedDateYearDropdown,actualDateYearDropdown);








    }


}
