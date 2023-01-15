package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T5_getText_cssSelector_xpath {
    public static void main(String[] args) {
//        TC #5: NextBaseCRM, locators, getText(), getAttribute() practice
//        1- Open a Chrome browser
        WebDriver driver = WebDriverFactory.getWebdriver("chrome");
        driver.manage().window().maximize();
//        2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");
//        3- Enter incorrect username in to login box:
        WebElement login=driver.findElement(By.cssSelector("input[name='USER_LOGIN']"));
        login.sendKeys("incorrect");

//        4- Click to `Reset password` button       //button[contains(@value,'password')]
        driver.findElement(By.xpath("//button[contains(@value,'Reset password')]")).click();

//        5- Verify “error” label is as expected
//        expected: Login or E-mail not found
        WebElement errorLabel=driver.findElement(By.cssSelector("div[class='errortext']"));
        String actualErrorLabelText=errorLabel.getText();
        String expectedErrorLabelText="Login or E-mail not found";
        if (actualErrorLabelText.equals(expectedErrorLabelText)) {
            System.out.println("Error label text verification is PASSED!");
        } else {
            System.out.println("Error label text verification is FAİLED!");
        }
        driver.close();

    }
}
