package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_Login;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

public class D02_Login {

    P02_Login login=new P02_Login();
    @Given("user go to login page")
    public void user_go_to_login_page() {
        login.loginlink.click();
    }
    @When("user login with valid {string} and {string}")
    public void user_login_with_and(String string, String string2) {
     login.email.sendKeys(string);
     login.password.sendKeys(string2);
    }
    @And("user press on login button")
    public void user_press_on_login_button() {
        login.loginbutton.click();
    }
    @Then("user login to the system successfully")
    public void user_login_to_the_system_successfully() {
        SoftAssert soft=new SoftAssert();
        soft.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/");
        soft.assertTrue(login.myaccounttab.isDisplayed());
        soft.assertAll();

    }

    @When("user login with invalid {string} and {string}")
    public void userLoginWithInvalidAnd(String arg0, String arg1) {
        login.email.sendKeys(arg0);
        login.password.sendKeys(arg1);

    }

    @Then("user could not login to the system")
    public void userCouldNotLoginToTheSystem() {
        SoftAssert soft=new SoftAssert();
       soft.assertTrue(login.unsuccessfullogin.getText().contains("Login was unsuccessful."));
       String actualcolor=login.unsuccessfullogin.getCssValue("color");
       soft.assertEquals(Color.fromString(actualcolor).asHex(),"#e4434b");
       soft.assertAll();
    }
}
