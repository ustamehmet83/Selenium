package com.cydeo.tests.day13_Review_Practices;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DoubleClickTestPage {

    public DoubleClickTestPage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath="//iframe[@id='iframeResult']")
    public WebElement iframe;
    @FindBy (xpath="//p[@id='demo']")
    public WebElement doubleClickText;

    @FindBy (xpath="//p[@style='color: red;']")
    public WebElement red;








}
