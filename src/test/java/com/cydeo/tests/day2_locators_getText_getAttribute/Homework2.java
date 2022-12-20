package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework2 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://zero.webappsecurity.com/login.html");

        String actualHeaderText=driver.findElement(By.tagName("h3")).getText();
        String expectedHeaderText="Log in to ZeroBank";
        if (actualHeaderText.equals(expectedHeaderText)) {
            System.out.println("Header Text verification is PASSED!");
        } else {
            System.out.println("Header Text verification is FAİLED!");
        }
    }
}
