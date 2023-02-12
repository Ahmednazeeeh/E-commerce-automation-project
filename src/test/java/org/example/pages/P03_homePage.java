package org.example.pages;
import javafx.css.CssMetaData;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.bind.annotation.W3CDomHandler;
import java.util.List;

public class P03_homePage {
    public P03_homePage() {
        PageFactory.initElements(Hooks.driver, this);
    }

    @FindBy(css = "select[id=\"customerCurrency\"]")
    public WebElement currency;

    @FindBy(css = "span[class=\"price actual-price\"]")
    public List<WebElement> products;

    @FindBy(id = "small-searchterms")
    public WebElement searchbox;

    @FindBy(css = "button[class=\"button-1 search-box-button\"]")
    public WebElement searchbutton;

    @FindBy(css = "h2[class=\"product-title\"]")
    public List<WebElement> result;


    @FindBy(xpath = "//h2[@class=\"product-title\"]//a")
    public WebElement serialnumresult;

    @FindBy(xpath = "//ul[@class=\"top-menu notmobile\"]/li/a")
    public List<WebElement> mainmenu;

    @FindBy(css = "h2[class=\"title\"] a")
    public List<WebElement> submenu;

    @FindBy(css = "div[class=\"page-title\"] h1")
    public WebElement title;

    @FindBy(css = "#nivo-slider > a:nth-child(1)")
    public WebElement Iphone14;

    @FindBy(css = "#nivo-slider > a:nth-child(2)")
    public WebElement s22ultra;

    @FindBy(css = "a[href=\"http://www.facebook.com/nopCommerce\"]")
    public WebElement facebook;

    @FindBy(css = "a[href=\"https://twitter.com/nopCommerce\"]")
    public WebElement twitter;

    @FindBy(css = "a[href=\"/news/rss/1\"]")
    public WebElement rss;

    @FindBy(css = "a[href=\"http://www.youtube.com/user/nopCommerce\"]")
    public WebElement youtube;

    @FindBy(css = "body > div.master-wrapper-page > div.master-wrapper-content > div > div > div > div > div.product-grid.home-page-product-grid > div.item-grid > div:nth-child(3) > div > div.details > div.add-info > div.buttons > button.button-2.add-to-wishlist-button")
     public WebElement wishlistbutton;

    @FindBy(css = "div[class=\"bar-notification success\"]")
    public WebElement backgroundcolor;

    @FindBy(css = "p[class=\"content\"]")
    public WebElement successmessage;

    @FindBy(css = "span[class=\"wishlist-label\"]")
    public WebElement wishlisttab;

    @FindBy(css = "input[class=\"qty-input\"]")
    public WebElement quantity;


}
