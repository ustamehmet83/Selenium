package com.cydeo.tests.Day04_findsElement_checkbox_radioButton;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_xpath_cssSelector {
    public static void main(String[] args) {
        //TC #1: XPATH and cssSelector Practices
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getWebdriver("chrome");
        driver.manage().window().maximize();
        //2. Go to https://practice.cydeo.com/forgot_password
        driver.get("https://practice.cydeo.com/forgot_password ");
        //3. Locate all the WebElements on the page using XPATH and/or CSS
        //locator only (total of 6)
        //a. “Home” link
        WebElement homeLink = driver.findElement(By.cssSelector("a[class='nav-link']"));
        //WebElement homeLink=driver.findElement(By.cssSelector("a[href='/']"));
        //WebElement homeLink=driver.findElement(By.linkText("Home"));
        //b. “Forgot password” header
        //WebElement header_ex2=driver.findElement(By.cssSelector("div[class='example']>h2"));
        WebElement header_ex2 = driver.findElement(By.xpath("//h2[text()='Forgot Password']"));
        //c. “E-mail” text
        //WebElement emailLabel=driver.findElement(By.cssSelector("label[for='email']"));
        //WebElement emailLabel=driver.findElement(By.xpath("//label[@for='email']"));
        WebElement emailLabel = driver.findElement(By.xpath("//label[text()='E-mail']"));

        //d. E-mail input box
        //WebElement emailBox=driver.findElement(By.cssSelector("input[type='text']"));
        //WebElement emailBox=driver.findElement(By.cssSelector("input[name='email']"));
        //WebElement emailBox=driver.findElement(By.xpath("//input[@type='text']"));
        //WebElement emailBox=driver.findElement(By.xpath("//input[@name='email']"));
        WebElement emailBox = driver.findElement(By.xpath("//input[contains(@pattern,'a-z0-9')]"));


        //e. “Retrieve password” button
        //driver.findElement(By.cssSelector("button[class='icon-2x icon-signin']"));
        //WebElement retrievePasswordButton=driver.findElement(By.xpath("//button[text()='Retrieve password']"));
        //WebElement retrievePasswordButton=driver.findElement(By.xpath("//button[@id='form_submit']"));
        //WebElement retrievePasswordButton=driver.findElement(By.xpath("//button[@class='radius']"));
        WebElement retrievePasswordButton = driver.findElement(By.xpath("//button[@type='submit']"));

        //f. “Powered by Cydeo text
        WebElement poweredByCydeoText = driver.findElement(By.cssSelector("div[style='text-align: center;']"));

        //4. Verify all web elements are displayed.
        System.out.println("homeLink.isDisplayed() = " + homeLink.isDisplayed());
        System.out.println("header_ex2.isDisplayed() = " + header_ex2.isDisplayed());
        System.out.println("emailLabel.isDisplayed() = " + emailLabel.isDisplayed());
        System.out.println("emailBox.isDisplayed() = " + emailBox.isDisplayed());
        System.out.println("retrievePasswordButton.isDisplayed() = " + retrievePasswordButton.isDisplayed());
        System.out.println("poweredByCydeoText.isDisplayed() = " + poweredByCydeoText.isDisplayed());

        driver.close();


    }
}
