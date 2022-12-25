package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        driver.findElement(By.xpath("//*[@id=\"gbwa\"]/div/a")).click();
        driver.findElements(By.cssSelector("a[href='https://mail.google.com/mail/']"));

        //label[class="login-item-checkbox-label"]
        //a[class="tX9u1b"]


    }
}
