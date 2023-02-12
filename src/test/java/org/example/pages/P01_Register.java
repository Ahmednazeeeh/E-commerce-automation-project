package org.example.pages;


import org.example.stepDefs.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P01_Register {
    public P01_Register(){
        PageFactory.initElements(Hooks.driver,this);
    }
    @FindBy(className ="ico-register")
   public WebElement registerlink;

    @FindBy(id ="gender-male")
    public WebElement gendermale;

    @FindBy(id="FirstName")
    public WebElement firstname;

    @FindBy(id="LastName")
    public WebElement lastname;

    @FindBy(name="DateOfBirthDay")
    public WebElement day;

    @FindBy(name="DateOfBirthMonth")
    public WebElement month;

    @FindBy(name="DateOfBirthYear")
    public WebElement year;

    @FindBy(id="Email")
    public WebElement email;

    @FindBy(id="Password")
    public WebElement password;


    @FindBy(id="ConfirmPassword")
    public WebElement confirmpassword;


    @FindBy(name="register-button")
    public WebElement registerbutton;

    @FindBy(className= "result")
    public WebElement result;


}
