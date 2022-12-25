package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_getAttribute_cssSelector {
    public static void main(String[] args) {
        //1- Open a Chrome browser
        WebDriver driver = WebDriverFactory.getWebdriver("chrome");
        driver.manage().window().maximize();
        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");
        //3- Verify "Log in" button next is a expected:
        //Expected: Login
        // LOCATING THE SAME WEB ELEMENT USING DIFFERENT ATTRIBUTE VALUES
        //                            tagName[attrıbute='value']
        //                            input[class='login-btn']
        //WebElement logInButton = driver.findElement(By.cssSelector("input.login-btn"));        //tagName.className
        //WebElement logInButton = driver.findElement(By.cssSelector("input[type='submit']"));
        //WebElement logInButton = driver.findElement(By.cssSelector("input[class='login-btn']"));
        WebElement logInButton = driver.findElement(By.cssSelector("input[value='Log In']"));  //tagName.[attribute='value']
        String actualLogInValue = logInButton.getAttribute("value");
        String expectedLogInValue = "Log In";

        if (actualLogInValue.contains(expectedLogInValue)) {
            System.out.println("Log In value verification is PASSED!");
        } else {
            System.out.println("Log In value verification is FAİLED!");
        }
        driver.close();





    }
}
