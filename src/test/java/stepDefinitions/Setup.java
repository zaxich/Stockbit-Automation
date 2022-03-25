package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setup {

     public static WebDriver driver;

    @Given("launch chrome browser")
    public void launchBrowser(){
        System.setProperty("webdriver.chrome.driver", "C://Windows/chromedriver.exe");
        driver= new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Then ("close browser")
    public void closeBrowser(){
        driver.quit();
    }
}
