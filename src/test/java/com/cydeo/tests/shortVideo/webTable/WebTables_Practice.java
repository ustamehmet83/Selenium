package com.cydeo.tests.shortVideo.webTable;

import com.cydeo.tests.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class WebTables_Practice extends TestBase {


    @Test
    public void webTables() {
        driver.get("https://practice.cydeo.com/tables");
        // print out Jason from row and cell number

        WebElement jasonRowCellNumber = driver.findElement(By.xpath("//table[@id='table1']//tr[3]/td[2]"));
        System.out.println("jasonRowCellNumber = " + jasonRowCellNumber.getText());

        WebElement firstName = driver.findElement(By.xpath("(//span[.='First Name'])[1]"));
        firstName.click();

        jasonRowCellNumber = driver.findElement(By.xpath("//table[@id='table1']//tr[3]/td[2]"));
        System.out.println("jasonRowCellNumber.getText() = " + jasonRowCellNumber.getText());

        // print out Jason from text

        WebElement jasonFromText = driver.findElement(By.xpath("//table[@id='table1']//td[.='Jason']"));
        System.out.println("jasonFromText.getText() = " + jasonFromText.getText());

        //print out all cells in row3

        List<WebElement> allCellsInRow3 = driver.findElements(By.xpath("//table[@id='table1']//tr[3]/td"));

        for (WebElement each : allCellsInRow3) {
            System.out.println("each.getText() = " + each.getText());

        }

// print out each and every cell values

        List<WebElement> allCellValues = driver.findElements(By.xpath("//table[@id='table1']//tr/td"));
        for (WebElement cellValue : allCellValues) {
            System.out.println("each cell text = " + cellValue.getText());
        }
        //to store the table column names into a list of string
        List<WebElement> tableColumnElements = driver.findElements(By.xpath("//table[@id='table1']//span"));
        List<String> tableColumnNames = new ArrayList<>();
        for (WebElement tableColumnName : tableColumnElements) {
            System.out.println("tableColumnName.getText() = " + tableColumnName.getText());
            tableColumnNames.add(tableColumnName.getText());
        }
        System.out.println("tableColumnNameString = " + tableColumnNames);

    }
}
