package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.LinkedHashSet;
import java.util.Set;

public class Hovers {

    Set<String>x=new LinkedHashSet<>();

    @Test
    public void hovering_test() {
//        TC #3: Hover Test
//        1. Go to https://practice.cydeo.com/hovers
        Driver.getDriver().get("https://practice.cydeo.com/hovers ");
//        2. Hover over to first image
        Actions actions= new Actions(Driver.getDriver());
        actions.moveToElement(Driver.getDriver().findElement(By.xpath("//h5[.='name: user1']/../../img"))).perform();
//        3. Assert:
//        a. “name: user1” is displayed
        WebElement user1=Driver.getDriver().findElement(By.xpath("//h5[.='name: user1']"));
        user1.isDisplayed();
//        b. “view profile” is displayed
        WebElement viewProfil=Driver.getDriver().findElement(By.xpath("//a[@href='/users/1']"));
        viewProfil.isDisplayed();
//        4. Hover over to second image
        actions.moveToElement(Driver.getDriver().findElement(By.xpath("//h5[.='name: user2']/../../img"))).perform();
        WebElement user2=Driver.getDriver().findElement(By.xpath("//h5[.='name: user2']"));
//        5. Assert:
//        a. “name: user2” is displayed
        user2.isDisplayed();
//        b. “view profile” is displayed
        WebElement viewProfil2=Driver.getDriver().findElement(By.xpath("//a[@href='/users/2']"));
        viewProfil2.isDisplayed();
//        6. Hover over to third image
        actions.moveToElement(Driver.getDriver().findElement(By.xpath("//h5[.='name: user3']/../../img"))).perform();
//        7. Confirm:
//        a. “name: user3” is displayed
        WebElement user3=Driver.getDriver().findElement(By.xpath("//h5[.='name: user3']"));
        user3.isDisplayed();
//        b. “view profile” is displayed
        WebElement viewProfil3=Driver.getDriver().findElement(By.xpath("//h5[.='name: user3']/../../img"));
        viewProfil3.isDisplayed();

    }


}
