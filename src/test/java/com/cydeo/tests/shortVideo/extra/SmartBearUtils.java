package com.cydeo.tests.shortVideo.extra;

import com.cydeo.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SmartBearUtils extends TestBase {


    public static void loginSmartBear(WebDriver driver,String userName,String passWord){
        //http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
//3. Enter username: “Tester”
        WebElement username=driver.findElement(By.xpath("//input[@id='ctl00_MainContent_username']"));
        username.sendKeys(userName);
//4. Enter password: “test”
        WebElement password=driver.findElement(By.xpath("//input[@id='ctl00_MainContent_password']"));
        password.sendKeys(passWord);
//5. Click to Login button
        WebElement clickBtn=driver.findElement((By.xpath("//input[@id='ctl00_MainContent_login_button']")));
        clickBtn.click();
    }
    @Test
    public void Test() {
        loginSmartBear(driver,"Tester","test");
    }
}
