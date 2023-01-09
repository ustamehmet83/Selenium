package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_GoogleSearch {
    public static void main(String[] args)  {

        WebDriverManager.chromedriver().setup();
        //Open web browser
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://gogle.com
        driver.get("https://www.google.com");
        driver.navigate().back();

        //3- Write "apple" in search box
        //4- Press ENTEr using Keys.ENTER
        WebElement googleSearchBox= driver.findElement(By.name("q"));
        googleSearchBox.sendKeys("apple"+ Keys.ENTER);

        //4-Verify title:
        //Expected : Title should start with "apple" word
        String currentTitle=driver.getTitle();
        String expectedInTitle="apple";

        if (currentTitle.startsWith(expectedInTitle)){
            System.out.println("Title Verification is PASSED!");
        }else {
            System.out.println("Title Verification is FAİLED!");
        }







    }
}
