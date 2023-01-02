package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        WebElement menu=driver.findElement(By.xpath("//a[@class='gb_d']"));
        menu.click();
        WebElement innerFrame=driver.findElement(By.xpath("//div/div/div/div/div[3]/iframe"));
        driver.switchTo().frame(innerFrame);
        WebElement gmail = driver.findElement(By.xpath("//ul[1]/li[7]/a/div/span"));
        gmail.click();



        //label[class="login-item-checkbox-label"]
        //a[class="tX9u1b"]
        //*[@id="gbwa"]/div/a/svg


    }
}
