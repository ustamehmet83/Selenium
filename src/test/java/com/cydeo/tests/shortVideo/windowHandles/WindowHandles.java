package com.cydeo.tests.shortVideo.windowHandles;

import com.cydeo.tests.base.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import java.util.Set;

public class WindowHandles extends TestBase {

    @Test
    public  void windowHandle() {
        driver.get("https://www.google.com");
        ((JavascriptExecutor) driver).executeScript("window.open('https://amazon.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('https://etsy.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('https://facebook.com','_blank');");
        Set<String> allWindowHandles=driver.getWindowHandles();

        System.out.println("allWindowHandles = " + allWindowHandles);
        int i=0;
        for (String windowHandle : allWindowHandles) {
            driver.switchTo().window(windowHandle);
            System.out.println("driver.getTitle() = " + driver.getTitle());
            i++;
            if (i==2){
                break;
            }
        }
    }
}
