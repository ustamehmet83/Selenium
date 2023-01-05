package com.cydeo.tests.day05_testNG_Intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T7_NonSelectDropdown {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        //TC #7: Selecting value from non-select dropdown
        //1. Open Chrome browser
        driver= WebDriverFactory.getWebdriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @AfterMethod
    public void tearDownMethod(){
        driver.close();
    }

    @Test
    public void Test(){
        //2. Go to https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown");
        //3. Click to non-select dropdown
        WebElement nonSelectDropdown=driver.findElement(By.xpath("//a[@id='dropdownMenuLink']"));
        nonSelectDropdown.click();
        //4. Select Facebook from dropdown
        WebElement facebookDropdown=driver.findElement(By.xpath("//a[.='Facebook']"));
        facebookDropdown.click();
        //5. Verify title is “Facebook - Log In or Sign Up”
        String actualTitle=driver.getTitle();
        String expectedTitle="Facebook - Giriş Yap veya Kaydol";

        Assert.assertEquals(actualTitle,expectedTitle,"Facebook title is not matching");
    }




}
