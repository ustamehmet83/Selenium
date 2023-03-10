package com.cydeo.tests.day04_findsElement_checkbox_radioButton;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T6_StaleElementReferenceExceptionTask {
    public static void main(String[] args) {
//        TC #6: StaleElementReferenceException Task
//        1- Open a Chrome browser
        WebDriver driver= WebDriverFactory.getWebdriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        2- Go to: https://practice.cydeo.com/abtest
        driver.get("https://practice.cydeo.com/abtest");
//        3- Locate “CYDEO” link, verify it is displayed.
        WebElement cydeoLink=driver.findElement(By.xpath("//a[text()='CYDEO']"));
        System.out.println("cydeoLink.isDisplayed() = " + cydeoLink.isDisplayed());
//        4- Refresh the page.
        driver.navigate().refresh();
//        5- Verify it is displayed, again.
        WebElement cydeoLink2=driver.findElement(By.xpath("//a[text()='CYDEO']"));
        System.out.println("cydeoLink.isDisplayed() = " + cydeoLink.isDisplayed());

    }
}
