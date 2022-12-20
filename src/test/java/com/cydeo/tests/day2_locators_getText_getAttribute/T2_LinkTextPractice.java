package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_LinkTextPractice {
    public static void main(String[] args) throws InterruptedException {
        //TC #3: Back and forth navigation
        //1- Open a Chrome Browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://practice.cydeo.com
        driver.get("https://practice.cydeo.com");

        //3- Click to A/B Testing from top of the list

        WebElement abTestLink= driver.findElement(By.linkText("A/B Testing"));
        abTestLink.click();

        //4-Verify title is:
        //Expected: No A/B Test
        String currentTitle=driver.getTitle();
        String expectedTitle="No A/B Test";
        if(currentTitle.equals(expectedTitle)){
            System.out.println("Title Verification is PASSED!: "+ expectedTitle);

        }else{
            System.out.println("Title Verification is not PASSED!");
        }
        Thread.sleep(3000);

        //5- Go back to home page by using the .back()
        driver.navigate().back();

        //6-Verify title equals:
        //Expected :"Practice"
        currentTitle=driver.getTitle();
        expectedTitle="Practice";

        if(currentTitle.equals(expectedTitle)){
            System.out.println("Title Verification is PASSED!: "+expectedTitle);

        }else{
            System.out.println("Title Verification is not PASSED!");
        }


    }
}
