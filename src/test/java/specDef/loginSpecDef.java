package specDef;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginSpecDef {

    @Given("I am on Login Page of {string}")
    public void iAmOnLoginPageOf(String arg0) {
    }

    @When("I enter a valid username {string}")
    public void iEnterAValidUsername(String arg0) {
    }

    @And("I click the sign in button")
    public void iClickTheSignInButton(){
    }

    @And("I enter a invalid password {string}")
    public void iEnterAInvalidPassword(String arg0) {

    }

    @Then("I see the error message")
    public void iSeeTheErrorMessage() {
    }

}
