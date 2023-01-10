package com.cydeo.tests.day05_testNG_Intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T5_SelectState {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        //TC #5: Selecting state from State dropdown and verifying result
        //1. Open Chrome browser
        driver = WebDriverFactory.getWebdriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }
    @AfterMethod
    public void tearDownMethod(){
        driver.close();
    }


    @Test
    public void Test()  {
        //2. Go to http://practice.cybertekschool.com/dropdown
        driver.get("https://practice.cybertekschool.com/dropdown" );
        //3. Select Illinois
        Select stateDropdown=new Select(driver.findElement(By.xpath("//select[@id='state']")));
        stateDropdown.selectByValue("IL");
        stateDropdown.selectByIndex(13);
        stateDropdown.selectByVisibleText("Illinois");
        //4. Select Virginia
        stateDropdown.selectByValue("VA");
        stateDropdown.selectByIndex(47);
        stateDropdown.selectByVisibleText("Virginia");
        //5. Select California
        stateDropdown.selectByValue("CA");
        stateDropdown.selectByIndex(4);
        stateDropdown.selectByVisibleText("California");
        //6. Verify final selected option is California.
        String actualOptionText= stateDropdown.getFirstSelectedOption().getText();
        String expectedOptionText= "California";
        Assert.assertEquals(actualOptionText,expectedOptionText,"Option text is not matching");
        //Use all Select options. (visible text, value, index)



    }


}
