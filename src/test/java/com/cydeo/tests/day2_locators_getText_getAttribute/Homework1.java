package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.etsy.com");
        WebElement etsySearchBox = driver.findElement(By.id("global-enhancements-search-query"));
        etsySearchBox.sendKeys("wooden spoon" + Keys.ENTER);
        String expectedTitle = "Wooden spoon - Etsy";
        String currentTitle = driver.getTitle();
        if (currentTitle.equals(expectedTitle)) {
            System.out.println("Title verification is PASSED!");
        } else {
            System.out.println("Title verification is FAİLED!!");
        }
    }


}

