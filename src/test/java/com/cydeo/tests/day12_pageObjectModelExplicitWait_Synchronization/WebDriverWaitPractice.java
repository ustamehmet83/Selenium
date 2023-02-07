package com.cydeo.tests.day12_pageObjectModelExplicitWait_Synchronization;

import com.cydeo.pages.DynamicLoad1Page;
import com.cydeo.pages.DynamicLoad7Page;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebDriverWaitPractice {
    DynamicLoad7Page dynamicLoad7Page;
    DynamicLoad1Page dynamicLoad1Page;
    WebDriverWait wait;

    @BeforeMethod
    public void setUp() {
        //creating the wait object to be able to create certain condition to wait
        wait = new WebDriverWait(Driver.getDriver(), 10);
        dynamicLoad7Page = new DynamicLoad7Page();
    }

    @AfterMethod
    public void tearDownMethod() {
        //Driver.closeDriver();

    }

    @Test
    public void dynamic_Load_7_test() {
        //TC#4 : Dynamically Loaded Page Elements 7
        //1. Go to https://practice.cydeo.com/dynamic_loading/7
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/7");
        //2. Wait until title is “Dynamic title”
        wait.until(ExpectedConditions.titleIs("Dynamic title"));
        //3. Assert:
        //Message “Done” is displayed.
        Assert.assertTrue(dynamicLoad7Page.doneMessage.isDisplayed());
        //4. Assert: Image is displayed.
        Assert.assertTrue(dynamicLoad7Page.spongeBobImage.isDisplayed());
        //Note: Follow POM
    }

    @Test
    public void dynamic_load_1_test() {
        //TC#5 : Dynamically Loaded Page Elements 1
        //1. Go to
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/1");
        //. Click to start
        dynamicLoad1Page.startButton.click();
        //3. Wait until loading bar disappears
        wait.until(ExpectedConditions.visibilityOf(dynamicLoad1Page.username));
        //4. Assert username inputbox is displayed
        Assert.assertTrue(dynamicLoad1Page.username.isDisplayed());
        //5. Enter username: tomsmith
        dynamicLoad1Page.username.sendKeys("tomsmith");
        //6. Enter password: incorrectpassword
        dynamicLoad1Page.password.sendKeys("incorrectpassword");
        //7. Click to Submit button
        dynamicLoad1Page.submitButton.click();
        //8. Assert “Your password is invalid!” text is displayed.
        Assert.assertTrue(dynamicLoad1Page.yourPasswordIsInvalidText.isDisplayed());
        //Note: Follow POM Design Pattern
    }


}
