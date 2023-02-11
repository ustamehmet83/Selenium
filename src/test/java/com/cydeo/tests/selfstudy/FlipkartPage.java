package com.cydeo.tests.selfstudy;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FlipkartPage {

    public FlipkartPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//button[.='✕']")
    public WebElement login;

    @FindBy(xpath = "//img[@class='kJjFO0 _3DIhEh']")
    public WebElement banner;

    @FindBy(xpath = "//span[.='Electronics']")
    public WebElement Electronics;

    @FindBy(xpath = "//div[@class='_1fwVde']/a[@title='Mobiles']/../a")
    public List<WebElement>mobiles;



}
