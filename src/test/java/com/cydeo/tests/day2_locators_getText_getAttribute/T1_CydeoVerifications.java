package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_CydeoVerifications {
    public static void main(String[] args) {

        //TC #1: Cydeo practice tool verifications
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        // 2. Go to https://practice.cydeo.com
        driver.navigate().to("https://practice.cydeo.com");

        //3.Verify URL contains "cydeo"
        //Expected: cydeo
        String currentUrl=driver.getCurrentUrl();
        String expectedUrl="cydeo";
        if(currentUrl.contains(expectedUrl)){
            System.out.println("URL verification PASSED!");
        }else{
            System.out.println("URL verification not PASSED!");
        }

        //4.Verify title contains "practice"
        String currentTitle=driver.getTitle();
        String expectedTitle="Practice";
        if(currentTitle.contains(expectedTitle)){
            System.out.println("URL verification PASSED!");
        }else{
            System.out.println("URL verification not PASSED!");
        }








    }
}
