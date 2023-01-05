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

public  class T8_MultiSelectDropdownCorrect {

        //TC #8: Selecting value from multiple select dropdown

        WebDriver driver;

        //1. Open Chrome browser
        @BeforeMethod
        public void setup(){
            driver = WebDriverFactory.getWebdriver("chrome");
        }

        @AfterMethod
        public void teardown(){
            driver.close();
        }

        @Test
        public void multipleSelectDropdown(){

            //2. Go to https://practice.cydeo.com/dropdown
            driver.get("https://practice.cydeo.com/dropdown");

            //3. Select all the options from multiple select dropdown.
            Select multipleDropdown = new Select(driver.findElement(By.xpath("//select[@name='Languages']")));
            List<WebElement> options = multipleDropdown.getOptions();

            for (int i = 0; i < options.size(); i++) {

                multipleDropdown.selectByIndex(i);

            }

            //4. Print out all selected values.
            for (WebElement each : multipleDropdown.getAllSelectedOptions()) {
                System.out.println(each.getText());
            }

            //5. Deselect all values.
            multipleDropdown.deselectAll();

        }

    }
