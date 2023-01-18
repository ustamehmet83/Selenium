package com.cydeo.tests.day08_Properties_Configuraiton_Reader;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T4_Config_Practice {
//    WebDriver driver;
//    @BeforeMethod
//    public void setup(){
//        //We are getting the browserType dynamıcally from our configuration.properties file.
//        String browserType= ConfigurationReader.getProperty("browser");
//        driver= WebDriverFactory.getWebdriver(browserType);
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//    }


    @Test
    public void google_search_test(){

        Driver.getDriver().get("https://www.google.com");
        //3- Write “apple” in search box
        WebElement googleSearchBox= Driver.getDriver().findElement(By.xpath("//input[@name='q']"));
        googleSearchBox.sendKeys("apple"+ Keys.ENTER);
        //4- Verify title:
        String actualTitle=Driver.getDriver().getTitle();
        //Expected: apple - Google Search
        String expectedTitle="apple - Google'da Ara";
        Assert.assertEquals(actualTitle,expectedTitle);

    }

}
