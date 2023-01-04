package com.cydeo.tests.day05_testNG_Intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_SimpleDropDowns {

    WebDriver driver;
    @BeforeMethod
    public void setUpMethod(){
        driver= WebDriverFactory.getWebdriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    @Test
    public void simpleDropDownTest(){

        //TC#4: Verifying “Simple dropdown” and “State selection” dropdown
        //default values
        //1. Open Chrome browser
        //2. Go to https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown");
        //3. Verify “Simple dropdown” default selected value is correct
        //Expected: “Please select an option”
        Select simpleDropDown=new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
        WebElement currentlySelectedOption=simpleDropDown.getFirstSelectedOption();
        String actualSimpleDropDownText=currentlySelectedOption.getText();
        String expectedSimpleDropdownText="Please select an option";
        Assert.assertEquals(actualSimpleDropDownText,expectedSimpleDropdownText,"Simple dropdown tex is not matching");

        //4. Verify “State selection” default selected value is correct
        //Expected: “Select a State”

        Select stateDropdown= new Select(driver.findElement(By.xpath("//select[@id='state']")));

        WebElement actualStateDropdown=stateDropdown.getFirstSelectedOption();
        String actualStateDropdownText=actualStateDropdown.getText();
        String expectedStateDropdownText="Select a State";

        Assert.assertEquals(actualStateDropdownText,expectedStateDropdownText,"State dropdown text is not matching ");

    }



}
