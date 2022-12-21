package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework3 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://google.com");
        driver.findElement(By.className("gb_j")).click();
        String currentTitle=driver.getTitle();
        String expectedTitleContain="Gmail";

        if(currentTitle.contains(expectedTitleContain)){
            System.out.println("Title Verification is PASSED!: "+ expectedTitleContain);

        }else{
            System.out.println("Title Verification is not PASSED!");
        }
        driver.navigate().back();
        currentTitle=driver.getTitle();
        String expectedTitle="Google";
        if(currentTitle.equals(expectedTitle)){
            System.out.println("Title Verification is PASSED!");

        }else{
            System.out.println("Title Verification is not PASSED!");
        }
        driver.close();




    }
}
