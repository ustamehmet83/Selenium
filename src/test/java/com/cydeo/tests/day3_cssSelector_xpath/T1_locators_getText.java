package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_locators_getText {
    public static void main(String[] args) {
        //   1- Open a Chrome browser
        WebDriver driver = WebDriverFactory.getWebdriver("chrome");
        driver.manage().window().maximize();

//   2- Go to https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com");

//   3-Enter incorrect username:"incorrect"
       WebElement inputUsername=driver.findElement(By.className("login-inp"));
        inputUsername.sendKeys("incorrect");

//   4-Enter incorrect password:"incorrect"
        WebElement inputPassword = driver.findElement(By.name("USER_PASSWORD"));
        inputPassword.sendKeys("incorrect");

//   5-click to log in button
        WebElement loginButton= driver.findElement(By.className("login-btn"));
        loginButton.click();

//   6-Verify error message text is expected
        WebElement errorMessage = driver.findElement(By.className("errortext"));
        String actualErrorMessage=errorMessage.getText();

//   7-Expected: incorrect login or password
        String expectedErrorMessage= "Incorrect login or password";
        if (actualErrorMessage.equals(expectedErrorMessage)) {
            System.out.println("Error message verification is PASSED!");
        } else {
            System.out.println("Error message verification is FAİLED!");
        }
        driver.close();
    }



}
