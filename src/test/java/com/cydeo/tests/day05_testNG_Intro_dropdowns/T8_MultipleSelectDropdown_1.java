package com.cydeo.tests.day05_testNG_Intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T8_MultipleSelectDropdown_1 {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        //TC #8: Selecting value from multiple select dropdown
        //1. Open Chrome browser
        driver= WebDriverFactory.getWebdriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @AfterMethod
    public void tearDownMethod(){
        //driver.close();
    }
    @Test
    public void multiple_window_Test(){
        //2. Go to https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown ");
        //3. Select all the options from multiple select dropdown.
        WebElement multiDropdown= driver.findElement(By.xpath("//select[@name='Languages']"));
        Select selectMultiDropdown=new Select(multiDropdown);
        for (int i = 0; i < selectMultiDropdown.getOptions().size(); i++) {
            selectMultiDropdown.selectByIndex(i);
        }
        //4. Print out all selected values.
        for (WebElement allSelectedOption : selectMultiDropdown.getAllSelectedOptions()) {
            System.out.println("allSelectedOption = " + allSelectedOption.getText());
        }
        //5. Deselect all values.
        selectMultiDropdown.deselectAll();





    }














    }
