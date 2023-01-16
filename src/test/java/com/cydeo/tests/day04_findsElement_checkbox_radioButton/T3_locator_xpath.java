package com.cydeo.tests.day04_findsElement_checkbox_radioButton;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T3_locator_xpath {
    public static void main(String[] args) {
        //TC #6:  XPATH LOCATOR practice
        //1. Open Chrome browser
        WebDriver driver= WebDriverFactory.getWebdriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //2. Go to http://practice.cydeo.com/multiple_buttons
        driver.get("http://practice.cydeo.com/multiple_buttons");
        //3. Click on Button 1
        WebElement clickButton1=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
        clickButton1.click();
        //4. Verify text displayed is as expected:
        //Expected: “Clicked on button one!”
        String actualClickButtonText=driver.findElement(By.xpath("//p[@id='result']")).getText();
        String expectedClickButtonText="Clicked on button one!";
        if (actualClickButtonText.equals(expectedClickButtonText)) {
            System.out.println("Clicked on button one text verification is PASSED!");
        } else {
            System.out.println("Clicked on button one text verification is FAİLED!");
        }
        driver.close();

    }
}
