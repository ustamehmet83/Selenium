package com.cydeo.tests.selfstudy;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Flipkart {


     FlipkartPage flipkartPage=new FlipkartPage();

    @Test
    public void test(){
        Driver.getDriver().get("https://www.flipkart.com");
        flipkartPage.login.click();
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.visibilityOf(flipkartPage.banner));
        JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
        executor.executeScript("arguments[0].click();", flipkartPage.banner);
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(flipkartPage.Electronics).perform();
        for (int i = 1; i < flipkartPage.mobiles.size(); i++) {
            System.out.println(i + ". " + flipkartPage.mobiles.get(i).getText());
        }



    }
}
