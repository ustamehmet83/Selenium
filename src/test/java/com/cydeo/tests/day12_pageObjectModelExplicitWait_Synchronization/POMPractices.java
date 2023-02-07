package com.cydeo.tests.day12_pageObjectModelExplicitWait_Synchronization;

import com.cydeo.pages.LibraryLoginPages;
import com.cydeo.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class POMPractices {
    LibraryLoginPages libraryLoginPages;
    @BeforeMethod
    public void setupMethod(){
        Driver.getDriver().get("https://library1.cydeo.com");
        libraryLoginPages=new LibraryLoginPages();
    }
    @AfterMethod
    public void tearDownMethod(){
        Driver.closeDriver();
    }

    @Test
    public void required_field_error_message_test(){

        //TC #1: Required field error message test
        //1- Open a Chrome browser
        //2- Go to: https://library1.cydeo.com
        //3- Do not enter any information
        //4- Click to “Sign in” button
        libraryLoginPages.signInButton.click();
        //5- Verify expected error is displayed:
        //Expected: This field is required.
        Assert.assertTrue(libraryLoginPages.fieldRequiredErrorMessage.isDisplayed());
        //NOTE: FOLLOW POM DESIGN PATTERN

    }



    @Test
    public void invalid_email_format_error_message_test() throws InterruptedException {
        //TC #2: Invalid email format error message test
        //1- Open a Chrome browser
        //2- Go to: https://library1.cydeo.com
        //3- Enter invalid email format
        libraryLoginPages.inputUsername.sendKeys("somethingwrong");
        libraryLoginPages.signInButton.click();
        //4- Verify expected error is displayed:
        Assert.assertTrue(libraryLoginPages.enterValidEmailErrorMessage.isDisplayed());
        //Expected: Please enter a valid email address.
        //
        //NOTE: FOLLOW POM DESIGN PATTERN
    }

    @Test
    public void library_negative_login_test(){
        //TC #3: Library negative login
        //1- Open a Chrome browser
        //2- Go to: https://library1.cydeo.com
        //3- Enter incorrect username or incorrect password
        libraryLoginPages.inputUsername.sendKeys("wrong@username.com");
        libraryLoginPages.inputPassword.sendKeys("somethingwrong");
        libraryLoginPages.signInButton.click();
        //4- Verify title expected error is displayed:
        Assert.assertTrue(libraryLoginPages.wrongEmailOrPasswordErrorMessage.isDisplayed());
        //Expected: Sorry, Wrong Email or Password
        //
        //NOTE: FOLLOW POM DESIGN PATTERN
    }


















}
