package org.example.stepDefs;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;


public class D05_hoverCategories {
    public static String text="";
    P03_homePage homePage=new P03_homePage();

    @When("user selects and hovers on one of the three main categories")
    public void userHoverOnOneOfTheThreeMainCategories() throws Exception {
        Actions action=new Actions(Hooks.driver);
        int min = 0;
        int max = 2;   // you are selecting random value from 0 to 2
        int selectedUser =  (int)Math.floor(Math.random()*(max-min+1)+min);
        homePage.mainmenu.get(selectedUser).click();
action.moveToElement(homePage.mainmenu.get(selectedUser)).perform();

Thread.sleep(2000);
    }

    @And("user selects random one of the sub categories")
    public void userSelectsRandomOneOfTheSubCategories() {
        int min = 0;
        int max = 2;   // you are selecting random value from 0 to 2
        int selectedUser =  (int)Math.floor(Math.random()*(max-min+1)+min);
        text=homePage.submenu.get(selectedUser).getText().toLowerCase().trim();
        homePage.submenu.get(selectedUser).click();


        
    }

    @Then("the sub-category title is \\(equal or contains) the one you get it while selecting random sub-category")
    public void theSubCategoryTitleIsEqualOrContainsTheOneYouGetItWhileSelectingRandomSubCategory() {
        Assert.assertEquals(homePage.title.getText().toLowerCase().trim(),text);

    }
}
