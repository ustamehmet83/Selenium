package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_locators_getText_getAttrıbute {
    public static void main(String[] args) throws InterruptedException {
        //1- Open a Chrome browser
        WebDriver driver = WebDriverFactory.getWebdriver("chrome");
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //3- Verify "remember me" label text is as expected:
        // Expected:Remember me on this computer
        WebElement rememberMe = driver.findElement(By.className("login-item-checkbox-label"));
        String rememberMeText = rememberMe.getText();
        String expectedRememberMeLabel = "Remember me on this computer";
        if (rememberMeText.equals(expectedRememberMeLabel)) {
            System.out.println("Remember me label verification is PASSED!");
        } else {
            System.out.println("Remember me label verification is FAİLED!");
        }
        //4-Verify "forgot password" link text is as expected
        //Expected:Forgot your password?
        WebElement forgotYourPasswordLinkText = driver.findElement(By.className("login-link-forgot-pass"));
        String actualForgotYourPasswordLinkText = forgotYourPasswordLinkText.getText();
        String expectedForgotYourPasswordLinkText = "FORGOT YOUR PASSWORD?";

        if (expectedForgotYourPasswordLinkText.equals(actualForgotYourPasswordLinkText)) {
            System.out.println("Forgot your password? message verification is PASSED!");
        } else {
            System.out.println("actualForgotYourPassword = " + actualForgotYourPasswordLinkText);
            System.out.println("expectedForgotYourPassword = " + expectedForgotYourPasswordLinkText);
            System.out.println("Forgot your password? message verification is FAİLED!");
        }
        //5-Verify "forgot password" href attribute's value contains expected:
        //expected: forgot_password=yes

        String actualForgotPasswordValue = forgotYourPasswordLinkText.getAttribute("href");
        String expectedForgotPasswordValue = "forgot_password=yes";

        if (actualForgotPasswordValue.contains(expectedForgotPasswordValue)) {
            System.out.println("Forgot your password? value verification is PASSED!");
        } else {
            System.out.println("actualForgotPasswordValue = " + actualForgotPasswordValue);
            System.out.println("expectedForgotPasswordValue = " + expectedForgotPasswordValue);
            System.out.println("Forgot your password? value verification is FAİLED!");
        }
        driver.close();


    }
}
