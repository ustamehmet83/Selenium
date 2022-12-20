package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T4_LibraryLoginPage {
    public static void main(String[] args) {
        //1- Open the browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 2- Go to "https://library1.cydeo.com/login.html"
        driver.get("https://library1.cydeo.com/login.html");

        //3- Enter username:
        WebElement usernameInput = driver.findElement(By.className("form-control"));
        usernameInput.sendKeys("student26@library");

        //4-Enter password:
        WebElement passwordInput = driver.findElement(By.id("inputPassword"));
        passwordInput.sendKeys("LkROUX");

        //5-Click to sign in button:
        WebElement signInButton = driver.findElement(By.tagName("button"));
        signInButton.click();

        //6- Verify displayed("Sorry, Wrong Email or Password")



    }

    }

