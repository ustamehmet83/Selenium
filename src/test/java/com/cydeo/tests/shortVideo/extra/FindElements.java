package com.cydeo.tests.shortVideo.extra;

import com.cydeo.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class FindElements extends TestBase {


    @Test
    public void Test1() {
        //TC #1: Checking the number of links on the page
        //1. Open Chrome browser
        //2. Go to https://www.openxcell.com
        driver.get("https://www.openxcell.com ");
        //3. Count the number of the links on the page and verify
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        System.out.println("allLinks.size() = " + allLinks.size());
        String numberOfLinks = "355";
        Assert.assertEquals(allLinks.size(), numberOfLinks);
        //Expected: 332
    }

    @Test
    public void Test2() {
        //TC #2: Printing out the texts of the links on the page
        //1. Open Chrome browser
        //2. Go to https://www.openxcell.com
        driver.get("https://www.openxcell.com ");
        //3. Print out all of the texts of the links on the page
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        for (WebElement link : allLinks) {
            System.out.println("link.getText() = " + link.getText());
        }



    }
    @Test
    public void Test3() {
        //TC #3: Counting the number of links that does not have text
        //1. Open Chrome browser
        //2. Go to https://www.openxcell.com
        driver.get("https://www.openxcell.com ");
        //3. Count the number of links that does not have text and verify
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        List<WebElement>emptyLinks=new ArrayList<>();
        for (WebElement link : allLinks) {
            if (link.getText().isBlank()){
                emptyLinks.add(link);
            }
        }
        //Expected: 259
        int expectedEmptyLinkNumber=259;
        Assert.assertEquals(expectedEmptyLinkNumber,emptyLinks.size());
    }

}
