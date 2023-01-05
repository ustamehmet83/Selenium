package com.cydeo.tests.day05_testNG_Intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T8_MultiSelectDropdown {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
//TC #7: Selecting value from non-select dropdown
//1. Open Chrome browser
        driver = WebDriverFactory.getWebdriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDownMethod() {
        driver.close();
    }

    @Test
    public void Test() {
        //2. Go to https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown ");
        //3. Select all the options from multiple select dropdown.
        List<WebElement> allSelectElements = driver.findElements(By.tagName("select"));
        for (WebElement each : allSelectElements) {
            Select selectElement = new Select(each);
            for (int i = 0; i < selectElement.getOptions().size(); i++) {
                selectElement.selectByIndex(i);
            }
            List<WebElement> options = selectElement.getAllSelectedOptions();
            for (WebElement eachOption : options) {
                //4. Print out all selected values.
                System.out.println(eachOption.getText());
            }
            //5. Deselect all values.
        }


    }


}
