package com.cydeo.tests.day06_alert_iframe_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_iframePractice {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        //TTC #4: Iframe practice
        //1. Create a new class called: T4_Iframes
        //2. Create new test and make set ups
        driver= WebDriverFactory.getWebdriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @AfterMethod
    public void tearDownMethod(){
        driver.close();
    }
    @Test
    public void iframe_Test(){
        //3. Go to: https://practice.cydeo.com/iframe
        driver.get("https://practice.cydeo.com/iframe ");
        //4. Assert: “Your content goes here.” Text is displayed.
        driver.switchTo().frame("mce_0_ifr");
        WebElement yourContentGoesHereText=driver.findElement(By.xpath("//p[.='Your content goes here.']"));
        Assert.assertTrue(yourContentGoesHereText.isDisplayed());

        //5. Assert: “An iFrame containing the TinyMCE WYSIWYG Editor”
        driver.switchTo().parentFrame();
        WebElement headerText=driver.findElement(By.xpath("//h3[.='An iFrame containing the TinyMCE WYSIWYG Editor']"));
        String actualHeaderText=headerText.getText();
        String expectedHeaderText="An iFrame containing the TinyMCE WYSIWYG Editor";
        Assert.assertEquals(actualHeaderText,expectedHeaderText,"Text is not matching");

    }








}
