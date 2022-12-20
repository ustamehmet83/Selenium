package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5_getTextGetAttribute {
    public static void main(String[] args) {
        //1- Open a Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //2- Go to: "https://practice.cydeo.com/registration_form"
        driver.get("https://practice.cydeo.com/registration_form");

        //3- Verify header text is as expected:
        String headerTextActual = driver.findElement(By.tagName("h2")).getText();
        String headerTextExpected = "Registration form";
        if (headerTextExpected.equals(headerTextActual)) {
            System.out.println("Header Text verification is PASSED!");
        } else {
            System.out.println("Header Text verification is FAİLED!");
        }

        //4- Locate "First name" input box
        String placeHolderTextActual=driver.findElement(By.name("firstname")).getAttribute("placeholder");

        //5-Verify placeHolder attribute's value is as expected: Expected: first name
        String placeHolderTextExpected="first name";
        if (placeHolderTextExpected.equals(placeHolderTextActual)) {
            System.out.println("Place Holder Text verification is PASSED!");
        } else {
            System.out.println("Place Holder Text verification is FAİLED!");
        }

driver.close();
    }



}

