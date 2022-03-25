package stepDefinitions;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.numberOfWindowsToBe;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;
import static stepDefinitions.Setup.driver;

public class Homepage {

    @When ("open Stockbit homepage")
    public void openStockbitHomepage(){
        driver.get("https://stockbit.com/");
    }

    @Then ("verify that the logo is present in homepage")
    public void verifyLogo(){
        boolean status = driver.findElement(By.id("landing-logo")).isDisplayed();
        Assert.assertEquals(true, status);
    }

    @Then("verify link of investing")
    public void investingA(){
        WebElement url = driver.findElement(By.xpath("//a[@class='menuchild' and text()='Investing']"));
        url.click();

        //wait until element present to anticipate bad internet connection
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(visibilityOfElementLocated(By.id("landing-logo")));

        //compare current url with expected url
        String currentURL;
        currentURL = driver.getCurrentUrl();
        Assert.assertEquals("https://stockbit.com/info/mulai-investasi", currentURL);

    }
    @Then("verify link of Pro Tools")
    public void proToolsA(){
        WebElement url = driver.findElement(By.xpath("//a[@class='menuchild' and text()='Pro Tools']"));
        url.click();

        //wait until element present to anticipate bad internet connection
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(visibilityOfElementLocated(By.id("landing-logo")));

        //compare current url with expected url
        String currentURL;
        currentURL = driver.getCurrentUrl();
        Assert.assertEquals("https://stockbit.com/info/pro-tools", currentURL);

    }
    @Then("verify link of Academy")
    public void academyA(){

        driver.getWindowHandle();

        //Store the ID of the original window
        String originalWindow = driver.getWindowHandle();

        //Check we don't have other windows open already
        assert driver.getWindowHandles().size() == 1;

        //Click the link which opens in a new window
        WebElement url = driver.findElement(By.xpath("//a[@class='menuchild' and text()='Academy']"));
        url.click();

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(visibilityOfElementLocated(By.id("landing-logo")));

        //Wait for the new window or tab
        wait.until(numberOfWindowsToBe(2));

        //Loop through until we find a new window handle
        for (String windowHandle : driver.getWindowHandles()) {
            if(!originalWindow.contentEquals(windowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }

        //compare current url with expected url
        String currentURL;
        currentURL = driver.getCurrentUrl();
        Assert.assertEquals("https://academy.stockbit.com/", currentURL);
        //Close the tab or window
        driver.close();

        //Switch back to the old tab or window
        driver.switchTo().window(originalWindow);
    }

    @Then("verify link of About Us")
    public void aboutUsA(){
        WebElement url = driver.findElement(By.xpath("//a[@class='menuchild' and text()='About Us']"));
        url.click();

        //wait until element present to anticipate bad internet connection
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(visibilityOfElementLocated(By.id("landing-logo")));

        //compare current url with expected url
        String currentURL;
        currentURL = driver.getCurrentUrl();
        Assert.assertEquals("https://stockbit.com/about", currentURL);
    }

    @Then("verify link of Blog")
    public void BlogA(){

        driver.getWindowHandle();

        //Store the ID of the original window
        String originalWindow = driver.getWindowHandle();

        //Check we don't have other windows open already
        assert driver.getWindowHandles().size() == 1;

        //Click the link which opens in a new window
        WebElement url = driver.findElement(By.xpath("//a[@class='menuchild' and text()='Blog']"));
        url.click();

        //wait until element present to anticipate bad internet connection
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(visibilityOfElementLocated(By.id("landing-logo")));

        //Wait for the new window or tab
        wait.until(numberOfWindowsToBe(2));

        //Loop through until we find a new window handle
        for (String windowHandle : driver.getWindowHandles()) {
            if(!originalWindow.contentEquals(windowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }

        //compare current url with expected url
        String currentURL;
        currentURL = driver.getCurrentUrl();
        Assert.assertEquals("https://snips.stockbit.com/", currentURL);
        //Close the tab or window
        driver.close();

        //Switch back to the old tab or window
        driver.switchTo().window(originalWindow);
    }

    @Then("verify link of Help")
    public void HelpA(){

        driver.getWindowHandle();

        //Store the ID of the original window
        String originalWindow = driver.getWindowHandle();

        //Check we don't have other windows open already
        assert driver.getWindowHandles().size() == 1;

        //Click the link which opens in a new window
        WebElement url = driver.findElement(By.xpath("//a[@class='menuchild' and text()='Help']"));
        url.click();

        //wait until element present to anticipate bad internet connection
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(visibilityOfElementLocated(By.id("landing-logo")));

        //Wait for the new window or tab
        wait.until(numberOfWindowsToBe(2));

        //Loop through until we find a new window handle
        for (String windowHandle : driver.getWindowHandles()) {
            if(!originalWindow.contentEquals(windowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }

        //compare current url with expected url
        String currentURL;
        currentURL = driver.getCurrentUrl();
        Assert.assertEquals("https://help.stockbit.com/id/", currentURL);
        //Close the tab or window
        driver.close();

        //Switch back to the old tab or window
        driver.switchTo().window(originalWindow);
    }

}
