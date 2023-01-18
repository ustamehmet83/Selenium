package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.text.SimpleDateFormat;

public class RegistrationFormTask {
    @Test
    public void registration_form_test(){

        //TC#1: Registration form confirmation
//Note: Use JavaFaker OR read from configuration.properties file when possible.
//1. Open browser
        Driver.getDriver();
//2. Go to website: https://practice.cydeo.com/registration_form
        Driver.getDriver().get(ConfigurationReader.getProperty("registration.form.url"));
        Faker faker= new Faker();

// 3. Enter first name
        String fakeFirstName=faker.name().firstName();
        WebElement firstName= Driver.getDriver().findElement(By.xpath("//input[@name='firstname']"));
        firstName.sendKeys(fakeFirstName);
//4. Enter last name
        String fakeLastName=faker.name().lastName();
        WebElement lastName= Driver.getDriver().findElement(By.xpath("//input[@name='lastname']"));
        lastName.sendKeys(fakeLastName);
//5. Enter username
        String fakeUserName=faker.bothify("####????");
        WebElement userName= Driver.getDriver().findElement(By.xpath("//input[@name='username']"));
        userName.sendKeys(fakeUserName);
//6. Enter email address
        String fakeEmail=faker.internet().emailAddress();
        WebElement email=Driver.getDriver().findElement(By.xpath("//input[@name='email']"));
        email.sendKeys(fakeEmail);
//7. Enter password
        String fakePassword=faker.internet().password();
        WebElement password=Driver.getDriver().findElement(By.xpath("//input[@name='password']"));
        password.sendKeys(fakePassword);
//8. Enter phone number
        String fakePhoneNumber=faker.numerify("###-###-####");
        WebElement phoneNumber=Driver.getDriver().findElement(By.xpath("//input[@name='phone']"));
        phoneNumber.sendKeys(fakePhoneNumber);
//9. Select a gender from radio buttons
        WebElement gender=Driver.getDriver().findElement(By.xpath("//input[@value='male']"));
        gender.click();
//10. Enter date of birth
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        String dob = sdf.format(faker.date().birthday());
        WebElement birthDay=Driver.getDriver().findElement(By.xpath("//input[@name='birthday']"));
        birthDay.sendKeys( dob);
//11. Select Department/Office
        Select select= new Select(Driver.getDriver().findElement(By.xpath("//select[@name='department']")));
        select.selectByVisibleText("Department of Agriculture");
//12. Select Job Title
        Select select1=new Select(Driver.getDriver().findElement(By.xpath("//select[@name='job_title']")));
        select1.selectByVisibleText("SDET");
//13. Select programming language from checkboxes
        WebElement checkBoxC=Driver.getDriver().findElement(By.xpath("//input[@id='inlineCheckbox1']"));
        checkBoxC.click();

//14. Click to sign up button
        WebElement submitBtn=Driver.getDriver().findElement(By.xpath("//button[@id='wooden_spoon']"));
        submitBtn.click();
//15. Verify success message “You’ve successfully completed registration.” is
//    displayed.
        String expression = "//p[contains(text(),'successfully completed registration!')]";
        WebElement successMessage=Driver.getDriver().findElement(By.xpath(expression));
        successMessage.isDisplayed();

//Note:
//1. Use new Driver utility class and method
//2. User JavaFaker when possible
//3. User ConfigurationReader when it makes sense

    }

}
