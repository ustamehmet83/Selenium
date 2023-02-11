package com.cydeo.tests.day13_Review_Practices;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DoubleClickTest {


    DoubleClickTestPage doubleClickTestPage=new DoubleClickTestPage();


    @Test
    public void t1_double_click_test(){
        //C #1: Double Click Test
        //1. Go to
        //https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2
        Driver.getDriver().get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2");
        //2. Switch to iframe.
        Driver.getDriver().switchTo().frame(doubleClickTestPage.iframe);
        //3. Double-click on the text “Double-click me to change my text color.”
        Actions actions=new Actions(Driver.getDriver());
        actions.doubleClick(doubleClickTestPage.doubleClickText).perform();
        //4. Assert:
        //Text’s “style” attribute value contains “red”.
        String styleText=doubleClickTestPage.red.getAttribute("style");
        Assert.assertTrue(styleText.contains("red"));
        //
        //NOTE: FOLLOW POM

    }
















}
