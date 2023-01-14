package com.cydeo.tests.shortVideo.dataprovider;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DataProviderExample {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = WebDriverFactory.getWebdriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test (dataProvider="searchData")
    public void Test1(String keyword,String Title) {
       driver.get("https://www.google.com");
        WebElement searchBox=driver.findElement(By.name("q"));
        searchBox.sendKeys(keyword+ Keys.ENTER);
        String title=driver.getTitle();
        String expectedTitle=Title;
        Assert.assertEquals(title,expectedTitle);
        driver.quit();
    }


    @DataProvider(name="searchData")
    public Object[][] Testdata(){
        return new Object[][]{
                {"behiye","behiye - Google'da Ara"},
                {"nur","nur - Google'da Ara"},
                {"usta","usta - Google'da Ara"},
                {"seni","seni - Google'da Ara"},
                {"çok","çok - Google'da Ara"},
                {"seviyorum","seviyorum - Google'da Ara"},
        };

    }


}
