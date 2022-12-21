package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework4 {
    public static void main(String[] args) {
        //TC#4:Practice Cydeo- Class Locator practice
        //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        //2-Go to : https://practice.cydeo.com/inputs
        driver.get("https://practice.cydeo.com/inputs");

        //3-Click to "Home" Link
        driver.findElement(By.className("nav-link")).click();

        //4- Verify title is as expected:
        //Expected:Practice
        String currentTitle=driver.getTitle();
        String expectedTitle="Practice";
        if(currentTitle.equals(expectedTitle)){
            System.out.println("Title Verification is PASSED!: "+ expectedTitle);

        }else{
            System.out.println("Title Verification is not PASSED!");
        }
        driver.close();
    }
}
