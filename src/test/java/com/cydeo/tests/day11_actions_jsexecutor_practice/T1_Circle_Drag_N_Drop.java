package com.cydeo.tests.day11_actions_jsexecutor_practice;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_Circle_Drag_N_Drop {

    @Test
    public void DragDropTest(){
        //TC #: Drag and drop
        //1. Go to https://demos.telerik.com/kendo-ui/dragdrop/index
        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index ");
        JavascriptExecutor js= (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,250)");
        //2. Drag and drop the small circle to bigger circle.
        Actions actions= new Actions(Driver.getDriver());
        WebElement smallCircle=Driver.getDriver().findElement(By.id("draggable"));
        WebElement bigCircle=Driver.getDriver().findElement(By.id("droptarget"));
        //actions.dragAndDrop(smallCircle,bigCircle).perform();
        actions.clickAndHold(smallCircle).pause(2000).moveToElement(bigCircle).pause(2000).release().perform();
        //3. Assert:
        WebElement youDidGreatText=Driver.getDriver().findElement(By.xpath("//div[.='You did great!']"));
        //-Text in big circle changed to: “You did great!”
        String expectedYouDidGreatText="You did great!";
        Assert.assertEquals(youDidGreatText.getText(),expectedYouDidGreatText);

    }
}
