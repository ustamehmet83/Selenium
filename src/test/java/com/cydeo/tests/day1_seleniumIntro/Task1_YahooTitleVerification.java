package com.cydeo.tests.day1_seleniumIntro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_YahooTitleVerification {
    public static void main(String[] args) {
        //tc # 1: Yahoo Title Verification


        //Verify title:
        //Expected: Yahoo

        WebDriverManager.chromedriver().setup();
        //1. Open Chrome Browser
        WebDriver driver = new ChromeDriver();
        //Go to https://www.yahoo.com
        driver.get("https://www.yahoo.com");
        // maximize the current page
        driver.manage().window().maximize();
        //3. Verify title:
        String expectedTitle="Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos";
        //actual title comes from the browser
        String currentTitle = driver.getTitle();

        if (expectedTitle.equals(currentTitle)) {
            System.out.println("Title is as expected.Verification PASSED!");
        }else{
            System.out.println("Title is NOT as expected. Verification FAILED!");
        }

    }
}
