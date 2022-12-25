package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        //driver.get("https://www.yahoo.com/");
        //driver.findElement(By.xpath("//*[@id=\"ybar-sbq\"]")).sendKeys("ahmet");

        //WebElement googleSearchBox = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
        //googleSearchBox.sendKeys("yahoo" + Keys.ENTER);

        //WebElement youtubeButton = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div[1]/a/h3"));
        //youtubeButton.click();

        driver.get("https://youtube.com/");
        WebElement searchBox = driver.findElement(By.xpath("//input[@id=\"search\"]"));
        //searchBox.click();
        searchBox.sendKeys("kaya");
        searchBox.sendKeys(Keys.ENTER);
        driver.findElement(By.id("movie_player")).click();

        driver.findElement(By.xpath(""));


    }
}
