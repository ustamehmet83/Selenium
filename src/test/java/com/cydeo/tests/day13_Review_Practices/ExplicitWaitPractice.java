package com.cydeo.tests.day13_Review_Practices;

import com.cydeo.pages.DynamicControlPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExplicitWaitPractice {

    DynamicControlPage dynamicControlPage;

    @BeforeMethod
    public void setup(){
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_controls");
        dynamicControlPage = new DynamicControlPage();

    }

    @Test
    public void remove_button_test() {

        //TC #2: Explicit wait practice
        //1- Open a Chrome browser
        //2- Go to: https://practice.cydeo.com/dynamic_controls

        //3- Click to “Remove” button
        dynamicControlPage.removeButton.click();
        //4- Wait until “loading bar disappears”
        BrowserUtils.waitForInvisibility(dynamicControlPage.loadingBar);
        //5- Verify:
        //a. Checkbox is not displayed
        try{
            Assert.assertFalse(dynamicControlPage.checkbox.isDisplayed());
        }catch (NoSuchElementException n){
            Assert.assertTrue(true);
        }
        // b. “It’s gone!” message is displayed.
        String expectedText="It's gone!";
        Assert.assertTrue(dynamicControlPage.message.getText().equals(expectedText));
        //
        //NOTE: FOLLOW POM

    }

    @Test
    public void enable_button_test(){
        //TC #3: Explicit wait practice
        //1- Open a Chrome browser
        //2- Go to: https://practice.cydeo.com/dynamic_controls
        //3- Click to “Enable” button
        dynamicControlPage.enableButton.click();
        //4- Wait until “loading bar disappears”
        BrowserUtils.waitForInvisibility(dynamicControlPage.enableLoadingBar);
        //5- Verify:
        //a. Input box is enabled.
        Assert.assertTrue(dynamicControlPage.inputBox.isEnabled());
        //b. “It’s enabled!” message is displayed.
        Assert.assertTrue(dynamicControlPage.enableMessage.isDisplayed());
        String expectedEnableMessage="It's enabled!";
        String actualEnableMessage= dynamicControlPage.enableMessage.getText();
        Assert.assertTrue(expectedEnableMessage.equals(actualEnableMessage));
        //
        //NOTE: FOLLOW POM



    }


}
