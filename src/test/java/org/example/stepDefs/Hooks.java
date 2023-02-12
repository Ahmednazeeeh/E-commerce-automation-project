package org.example.stepDefs;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Hooks {

    public static WebDriver driver;
@Before
    public static void openbrowser() {
    //Bridge between code and browser
    WebDriverManager.chromedriver().setup();

    //driver setup
    driver = new ChromeDriver();
    //Configurations
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    //navigate to Url
    driver.get("https://demo.nopcommerce.com/");

}



    @After
    public static void quitdriver()throws Exception{
    Thread.sleep(2000);
    driver.quit();
}
}
