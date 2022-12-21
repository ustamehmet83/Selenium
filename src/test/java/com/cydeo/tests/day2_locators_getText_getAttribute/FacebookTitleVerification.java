package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTitleVerification {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();

        WebDriver driver= new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https:///www.facebook.com");

        String currentTitle=driver.getTitle();
        String expectedTitle="Facebook - Giriş Yap veya Kaydol";
        if(currentTitle.equals(expectedTitle)){
            System.out.println("Title Verification is PASSED!: "+ expectedTitle);

        }else{
            System.out.println("Title Verification is not PASSED!");
        }
        driver.close();




    }
}
