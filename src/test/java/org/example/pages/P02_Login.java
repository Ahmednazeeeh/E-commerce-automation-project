package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P02_Login {
    public P02_Login (){
        PageFactory.initElements(Hooks.driver,this);
    }
    @FindBy(css="a[href=\"/login?returnUrl=%2F\"]")
    public WebElement loginlink;

    @FindBy(id="Email")
    public WebElement email;

    @FindBy(id="Password")
    public WebElement password;

    @FindBy(className="login-button")
    public WebElement loginbutton;

    @FindBy(css = "div[class=\"header-links\"] a[href=\"/customer/info\"]")
    public WebElement myaccounttab;

    @FindBy(css = "div[class=\"message-error validation-summary-errors\"]")
    public WebElement unsuccessfullogin;
}
