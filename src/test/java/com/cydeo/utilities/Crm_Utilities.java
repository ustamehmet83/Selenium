package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Crm_Utilities {
    /*

    TC #4: Create utility method
1. Create a new method for login
2. Create a method to make Task3 logic re-usable
3. When method is called, it should simply log in

This method should have at least 2 overloaded versions.

Method #1 info:
• Name: login_crm()
• Return type: void
• Arg1: WebDriver

Method #2 info:
• Name: login_crm()
• Return type: void
• Arg1: WebDriver
• Arg2: String username
• Arg3: String password

    This method will log in with helpdesk1@cybertekschool.com
    user when it is called
     */

    public static void crm_login(WebDriver driver){
        // 3. Enter valid username
        WebElement inputUsername = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        inputUsername.sendKeys("helpdesk1@cybertekschool.com ");
        // 4. Enter valid password
        WebElement inputPassword = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        inputPassword.sendKeys("UserUser");
        //5. Click to `Log In` button
        WebElement logInBtn=driver.findElement(By.xpath("//input[@value='Log In']"));
        logInBtn.click();
    }
    public static void crm_login(WebDriver driver,String username,String password){
        // 2. Go to : http://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");
        // 3. Enter valid username
        WebElement inputUsername = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        inputUsername.sendKeys(username);
        // 4. Enter valid password
        WebElement inputPassword = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        inputPassword.sendKeys(password);
        //5. Click to `Log In` button
        WebElement logInBtn=driver.findElement(By.xpath("//input[@value='Log In']"));
        logInBtn.click();
    }



}
