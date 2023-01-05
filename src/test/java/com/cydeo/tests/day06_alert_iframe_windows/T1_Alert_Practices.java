package com.cydeo.tests.day06_alert_iframe_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_Alert_Practices {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        //TC #1: Information alert practice
        //1. Open browser
        driver= WebDriverFactory.getWebdriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @AfterMethod
    public void tearDownMethod(){
        driver.close();
    }
    @Test
    public void alert_test1(){
        //2. Go to website: http://practice.cydeo.com/javascript_alerts
        driver.get("http://practice.cydeo.com/javascript_alerts ");
        //3. Click to “Click for JS Alert” button
        WebElement jsAlertBtn=driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        jsAlertBtn.click();
        //4. Click to OK button from the alert
        Alert alert=driver.switchTo().alert();
        alert.dismiss();
        //5. Verify “You successfully clicked an alert” text is displayed.

        WebElement actualAlert=driver.findElement(By.xpath("//p[.='You successfully clicked an alert']"));
        String expectedAlertText="You successfully clicked an alert";
        String actualAlertText=actualAlert.getText();
        Assert.assertEquals(actualAlertText,expectedAlertText,"Alert tex is not matching");
    }
    @Test
    public void alert_test2(){
        //2. Go to website: http://practice.cydeo.com/javascript_alerts
        driver.get("http://practice.cydeo.com/javascript_alerts ");
        //3. Click to “Click for JS Confirm” button
        WebElement jsConfirmBtn=driver.findElement(By.xpath("//button[.='Click for JS Confirm']"));
        jsConfirmBtn.click();
        //4. Click to OK button from the alert
        Alert alert=driver.switchTo().alert();
        alert.accept();
        //5. Verify “You clicked: Ok” text is displayed.
        WebElement actualAlert=driver.findElement(By.xpath("//p[.='You clicked: Ok']"));
        String expectedAlertText="You clicked: Ok";
        String actualAlertText=actualAlert.getText();
        Assert.assertEquals(actualAlertText,expectedAlertText,"Alert text is not matching");
    }
    @Test
    public void alert_test3(){
        //2. Go to website: http://practice.cydeo.com/javascript_alerts
        driver.get("http://practice.cydeo.com/javascript_alerts ");
        //3. Click to “Click for JS Prompt” button
        WebElement jsPromptBtn=driver.findElement(By.xpath("//button[.='Click for JS Prompt']"));
        jsPromptBtn.click();
        //4. Send “hello” text to alert
        Alert alert=driver.switchTo().alert();
        alert.sendKeys("hello");
        //5. Click to OK button from the alert
        alert.accept();
        //6. Verify “You entered:  hello” text is displayed.
        WebElement actualAlert=driver.findElement(By.xpath("//p[.='You entered: hello']"));
        String expectedAlertText="You entered: hello";
        String actualAlertText=actualAlert.getText();
        Assert.assertEquals(actualAlertText,expectedAlertText,"Alert text is not matching");
    }














}
