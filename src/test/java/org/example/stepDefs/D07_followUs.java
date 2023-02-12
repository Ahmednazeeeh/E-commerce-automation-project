package org.example.stepDefs;

import io.cucumber.java.an.E;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;

public class D07_followUs {

P03_homePage homePage=new P03_homePage();
    @When("user opens facebook link")
    public void userOpensFacebookLink() throws Exception {
homePage.facebook.click();
Thread.sleep(2000);
        ArrayList<String>tabs=new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));


    }

    @Then("{string} is opened in new tab")
    public void isOpenedInNewTab(String arg0) {
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),arg0);
    }

    @When("user opens twitter link")
    public void userOpensTwitterLink() throws Exception {
        homePage.twitter.click();
        Thread.sleep(2000);
        ArrayList<String>tabs=new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));
    }

    @When("user opens rss link")
    public void userOpensRssLink() throws Exception{
        homePage.rss.click();
        Thread.sleep(2000);
        ArrayList<String>tabs=new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));
    }

    @When("user opens youtube link")
    public void userOpensYoutubeLink() throws Exception {
        homePage.youtube.click();
        Thread.sleep(2000);
        ArrayList<String>tabs=new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));

    }
}