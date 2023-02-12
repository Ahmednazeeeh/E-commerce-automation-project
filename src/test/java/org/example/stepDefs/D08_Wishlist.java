package org.example.stepDefs;

import com.beust.ah.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.ArrayList;

public class D08_Wishlist {
    P03_homePage homePage=new P03_homePage();

    @When("you click on wishlist button ❤️  on this product \"HTC One M8 Android L 5.0 Lollipop\"")
    public void youClickOnWishlistButton️OnAnyProduct() {

        homePage.wishlistbutton.click();
    }

    @Then("you will see success message {string} with green background color")
    public void youWillSeeSuccessMessageWithGreenBackgroundColor(String arg0) {
        SoftAssert soft=new SoftAssert();
        String actual_color= Color.fromString(homePage.backgroundcolor.getCssValue("background-color")).asHex();
        soft.assertEquals(actual_color,"#4bb07a");
        soft.assertEquals(homePage.successmessage.getText(),arg0);


    }

    @And("wait until success message is disappeared")
    public void waitUntilSuccessMessageIsDisappeared() {
        WebDriverWait wait=new WebDriverWait(Hooks.driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.invisibilityOf(homePage.successmessage));


    }

    @And("click on Wishlist tab")
    public void clickOnWishlistTab() {
        homePage.wishlisttab.click();

    }


    @Then("you should see your product is added correctly")
    public void youShouldSeeYourProductIsAddedCorrectly() {
        Assert.assertEquals(homePage.quantity.getAttribute("value"),"1");
    }
}
