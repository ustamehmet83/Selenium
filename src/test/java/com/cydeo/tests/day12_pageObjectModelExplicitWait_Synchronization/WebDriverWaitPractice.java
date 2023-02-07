package com.cydeo.tests.day12_pageObjectModelExplicitWait_Synchronization;

import com.cydeo.pages.DynamicLoad7Page;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebDriverWaitPractice {
    DynamicLoad7Page dynamicTitle;
    WebDriverWait wait;

    @BeforeMethod
    public void setUp(){
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/7");
        //creating the wait object to be able to create certain condition to wait
        wait=new WebDriverWait(Driver.getDriver(),10);
        dynamicTitle=new DynamicLoad7Page();
    }
    @Test
    public void dynamically_Loaded_Page_Elements(){
        //TC#4 : Dynamically Loaded Page Elements 7
        //1. Go to https://practice.cydeo.com/dynamic_loading/7
        //2. Wait until title is “Dynamic title”
        wait.until(ExpectedConditions.titleIs("Dynamic title"));
        //3. Assert:
        //Message “Done” is displayed.
        Assert.assertTrue(dynamicTitle.doneMessage.isDisplayed());
        //4. Assert: Image is displayed.
        Assert.assertTrue(dynamicTitle.spongeBobImage.isDisplayed());
        //Note: Follow POM


    }





}
