package com.cydeo.tests.shortVideo.extra;

import com.cydeo.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GasMileageCalculatorTest extends TestBase {




    @Test
    public void Test1(){
        //1. Add a new class GasMileageCalculatorTest
        //2. Go to https://www.calculator.net
        driver.get("https://www.calculator.net");
        //3. Search for “gas mileage” using search box
        WebElement searchBox=driver.findElement(By.xpath("//input[@id='calcSearchTerm']"));
        searchBox.sendKeys("gas mileage");
        WebElement searchBtn=driver.findElement(By.xpath("//span[@id='bluebtn']"));
        searchBtn.click();
        //4. Click on the “Gas Mileage Calculator” link
        WebElement gasMileageCalculatorBtn=driver.findElement(By.xpath("//a[.='Gas Mileage Calculator']"));
        gasMileageCalculatorBtn.click();
        //5. On Next page verify:
        //a. Title equals: “Gas Mileage Calculator”
        driver.getTitle();
        String expectedTitle="Gas Mileage Calculator";
        Assert.assertEquals(driver.getTitle(),expectedTitle);
        //b. “Gas Mileage Calculator” label is displayed
        WebElement gasMileageCalculatorLabel=driver.findElement(By.xpath("//h1[.='Gas Mileage Calculator']"));
        gasMileageCalculatorLabel.isDisplayed();
        //6. Locate, clear and type “7925” into “Current odometer” field
        WebElement clearBtn=driver.findElement(By.xpath("(//img[@class='clearbtn'])[2]"));
        clearBtn.click();
        WebElement currentOdometer=driver.findElement(By.xpath("//input[@id='mucodreading']"));
        currentOdometer.sendKeys("7925");
        //7. Locate, clear and type “7550” into “Previous odometer” field
        WebElement currentPreviousOdometer=driver.findElement(By.xpath("//input[@id='mupodreading']"));
        currentPreviousOdometer.sendKeys("7550");
        //8. Locate, clear and type “16” into “Gas added” field
        WebElement gasAdded=driver.findElement(By.xpath("//input[@id='mugasputin']"));
        gasAdded.sendKeys("16");
        //9. Locate, clear and type “3.55” into “Gas price” field
        WebElement gasPrice=driver.findElement(By.xpath("//input[@id='mugasprice']"));
        gasPrice.sendKeys("3.55");
        //10. Click on Calculate button
        WebElement calculate=driver.findElement(By.xpath("(//input[@value='Calculate'])[2]"));
        calculate.click();
        //11. Verify mpg value is as expected:
        WebElement verifyMpg=driver.findElement(By.xpath("(//b[contains(text(),'23.44')])"));
        Assert.assertTrue(verifyMpg.getText().contains("23.44"));
        //Expected value: “23.44 mpg”





    }
}
