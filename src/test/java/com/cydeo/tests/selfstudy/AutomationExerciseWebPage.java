package com.cydeo.tests.selfstudy;

import com.cydeo.base.TestBase;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AutomationExerciseWebPage extends TestBase {


    @Test
    public void Test() {
//2.  Navigate to url 'http://automationexercise.com'
        driver.get("https://automationexercise.com");

// 3. Verify that home page is visible successfully

//4.  Click on 'Signup / Login' button
        WebElement signupLoginBtn = driver.findElement(By.xpath("//a[@href='/login']"));
        signupLoginBtn.click();

//5.  Verify 'New User Signup!' is visible
        //signupLoginBtn.isDisplayed();

//6.  Enter name and email address
        Faker faker=new Faker();
        String fakeFullName=faker.name().fullName();
        WebElement name = driver.findElement(By.xpath("//input[@name='name']"));
        name.sendKeys(fakeFullName);
        String fakeEmail=faker.internet().emailAddress();
        WebElement email = driver.findElement(By.xpath("(//input[@placeholder='Email Address'])[2]"));
        email.sendKeys(fakeEmail);

//7.  Click 'Signup' button
        WebElement signBtn = driver.findElement(By.xpath("//button[.='Signup']"));
        signBtn.click();

//8.  Verify that 'ENTER ACCOUNT INFORMATION' is visible
        WebElement enterAccountInformation = driver.findElement(By.xpath("//b[normalize-space(text()) ='Enter Account Information']"));
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

        String fakeFirstName=faker.name().firstName();
        WebElement firstName = driver.findElement(By.xpath("//input[@id='first_name']"));
        firstName.sendKeys(fakeFirstName);
        String fakeLastName=faker.name().lastName();
        WebElement lastName = driver.findElement(By.xpath("//input[@id='last_name']"));
        lastName.sendKeys(fakeLastName);
        String fakeCompanyName=faker.company().name();
        WebElement company = driver.findElement(By.xpath("//input[@id='company']"));
        company.sendKeys(fakeCompanyName);
        String fakeAddress1=faker.address().streetAddress()+faker.address().cityName();
        WebElement address1 = driver.findElement(By.xpath("//input[@id='address1']"));
        address1.sendKeys(fakeAddress1);
        String fakeAddress2=faker.address().state()+faker.address().zipCode();
        WebElement address2 = driver.findElement(By.xpath("//input[@id='address2']"));
        address2.sendKeys(fakeAddress2);
        Select country = new Select(driver.findElement(By.xpath("//select[@id='country']")));
        country.selectByVisibleText("Singapore");
        String fakeState=faker.address().state();
        WebElement state = driver.findElement(By.xpath("//input[@id='state']"));
        state.sendKeys(fakeState);
        String fakeCity=faker.address().city();
        WebElement city = driver.findElement(By.xpath("//input[@id='city']"));
        city.sendKeys(fakeCity);
        String fakeZipcode=faker.address().zipCode();
        WebElement zipCode = driver.findElement(By.xpath("//input[@id='zipcode']"));
        zipCode.sendKeys(fakeZipcode);
        String fakeMobileNumber=faker.numerify("\"###-###-####\"");
        WebElement mobileNumber = driver.findElement(By.xpath("//input[@id='mobile_number']"));
        mobileNumber.sendKeys(fakeMobileNumber);
//13. Click 'Create Account button'
        WebElement createAccountBtn = driver.findElement(By.xpath("//button[.='Create Account'and not(@disabled)]"));
        JavascriptExecutor executor3 = (JavascriptExecutor) driver;
        executor3.executeScript("arguments[0].click();", createAccountBtn);

//14. Verify that 'ACCOUNT CREATED!' is visible
        WebElement accountCreated = driver.findElement(By.xpath("//b[.='Account Created!']"));
        accountCreated.isDisplayed();
//15. Click 'Continue' button
//        WebElement continueBtn = driver.findElement(By.xpath("//a[.='Continue']"));
//        continueBtn.click();
        WebElement productLink = driver.findElement(By.xpath("//ul[@class='nav navbar-nav']//a[@href='/products']"));
        productLink.click();


        JavascriptExecutor js = (JavascriptExecutor) driver;

        //Removing the all google ads in the HTML by JavaScript
        js.executeScript("const arr = document.querySelectorAll('.adsbygoogle'); " +
                "arr.forEach(e => e.remove());");

        //Clicking again because navigating to the page has stopped.
        productLink.click();

//17. Click 'Delete Account' button
        WebElement deleteBtn=driver.findElement(By.xpath("//a[@href='/delete_account']"));
        deleteBtn.click();
//18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
        WebElement accountDltText=driver.findElement(By.xpath("//b[.='Account Deleted!']"));
        accountDltText.isDisplayed();
    }

}
