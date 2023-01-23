package com.cydeo.tests.day11_actions_jsexecutor_practice;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class T4_Actions_Practice {
    @Test
    public void scrollTest(){
        //TC #4: Scroll practice
        //1- Open a chrome browser
        //2- Go to: https://practice.cydeo.com/
        Driver.getDriver().get("https://practice.cydeo.com/ ");
        //3- Scroll down to “Powered by CYDEO”
        //4- Scroll using Actions class “moveTo(element)” method
        Actions actions=new Actions(Driver.getDriver());
        WebElement cydeoLink=Driver.getDriver().findElement(By.xpath("//a[@href='https://cydeo.com/']"));
        actions.moveToElement(cydeoLink).perform();
        //TC #5: Scroll practice 2
        //1- Continue from where the Task 4 is left in the same test.
        //2- Scroll back up to “Home” link using PageUP button
        //actions.sendKeys(Keys.PAGE_UP,Keys.PAGE_UP,Keys.PAGE_UP,Keys.PAGE_UP).perform();
        WebElement homeLink=Driver.getDriver().findElement(By.xpath("//a[.='Home']"));
        
        actions.sendKeys(homeLink,Keys.PAGE_UP).perform();
        Driver.closeDriver();

    }
    @Test
    public void test2(){
        Driver.getDriver().get("https://practice.cydeo.com/ ");
        Driver.closeDriver();
    }







}
