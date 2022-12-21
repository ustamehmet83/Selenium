package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookIncorrectVerification {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver= new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https:///www.facebook.com");
        driver.findElement(By.id("email")).sendKeys("incorrect");
        driver.findElement(By.id("pass")).sendKeys("incorrect"+ Keys.ENTER);
        Thread.sleep(3000);
        String currentTitle=driver.getTitle();
        String expectedTitle="Facebook'a Giriş Yap";
        if(currentTitle.equals(expectedTitle)){
            System.out.println("Title Verification is PASSED!: "+ expectedTitle);

        }else{
            System.out.println("Title Verification is not PASSED!");
        }
        driver.close();

    }
}

