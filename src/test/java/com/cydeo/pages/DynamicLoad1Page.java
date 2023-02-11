package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicLoad1Page {


    public DynamicLoad1Page() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath="//button[.='Start']")
    public WebElement startButton;

    @FindBy(css="div#loading")
    public WebElement loadingBar;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement username;

    @FindBy (css = "#pwd")
    public WebElement password;

    @FindBy (xpath = "//button[.='Submit']")
    public WebElement submitButton;

    @FindBy (id = "flash")
    public WebElement errorMessage;






}
