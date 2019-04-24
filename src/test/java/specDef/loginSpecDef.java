package specDef;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.By;
import utilities.driverProvider;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class loginSpecDef {

    public WebDriver driver;

    @Before()
    public void setUp(){

        driver = driverProvider.createDriver("chrome");

    }

    @After()
    public void tearDown(){

        driver.quit();

    }

    @Given("I am on Login Page of {string}")
    public void iAmOnLoginPageOf(String url) {

        driver.get(url);

    }

    @When("I enter a valid username {string}")
    public void iEnterAValidUsername(String username) {

        driver.findElement(By.id("email")).sendKeys(username);

    }

    @And("I enter a invalid password {string}")
    public void iEnterAInvalidPassword(String password) {

        driver.findElement(By.id("passwd")).sendKeys(password);

    }

    @And("I click the sign in button")
    public void iClickTheSignInButton(){

        driver.findElement(By.className("icon-lock")).click();

    }

    @Then("I see the error message")
    public void iSeeTheErrorMessage() {

        Assert.assertEquals(driver.findElement(By.className("alert-danger")).isDisplayed(), true);

    }

    @Then("I see the account page displayed")
    public void iSeeTheAccountPageDisplayed() {

        Assert.assertEquals(driver.findElement(By.id("center_column")).isDisplayed(), true);

    }
}
