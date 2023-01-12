package com.cydeo.tests;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SelfStudy {


    @Test
    public void Test() {
        //    Test Case 1: Register User
//1. Launch browser
        WebDriver driver = WebDriverFactory.getWebdriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//2.  Navigate to url 'http://automationexercise.com'
        driver.get("https://automationexercise.com");

// 3. Verify that home page is visible successfully

//4.  Click on 'Signup / Login' button
        WebElement signupLoginBtn = driver.findElement(By.xpath("//a[@href='/login']"));
        signupLoginBtn.click();

//5.  Verify 'New User Signup!' is visible
        //signupLoginBtn.isDisplayed();

//6.  Enter name and email address
        WebElement name = driver.findElement(By.xpath("//input[@name='name']"));
        name.sendKeys("Mehet Usta");
        WebElement email = driver.findElement(By.xpath("(//input[@placeholder='Email Address'])[2]"));
        email.sendKeys("ustame83@hotmail.com");

//7.  Click 'Signup' button
        WebElement signBtn = driver.findElement(By.xpath("//button[.='Signup']"));
        signBtn.click();


//          WebElement alert = driver.findElement(By.xpath("//p[.='Email Address already exist!']"));
//          if (alert!=null){
//            if (alert.getText().contains("already exist")) {
//              WebElement loginEmail = driver.findElement(By.xpath("//input[@data-qa='login-email']"));
//              loginEmail.sendKeys("ustame83@hotmail.com");
//              WebElement loginPassword = driver.findElement(By.xpath("//input[@data-qa='login-password']"));
//              loginPassword.sendKeys("12345");
//              WebElement LoginBtn = driver.findElement(By.xpath("//button[.='Login']"));
//              JavascriptExecutor executor2 = (JavascriptExecutor)driver;
//              executor2.executeScript("arguments[0].click();", LoginBtn);
//              WebElement deleteAccount=driver.findElement(By.xpath("//a[@href='delete_account']"));
//              deleteAccount.click();
//          }
//    }

//8.  Verify that 'ENTER ACCOUNT INFORMATION' is visible
        WebElement enterAccountInformation = driver.findElement(By.xpath("//b[text()[normalize-space() ='Enter Account Information']]"));
        enterAccountInformation.isDisplayed();

//9.  Fill details: Title, Name, Email, Password, Date of birth
        WebElement title = driver.findElement(By.xpath("//input[@id='id_gender1']"));
        title.click();
        WebElement passwordCrt = driver.findElement(By.xpath("//input[@id='password']"));
        passwordCrt.sendKeys("12345");
        Select selectDay = new Select(driver.findElement(By.xpath("//select[@id='days']")));
        selectDay.selectByIndex(2);
        Select selectMonth = new Select(driver.findElement(By.xpath("//select[@id='months']")));
        selectMonth.selectByValue("8");
        Select selectYear = new Select(driver.findElement(By.xpath("//select[@id='years']")));
        selectYear.selectByVisibleText("1983");

//10. Select checkbox 'Sign up for our newsletter!'
        WebElement checkBox = driver.findElement(By.xpath("//input[@id='newsletter']"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", checkBox);
//11. Select checkbox 'Receive special offers from our partners!'
        WebElement checkBoxReceive = driver.findElement(By.cssSelector("label[for='optin']"));
        JavascriptExecutor executor2 = (JavascriptExecutor) driver;
        executor2.executeScript("arguments[0].click();", checkBoxReceive);
//12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
        WebElement firstName = driver.findElement(By.xpath("//input[@id='first_name']"));
        firstName.sendKeys("memet");
        WebElement lastName = driver.findElement(By.xpath("//input[@id='last_name']"));
        lastName.sendKeys("uslu");
        WebElement company = driver.findElement(By.xpath("//input[@id='company']"));
        company.sendKeys("Cydeo");
        WebElement address1 = driver.findElement(By.xpath("//input[@id='address1']"));
        address1.sendKeys("address1");
        WebElement address2 = driver.findElement(By.xpath("//input[@id='address2']"));
        address2.sendKeys("address2");
        Select country = new Select(driver.findElement(By.xpath("//select[@id='country']")));
        country.selectByVisibleText("Singapore");
        WebElement state = driver.findElement(By.xpath("//input[@id='state']"));
        state.sendKeys("state");
        WebElement city = driver.findElement(By.xpath("//input[@id='city']"));
        city.sendKeys("city");
        WebElement zipCode = driver.findElement(By.xpath("//input[@id='zipcode']"));
        zipCode.sendKeys("1234");
        WebElement mobileNumber = driver.findElement(By.xpath("//input[@id='mobile_number']"));
        mobileNumber.sendKeys("kasseria");
//13. Click 'Create Account button'
        WebElement createAccountBtn = driver.findElement(By.xpath("//button[.='Create Account'and not(@disabled)]"));
        JavascriptExecutor executor3 = (JavascriptExecutor) driver;
        executor3.executeScript("arguments[0].click();", createAccountBtn);

//14. Verify that 'ACCOUNT CREATED!' is visible
        WebElement accountCreated = driver.findElement(By.xpath("//b[.='Account Created!']"));
        accountCreated.isDisplayed();
//15. Click 'Continue' button
        WebElement continueBtn = driver.findElement(By.xpath("//a[.='Continue']"));
        continueBtn.click();
//16. Verify that 'Logged in as username' is visible
        Alert alert2 = driver.switchTo().alert();
        alert2.dismiss();
//17. Click 'Delete Account' button
//18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
    }

}
