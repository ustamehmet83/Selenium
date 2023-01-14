package com.cydeo.tests.shortVideo.actions;

import com.cydeo.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class P03_ActionsClass extends TestBase {

    @Test
    public void dragAndDropTest(){
        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        WebElement smallCircle=driver.findElement(By.id("draggable"));
        WebElement bigCircle=driver.findElement(By.id("droptarget"));

        Actions actions=new Actions(driver);

        //actions.dragAndDrop(smallCircle,bigCircle).perform();

        actions.moveToElement(smallCircle).pause(1000).clickAndHold().moveToElement(bigCircle)
                .pause(1000).release().perform();


        Assert.assertEquals(bigCircle.getText(),"You did great!");

    }
    @Test
    public void hoverTest(){
        driver.get("https://practice.cydeo.com/hovers");
        WebElement img1=driver.findElement(By.xpath("(//img)[1]"));
        WebElement img1Text=driver.findElement(By.xpath("//h5[.='name: user1']"));

        Actions actions=new Actions(driver);
        actions.moveToElement(img1).perform();
        Assert.assertTrue(img1Text.isDisplayed());

        List<WebElement> images=driver.findElements(By.tagName("img"));
        for (WebElement image : images) {
            actions.moveToElement(image).pause(2000).perform();
        }






    }
}
