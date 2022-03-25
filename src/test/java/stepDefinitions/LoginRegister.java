package stepDefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;
import static stepDefinitions.Setup.driver;

public class LoginRegister {

    @Then("verify register button's link")
    public void registerButton(){
        WebElement url = driver.findElement(By.className("register-lnd"));
        url.click();

        //wait until element present to anticipate bad internet connection
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(visibilityOfElementLocated(By.id("loginlogo")));

        //compare current url with expected url
        String currentURL;
        currentURL = driver.getCurrentUrl();
        Assert.assertEquals("https://stockbit.com/#/register", currentURL);
    }

    @Then("return to Homepage")
    public void returnHomepage(){
        WebElement url = driver.findElement(By.id("loginlogo"));
        url.click();

        //compare current url with expected url
        String currentURL;
        currentURL = driver.getCurrentUrl();
        Assert.assertEquals("https://stockbit.com/", currentURL);
    }


    @Then("verify login button's link")
    public void loginButton(){
        WebElement url = driver.findElement(By.className("login-ldn"));
        url.click();

        //wait until element present to anticipate bad internet connection
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(visibilityOfElementLocated(By.id("loginlogo")));

        //compare current url with expected url
        String currentURL;
        currentURL = driver.getCurrentUrl();
        Assert.assertEquals("https://stockbit.com/#/login", currentURL);
    }
}
