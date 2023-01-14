package com.cydeo.tests.day05_testNG_Intro_dropdowns;

import com.cydeo.base.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_Selenium extends TestBase {

    @Test
    public void selenium_test() {

        //Get "https://google.com"
        driver.get("https://google.com");

        //Assert: title is "Google"

        String actualTitle = driver.getTitle();
        String expectedTitle = "Google";

        Assert.assertEquals(actualTitle, expectedTitle, "Title is not matching here.");


    }


}
