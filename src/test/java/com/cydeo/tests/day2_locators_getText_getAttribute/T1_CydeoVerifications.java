package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_CydeoVerifications {
    public static void main(String[] args) {

        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        // 2. Go to https://practice.cydeo.com
        driver.navigate().to("https://practice.cydeo.com");

        //3.Verify URL contains "cydeo"
        String currentUrl=driver.getCurrentUrl();
        if(currentUrl.contains("cydeo")){
            System.out.println("Url contains \"cydeo\"");
        }else{
            System.out.println("Url dose not contain \"cydeo\"");
        }
        //3.Verify title contains "practice"
        String currentTitle=driver.getTitle();
        if(currentTitle.contains("Practice")){
            System.out.println("Url contains \"Practice\"");
        }else{
            System.out.println("Url dose not contain \"Practice\"");
        }








    }
}
