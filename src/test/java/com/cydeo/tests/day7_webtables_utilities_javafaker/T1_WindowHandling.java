package com.cydeo.tests.day7_webtables_utilities_javafaker;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class T1_WindowHandling {





    WebDriver driver;
    //1. Create new test and make setups
    @BeforeMethod
    public void setup(){
        driver= WebDriverFactory.getWebdriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @AfterMethod
    public void tearDown(){
     driver.quit();
    }
    @Test
    public void TC1(){
        //2. Go to : https://www.amazon.com
        driver.get("https://www.amazon.com ");
        //3. Copy and paste the lines from below into your class
        ((JavascriptExecutor) driver).executeScript("window.open('https://google.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('https://etsy.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('https://facebook.com','_blank');");
        //4. Create a logic to switch to the tab where Etsy.com is open
        Set<String> allWindowHandles=driver.getWindowHandles();
        for (String windowHandle : allWindowHandles) {
            driver.switchTo().window(windowHandle);
            if (driver.getTitle().contains("Etsy")){
                break;
            }
        }
        //5. Assert: Title contains “Etsy”
        driver.getTitle();
        Assert.assertTrue(driver.getTitle().contains("Etsy"));
    }







}
