package com.cydeo.tests.day13_Review_Practices;

import com.cydeo.pages.ExplicitWaitPracticePage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExplicitWaitPractice {

    ExplicitWaitPracticePage explicitWaitPracticePage = new ExplicitWaitPracticePage();

    @Test
    public void explicit_wait_practice() {

        //TC #2: Explicit wait practice
        //1- Open a Chrome browser
        //2- Go to: https://practice.cydeo.com/dynamic_controls
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_controls");
        //3- Click to “Remove” button
        explicitWaitPracticePage.removeButton.click();
        //4- Wait until “loading bar disappears”
        BrowserUtils.waitForInvisibility(explicitWaitPracticePage.loadingBar);
        //5- Verify:
        //a. Checkbox is not displayed
        try{
            Assert.assertFalse(explicitWaitPracticePage.checkbox.isDisplayed());
        }catch (NoSuchElementException n){
            Assert.assertTrue(true);
        }
        // b. “It’s gone!” message is displayed.
        String expectedText="It's gone!";
        Assert.assertTrue(explicitWaitPracticePage.message.getText().equals(expectedText));
        //
        //NOTE: FOLLOW POM

    }


}
