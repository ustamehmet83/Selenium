package com.cydeo.tests.day05_testNG_Intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T8_MultiSelectDropdownStudy {


//TC #8: Selecting value from multiple select dropdown
//2. Go to https://practice.cydeo.com/dropdown
//4. Print out all selected values.
//5. Deselect all values.

    WebDriver driver;
    @BeforeMethod
    public void setup(){
        driver= WebDriverFactory.getWebdriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @Test
    public void multiDropdownTest(){
//1. Open Chrome browser
        driver.get("https://practice.cydeo.com/dropdown ");
        WebElement multiDropdown = driver.findElement(By.xpath("//select[@name='Languages']"));
        Select selectMultiDropdown = new Select(multiDropdown);

//3. Select all the options from multiple select dropdown.
        for (int i = 0; i < selectMultiDropdown.getOptions().size(); i++) {
            selectMultiDropdown.selectByIndex(i);
        }
        for (WebElement allSelectedOption : selectMultiDropdown.getAllSelectedOptions()) {
            System.out.println("allSelectedOption.getText() = " + allSelectedOption.getText());

        }
        selectMultiDropdown.deselectAll();
    }
}
