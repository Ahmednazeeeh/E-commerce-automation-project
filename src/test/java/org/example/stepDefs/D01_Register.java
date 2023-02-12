package org.example.stepDefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_Register;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class D01_Register {
P01_Register register=new P01_Register();
    @Given("user goes to register page")
    public void user_goes_to_register_page() {
    register.registerlink.click();
    }
    @When("user selects gender type")
    public void user_enters_gender_type() {
        register.gendermale.click();
    }
    @And("user enters {string} and {string}")
    public void user_enters_and(String string1, String string2) {
        register.firstname.sendKeys(string1);
        register.lastname.sendKeys(string2);
    }
    @And("user selects date of birth")
    public void user_selects_date_of_birth() {
        Select select=new Select(register.day);
        select.selectByValue("23");
        select=new Select(register.month);
        select.selectByValue("2");
        select=new Select(register.year);
        select.selectByVisibleText("1994");


    }
    @And("user enters email{string}")
    public void userEntersEmail(String arg0) {
       /* Faker faker=new Faker();
        register.email.sendKeys(faker.internet().safeEmailAddress());*/

        register.email.sendKeys(arg0);
    }

    @And("user enters {string} and confirm it")
    public void userEntersAndConfirmIt(String arg0) {
        register.password.sendKeys(arg0);
        register.confirmpassword.sendKeys(arg0);

    }
    @And("user click register button")
    public void user_click_register_button() {
register.registerbutton.click();
    }
    @Then("account is created successfully")
    public void account_is_created_successfully() {
        SoftAssert soft=new SoftAssert();
        soft.assertTrue(register.result.getText().contains("Your registration completed"));
        String actualcolor=register.result.getCssValue("color");
        soft.assertEquals(Color.fromString(actualcolor).asHex(),"#4cb17c");
        soft.assertAll();

    }



}
