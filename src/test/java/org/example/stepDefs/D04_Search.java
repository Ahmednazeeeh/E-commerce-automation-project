package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class D04_Search {

    P03_homePage homePage = new P03_homePage();


    @When("user clicks search box")
    public void userClicksSearchBox() {
        homePage.searchbox.click();
    }

    @And("user enters product name as {string}")
    public void userEntersProductNameAs(String arg0) {
        homePage.searchbox.sendKeys(arg0);

    }

    @And("clicks on search button")
    public void clicksOnSearchButton() {
        homePage.searchbutton.click();

    }




    @And("user enters product serial number as {string}")
    public void userEntersProductSerialNumberAs(String arg0) {
        homePage.searchbox.sendKeys(arg0);
    }


    @Then("list of relevant products contains {string} should appear in the search result list")
    public void listOfRelevantProductsContainsShouldAppearInTheSearchResultList(String arg0) {
        SoftAssert soft=new SoftAssert();
        soft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/search?q="));
        for (int i=0;i<homePage.result.size();i++) {
            String name = homePage.result.get(i).getText().toLowerCase();
            soft.assertTrue(name.contains(arg0));

        }soft.assertAll();
    }

    @Then("the right product with serial {string} should appear in the search result list")
    public void theRightProductWithSerialShouldAppearInTheSearchResultList(String arg0) {
        homePage.serialnumresult.click();
        String serial=Hooks.driver.findElement(By.cssSelector("div[class=\"sku\"] span[class=\"value\"]")).getText();
        Assert.assertTrue(serial.contains(arg0));
    }
}


