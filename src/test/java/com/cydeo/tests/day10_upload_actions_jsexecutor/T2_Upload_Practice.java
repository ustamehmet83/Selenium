package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T2_Upload_Practice {

    @Test
    public void upload_Test() {
//        TC #2 Upload Test
//        1. Go to https://practice.cydeo.com/upload
        Driver.getDriver().get("https://practice.cydeo.com/upload");
//        2. Find some small file from your computer, and get the path of it.
        String path = "C:\\Users\\mehme\\OneDrive\\Desktop\\Yeni klasör\\Baza Ayak Montaj Şablonu No 1.pdf";
//        3. Upload the file.
        WebElement fileUpload = Driver.getDriver().findElement(By.id("file-upload"));
        BrowserUtils.sleep(2);
        fileUpload.sendKeys(path);
        WebElement uploadBtn = Driver.getDriver().findElement(By.xpath("//input[@id='file-submit']"));
        uploadBtn.click();
//        4. Assert:-File uploaded text is displayed on the page
        WebElement fileUploadedHeader = Driver.getDriver().findElement(By.xpath("//h3[.='File Uploaded!']"));
        fileUploadedHeader.isDisplayed();
    }

}
