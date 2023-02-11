package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExplicitWaitPracticePage {

    public ExplicitWaitPracticePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy (xpath="//button[.='Remove']")
    public WebElement removeButton;

    @FindBy (css="#loading")
    public WebElement loadingBar;

    @FindBy (xpath="//p[@id='message']")
    public WebElement message;

    @FindBy (css="input[type='checkbox']")
    public WebElement checkbox;



    public static void main(String[] args) {

    }



















}
