package com.cydeo.tests.day11_actions_jsexecutor_practice;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T7_Scroll_JSExecutor {

    @Test
    public void scroll_Test(){
        //TC #7: Scroll using JavascriptExecutor
        //1- Open a Chrome browser
        //2- Go to: https://practice.cydeo.com/large
        Driver.getDriver().get("https://practice.cydeo.com/large");
        //3- Scroll down to “Cydeo” link
        JavascriptExecutor js= (JavascriptExecutor) Driver.getDriver();
        WebElement cydeoLink=Driver.getDriver().findElement(By.xpath("//a[.='CYDEO']"));
        js.executeScript("arguments[0].scrollIntoView(true);", cydeoLink);
        //4- Scroll up to “Home” link
        WebElement homeLink=Driver.getDriver().findElement(By.xpath("//a[.='Home']"));
        js.executeScript("arguments[0].scrollIntoView(true);", homeLink);
        //5- Use below provided JS method only
        //
        //JavaScript method to use : arguments[0].scrollIntoView(true)
        //
        //Note: You need to locate the links as web elements and pass them as
        //arguments into executeScript() method
        Driver.closeDriver();
    }


}
