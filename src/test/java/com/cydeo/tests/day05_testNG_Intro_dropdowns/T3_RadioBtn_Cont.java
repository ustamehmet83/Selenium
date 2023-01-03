package com.cydeo.tests.day05_testNG_Intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T3_RadioBtn_Cont {
    public static void main(String[] args) {
        //TC #2: Radiobutton handling
        //1. Open Chrome browser
        WebDriver driver= WebDriverFactory.getWebdriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //2. Go to https://practice.cydeo.com/radio_buttons
        driver.get("https://practice.cydeo.com/radio_buttons");
        //3. Click to “Hockey” radio button
        WebElement hockeyBtn=driver.findElement(By.xpath("//input[@id='hockey']"));
    }
}
