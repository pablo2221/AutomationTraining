package specDef;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
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

    @When("I Press the Login button")
    public void iPressTheLoginButton() {

        driver.findElement(By.className("login")).click();
    }

    @And("I press the create account button")
    public void iPressTheCreateAccountButton() throws InterruptedException {

        driver.findElement(By.name("SubmitCreate")).click();
        Thread.sleep(3000);


    }

    @Then("I validate the error message displayed {string}")
    public void iValidateTheErrorMessageDisplayed(String textToValidate) throws InterruptedException {

        try {

            Thread.sleep(3000);
            String errorMessage = driver.findElement(By.id("create_account_error")).getText();
            org.testng.Assert.assertEquals(errorMessage,textToValidate);

        }

        catch (NoSuchElementException ex){

            org.testng.Assert.fail("no se encontro un elemento para validar");

        }

    }


    @And("I enter the email address {string}")
    public void iEnterTheEmailAddress(String emailAddress) {

        driver.findElement(By.id("email")).sendKeys(emailAddress);

    }

    @And("I enter the password {string}")
    public void iEnterThePassword(String genericPassword) {

        driver.findElement(By.id("passwd")).sendKeys(genericPassword);

    }

    @Then("I validate error message {string}")
    public void iValidateErrorMessage(String errorMessage) {

        try {

            Thread.sleep(3000);
            String errorMessage2 = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div[1]/ol/li")).getText();
            org.testng.Assert.assertEquals(errorMessage2,errorMessage);

        }

        catch (NoSuchElementException | InterruptedException ex){

            org.testng.Assert.fail("no se encontro un elemento para validar");

        }

    }


    @And("I press the Sign in button {string}")
    public void iPressTheSignInButton(String buttonId) {

        driver.findElement(By.id(buttonId)).click();

    }

    @Given("I navigate to contact us page {string}")
    public void iNavigateToContactUsPage(String url) {

        driver.get(url);

    }

    @When("I select from the dropdown the index {int}")
    public void iSelectFromTheDropdownTheIndex(int index) throws InterruptedException {

        Select dropDown = new Select(driver.findElement(By.xpath("//*[@id=\"id_contact\"]")));
        dropDown.selectByIndex(1);
        Thread.sleep(3000);

    }

    @And("I enter the order reference {string}, {string}")
    public void iEnterTheOrderReference(String orderReferenceId, String orderNumber) {

        driver.findElement(By.id(orderReferenceId)).sendKeys(orderNumber);

    }

    @And("I enter the message {string}, {string}")
    public void iEnterTheMessage(String messageFieldId, String message) throws InterruptedException {

        driver.findElement(By.id(messageFieldId)).sendKeys(message);
        Thread.sleep(3000);

    }

    @And("I upload the file {string}, {string}")
    public void iUploadTheFile(String uploadFileId, String fileExtension) {

        WebElement uploadFile = driver.findElement(By.id(uploadFileId));
        uploadFile.sendKeys(fileExtension);

    }

    @And("I press the send message button {string}")
    public void iPressTheSendMessageButton(String sendMessageButtonID) {

        driver.findElement(By.id(sendMessageButtonID)).click();

    }

    @Then("I validate error message {string}, {string}")
    public void iValidateErrorMessage(String expectedMessage, String xpath) {

        String message = driver.findElement(By.xpath(xpath)).getText();
        org.testng.Assert.assertEquals(message, expectedMessage);

    }
}
