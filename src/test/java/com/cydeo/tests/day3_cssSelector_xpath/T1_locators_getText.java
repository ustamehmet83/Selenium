package com.cydeo.tests.day3_cssSelector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_locators_getText {
    public static void main(String[] args) {
        //   1- Open a Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

//   2- Go to https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com");

//   3-Enter incorrect username:"incorrect"
       WebElement username=driver.findElement(By.className("login-inp"));
        username.sendKeys("incorrect");

//   4-Enter incorrect password:"incorrect"
        WebElement password=driver.findElement(By.name("USER_PASSWORD"));
        password.sendKeys("incorrect");

//   5-click to log in button
        WebElement clickLoginButton= driver.findElement(By.className("login-btn"));
        clickLoginButton.click();

//   6-Verify error message text is expected
        String currentTextMessage=driver.findElement(By.className("errortext")).getText();

//   7-Expected: incorrect login or password
        String expectedTextMessage= "Incorrect login or password";
        if (currentTextMessage.equals(expectedTextMessage)) {
            System.out.println("Error message Text verification is PASSED!");
        } else {
            System.out.println("Error message Text verification is FAİLED!");
        }
        driver.close();
    }



}
