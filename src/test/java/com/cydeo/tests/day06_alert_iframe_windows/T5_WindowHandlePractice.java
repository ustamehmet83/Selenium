package com.cydeo.tests.day06_alert_iframe_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class T5_WindowHandlePractice {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        //TC #5: Window Handle practice
        //1. Create a new class called: T5_WindowsPractice
        //2. Create new test and make setups
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
        //3. Go to : https://practice.cydeo.com/windows
        driver.get("https://practice.cydeo.com/windows");
        //Storing the main page's window handle as string is
        // good practice for future re-usable purposes
        String mainHandle= driver.getWindowHandle();
        System.out.println("mainHandle = " + mainHandle);
        //4. Assert: Title is “Windows”
        String actualMainPageTitle=driver.getTitle();
        String expectedMainPageTitle="Windows";
        Assert.assertEquals(actualMainPageTitle,expectedMainPageTitle);


        //5. Click to: “Click Here” link
        WebElement clickHereBtn= driver.findElement(By.xpath("//a[.='Click Here']"));
        clickHereBtn.click();
      
        //6. Switch to new Window.
        Set<String>allWindowHandles=driver.getWindowHandles();

        for (String each: allWindowHandles){
            driver.switchTo().window(each);
            System.out.println("Current title while switching windows: "+driver.getTitle());
        }


        //7. Assert: Title is “New Window”
        String actualTitle=driver.getTitle();
        String expectedTitle="New Window";
        Assert.assertEquals(actualTitle,expectedTitle);
        System.out.println("driver.getTitle() = " + driver.getTitle());
    }
























}
