package com.cydeo.tests.day2_locators_getText_getAttribute;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T4_getText_cssSelector {

    public static void main(String[] args) {
        //1-Open a Chrome browser
        WebDriver driver= WebDriverFactory.getWebdriver("chrome");
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");

        //3-Verify "Reset password" button text is as expected:
        // Expected: Reset password
        //driver.findElement(By.cssSelector("button[class='login-btn']"));
        WebElement resetPasswordButton=driver.findElement(By.cssSelector("button[value='Reset password']"));
        String actualResetPasswordButtonText=resetPasswordButton.getText();
        String expectedResetPasswordButtonText="Reset password";
        if (actualResetPasswordButtonText.equals(expectedResetPasswordButtonText)) {
            System.out.println("Reset password button text verification is PASSED!");
        } else {
            System.out.println("Reset password button text verification is FAİLED!");
        }
        driver.close();









    }
}
