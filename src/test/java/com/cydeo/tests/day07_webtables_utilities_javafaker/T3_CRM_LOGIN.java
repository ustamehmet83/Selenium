package com.cydeo.tests.day07_webtables_utilities_javafaker;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Crm_Utilities;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T3_CRM_LOGIN {
    /*
    TC #3: Login scenario




6. Verify title is as expected:
Expected: Portal
USERNAME  PASSWORD
helpdesk1@cybertekschool.com  UserUser
Helpdesk2@cybertekschool.com  UserUser

     */
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        //1. Create new test and make set ups
        driver = WebDriverFactory.getWebdriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void crm_login_test() {
        // 2. Go to : http://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");
        // 3. Enter valid username
        WebElement inputUsername = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        inputUsername.sendKeys("helpdesk1@cybertekschool.com ");
        // 4. Enter valid password
        WebElement inputPassword = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        inputPassword.sendKeys("UserUser");
        //5. Click to `Log In` button
        WebElement logInBtn = driver.findElement(By.xpath("//input[@value='Log In']"));
        logInBtn.click();
        BrowserUtils.verifyTitle(driver, "My tasks");

    }

    @Test
    public void crm_login_test_2() {
        driver.get("https://login1.nextbasecrm.com/");
        Crm_Utilities.crm_login(driver);
        BrowserUtils.verifyTitle(driver, "My tasks");
    }
    @Test
    public void crm_login_test_3() {
        driver.get("https://login1.nextbasecrm.com/");
        Crm_Utilities.crm_login(driver, "helpdesk1@cybertekschool.com", "UserUser");
        BrowserUtils.verifyTitle(driver, "My tasks");
    }
}
