package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class D06_homeSliders {
P03_homePage homePage=new P03_homePage();

    @When("user selects s{int} ultra slider")
    public void userSelectsSUltraSlider(int arg0)  {
        homePage.s22ultra.click();
        WebDriverWait wait =new WebDriverWait(Hooks.driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.urlContains("https://demo.nopcommerce.com/"));
    }
    @Then("user should be directed to s{int} ultra page")
    public void userShouldBeDirectedToSUltraPage(int arg0) {
       String url= Hooks.driver.getCurrentUrl();
       Assert.assertEquals(url,"https://demo.nopcommerce.com/Galaxy-S22-Ultra");
    }

    @When("user selects Iphone {int} slider")
    public void userSelectsIphoneSlider(int arg0) {
        homePage.Iphone14.click();
        WebDriverWait wait =new WebDriverWait(Hooks.driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.urlContains("https://demo.nopcommerce.com/"));

    }

    @Then("user should be directed to Iphone 14 page")
    public void userShouldBeDirectedToIphonePage() {
        String url= Hooks.driver.getCurrentUrl();
        Assert.assertEquals(url,"https://demo.nopcommerce.com/iphone-14-Pro");
    }


}




