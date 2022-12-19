package com.cydeo.tests.day1_seleniumIntro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {

        // 1- set up chrome "browser driver"
        WebDriverManager.chromedriver().setup();

        // 2- Create instance of the Selenium Webdriver
        WebDriver driver = new ChromeDriver();

        //3- Go to web page driver.get(url)
        driver.get("https://www.tesla.com");

        //Stop code execution for 3 seconds
        Thread.sleep(3000);
        //use selenıum to navigate back
        driver.navigate().back();

        //Stop code execution for 3 seconds
        Thread.sleep(3000);
        //navigate.forward()
        driver.navigate().forward();

        //Stop code execution for 3 seconds
        Thread.sleep(3000);
        //use selenium to navigate refresh
        driver.navigate().refresh();

        //Stop code execution for 3 seconds
        Thread.sleep(3000);
        // use navigate to
        driver.navigate().to("https://www.google.com");


    }
}
