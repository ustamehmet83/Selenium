package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class WebTableUtils {

//    . Create a new class called WebTableUtils.
//2. Create two methods to verify order

//Method #1 info:
//• Name: returnOrderDate ()
//• Return type: String
//• Arg1: WebDriver driver
//• Arg2: String costumerName
//This method should accept a costumerName and return the costumer order date
//as a String.

    public static String returnOrderDate(WebDriver driver,String costumerName){
        String locator="//table[@id='ctl00_MainContent_orderGrid']//td[.='"+costumerName+"']/following-sibling::td[3]";
        WebElement costumerOrderDate = driver.findElement(By.xpath(locator));
        return costumerOrderDate.getText();
    }
//Method #2 info:
//• Name: orderVerify ()
//• Return type: void
//• Arg1: WebDriver driver
//• Arg2: String costumerName
//• Arg3: String expectedOrderDate
//This method should accept above mentioned arguments and internally assert
//expectedOrderDate matching actualOrderDate.


    public static void orderVerify(WebDriver driver,String costumerName,String expectedOrderDate){
        String customerOrderDate=WebTableUtils.returnOrderDate(driver,costumerName);
        Assert.assertEquals(customerOrderDate, expectedOrderDate);
    }

}
