package com.cydeo.tests.shortVideo.extra;

import com.cydeo.base.TestBase;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SmartBear extends TestBase {

    @Test
    public void Test(){
        //TC #1: Smartbear software link verification
//1. Open browser
//2. Go to website:
//http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
//3. Enter username: “Tester”
        WebElement username=driver.findElement(By.xpath("//input[@id='ctl00_MainContent_username']"));
        username.sendKeys("Tester");
//4. Enter password: “test”
        WebElement password=driver.findElement(By.xpath("//input[@id='ctl00_MainContent_password']"));
        password.sendKeys("test");
//5. Click to Login button
        WebElement clickLogInBtn=driver.findElement((By.xpath("//input[@id='ctl00_MainContent_login_button']")));
        clickLogInBtn.click();
//6. Print out count of all the links on landing page
        List<WebElement> allLink=driver.findElements(By.tagName("a"));
//7. Print out each link text on this page
        for (WebElement eachLinkText : allLink) {
            System.out.println("eachLinkText = " + eachLinkText.getText());

        }
    }



    @Test
    public void Test2(){
        //TC#2: Smartbear software order placing
        //1. Open browser
        //2. Go to website:
        //http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx ");
        //3. Enter username: “Tester”
        WebElement username=driver.findElement(By.xpath("//input[@id='ctl00_MainContent_username']"));
        username.sendKeys("Tester");
        //4. Enter password: “test”
        WebElement password=driver.findElement(By.xpath("//input[@id='ctl00_MainContent_password']"));
        password.sendKeys("test");
        //5. Click on Login button
        WebElement clickLogInBtn=driver.findElement((By.xpath("//input[@id='ctl00_MainContent_login_button']")));
        clickLogInBtn.click();
        //6. Click on Order
        WebElement orderBtn=driver.findElement(By.xpath("//a[@href='Process.aspx']"));
        orderBtn.click();
        //7. Select familyAlbum from product, set quantity to 2
        Select familyAlbum=new Select(driver.findElement(By.xpath("//select[@id='ctl00_MainContent_fmwOrder_ddlProduct']")));
        familyAlbum.selectByVisibleText("FamilyAlbum");
        WebElement quantity=driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_txtQuantity']"));
        quantity.sendKeys("2");
        //8. Click to “Calculate” button
        WebElement calculateBtn=driver.findElement(By.xpath("//input[@value='Calculate']"));
        calculateBtn.click();
        //9. Fill address Info with JavaFaker
        Faker faker=new Faker();
        String fullName=faker.name().fullName();
        String street=faker.address().streetName();
        String city=faker.address().cityName();
        String state=faker.address().state();
        String zipCode=faker.address().zipCode();
        zipCode=zipCode.replaceFirst("-","");
        WebElement fullNameElmnt=driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_txtName']"));
        fullNameElmnt.sendKeys(fullName);
        WebElement streetElmnt=driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox2']"));
        streetElmnt.sendKeys(street);
        WebElement cityElmnt=driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox3']"));
        cityElmnt.sendKeys(city);
        WebElement stateElmnt=driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox4']"));
        stateElmnt.sendKeys(state);
        WebElement zipCodeElmnt=driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox5']"));
        zipCodeElmnt.sendKeys(zipCode);
        //• Generate: name, street, city, state, zip code
        //10. Click on “visa” radio button
        WebElement visaRadioBtn=driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_cardList_0']"));
        visaRadioBtn.click();
        //11. Generate card number using JavaFaker
        String creditCard=faker.numerify("123456789");
        WebElement cardNumberElmnt=driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox6']"));
        cardNumberElmnt.sendKeys(creditCard);

        WebElement expireDateElmnt=driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox1']"));
        expireDateElmnt.sendKeys("12/24");
        //12. Click on “Process”
        WebElement processBtn=driver.findElement(By.xpath("//a[@id='ctl00_MainContent_fmwOrder_InsertButton']"));
        processBtn.click();
        //13. Verify success message “New order has been successfully added.”
        WebElement verifyText=driver.findElement(By.xpath("//strong[normalize-space(text())='New order has been successfully added.']"));
        verifyText.isDisplayed();
    }
    @Test
    public void Test3(){
        //TC#3: Smartbear software order verification
        //1. Open browser and login to Smartbear software
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx ");
        //3. Enter username: “Tester”
        WebElement username=driver.findElement(By.xpath("//input[@id='ctl00_MainContent_username']"));
        username.sendKeys("Tester");
        //4. Enter password: “test”
        WebElement password=driver.findElement(By.xpath("//input[@id='ctl00_MainContent_password']"));
        password.sendKeys("test");
        //5. Click on Login button
        WebElement clickLogInBtn=driver.findElement((By.xpath("//input[@id='ctl00_MainContent_login_button']")));
        clickLogInBtn.click();
        //2. Click on View all orders
        WebElement viewAllOrder=driver.findElement(By.xpath("//a[.='View all orders']"));
        viewAllOrder.click();
        //3. Verify Susan McLaren has order on date “01/05/2010”
        WebElement susanMclarenOrderDate=driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody//td[.='Susan McLaren']/following-sibling::td[3]"));
        String expectedSusanMclarenOrderDate="01/05/2010";
        Assert.assertTrue(susanMclarenOrderDate.getText().equals(expectedSusanMclarenOrderDate));
    }










}
