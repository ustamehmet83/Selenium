package com.cydeo.tests.selfstudy;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Evreka {


    @Test
    public void Test1() {
        Driver.getDriver().get("https://www.amazon.com.tr");
        Driver.getDriver().findElement(By.id("sp-cc-accept")).click();

        WebElement searchBox = Driver.getDriver().findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("iPhone 13 512" + Keys.ENTER);

        WebElement iPhone13 = Driver.getDriver().findElement(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']"));
        iPhone13.click();
        WebElement stock = Driver.getDriver().findElement(By.xpath("//div[@id='availability']/span"));

        WebElement size = Driver.getDriver().findElement(By.xpath("//p[.='512 GB']"));

        WebElement price1 = Driver.getDriver().findElement(By.xpath("//span[@class='a-price-whole']"));
        WebElement price3 = Driver.getDriver().findElement(By.xpath("//span[@class='a-price-fraction']"));
        WebElement price4 = Driver.getDriver().findElement(By.xpath("//span[@class='a-price-symbol']"));

        String price = price1.getText() + "," + price3.getText() + price4.getText();

        WebElement iPhone13Text = Driver.getDriver().findElement(By.xpath("//span[@id='productTitle']"));

        WebElement color = Driver.getDriver().findElement(By.xpath("(//span[@class='selection'])[2]"));
        System.out.println(iPhone13Text.getText().substring(iPhone13Text.getText().indexOf(" ") + 1, iPhone13Text.getText().indexOf("3") + 1) + "  Size:" + size.getText());
        System.out.println("Color:" + color.getText() + "  Price:" + price);
        System.out.println("Stock:" + stock.getText());

    }
}
