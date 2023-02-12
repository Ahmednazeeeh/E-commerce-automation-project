package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.pool.TypePool;
import org.example.pages.P03_homePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class D03_Currencies {

P03_homePage homePage=new P03_homePage();
    @When("user Selects Euro currency from the dropdown list on the top left of home page")
    public void userSelectsEuroCurrencyFromTheDropdownListOnTheTopLeftOfHomePage() throws Exception{

        Select select=new Select(homePage.currency);
        select.selectByVisibleText("Euro");

    }


    @Then("Euro Symbol \\(€) is shown on the four products displayed in Home page")
    public void euroSymbol€IsShownOnTheProductsDisplayedInHomePage() {
        for(int i=0;i<homePage.products.size();i++){
            String currency=homePage.products.get(i).getText();
            Assert.assertTrue(currency.contains("€"));
    }}
}