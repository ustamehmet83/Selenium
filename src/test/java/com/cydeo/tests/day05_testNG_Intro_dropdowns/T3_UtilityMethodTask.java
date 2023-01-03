package com.cydeo.tests.day05_testNG_Intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T3_UtilityMethodTask {
    public static void main(String[] args){
        WebDriver driver = WebDriverFactory.getWebdriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //2. Go to https://practice.cydeo.com/radio_buttons
        driver.get("https://practice.cydeo.com/radio_buttons");
        //4. Verify “Hockey” radio button is selected after clicking.
        clickAndVerifyRadioButton(driver,"sport","hockey");
        clickAndVerifyRadioButton(driver,"sport","football");
        clickAndVerifyRadioButton(driver,"color","yellow");
    }
    public static void clickAndVerifyRadioButton(WebDriver driver,String attributeName,String idValue) {
        List<WebElement> RadioButtons=driver.findElements(By.name(attributeName));
        for (WebElement each:RadioButtons) {
            String eachId=each.getAttribute("id");
            if (eachId.equals(idValue)){
                each.click();
                System.out.println(eachId+ "is Selected() = " + each.isSelected());
                break;
            }
        }
    }
}
