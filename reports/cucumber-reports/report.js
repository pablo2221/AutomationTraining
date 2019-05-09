$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/login.feature");
formatter.feature({
  "name": "Login Functionality",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@smokeTesting"
    }
  ]
});
formatter.scenario({
  "name": "Verify error message",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smokeTesting"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on Login Page of \"http://automationpractice.com/index.php\"",
  "keyword": "Given "
});
formatter.match({
  "location": "loginSpecDef.iAmOnLoginPageOf(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Press the Login button",
  "keyword": "When "
});
formatter.match({
  "location": "loginSpecDef.iPressTheLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I press the create account button",
  "keyword": "And "
});
formatter.match({
  "location": "loginSpecDef.iPressTheCreateAccountButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I validate the error message displayed \"Invalid email address.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "loginSpecDef.iValidateTheErrorMessageDisplayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify Sign in error message",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smokeTesting"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on Login Page of \"http://automationpractice.com/index.php\"",
  "keyword": "Given "
});
formatter.match({
  "location": "loginSpecDef.iAmOnLoginPageOf(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Press the Login button",
  "keyword": "When "
});
formatter.match({
  "location": "loginSpecDef.iPressTheLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter the email address \"pablo.2221@hotmail.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "loginSpecDef.iEnterTheEmailAddress(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter the password \"passwordGeneric\"",
  "keyword": "And "
});
formatter.match({
  "location": "loginSpecDef.iEnterThePassword(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I press the Sign in button \"SubmitLogin\"",
  "keyword": "And "
});
formatter.match({
  "location": "loginSpecDef.iPressTheSignInButton(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I validate error message \"Authentication failed.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "loginSpecDef.iValidateErrorMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify process to send a message to customer service including a .png attachment",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smokeTesting"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to contact us page \"http://automationpractice.com/index.php?controller\u003dcontact\"",
  "keyword": "Given "
});
formatter.match({
  "location": "loginSpecDef.iNavigateToContactUsPage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select from the dropdown the index 1",
  "keyword": "When "
});
formatter.match({
  "location": "loginSpecDef.iSelectFromTheDropdownTheIndex(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter the email address \"pablo.2221@hotmail.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "loginSpecDef.iEnterTheEmailAddress(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter the order reference \"id_order\", \"123456\"",
  "keyword": "And "
});
formatter.match({
  "location": "loginSpecDef.iEnterTheOrderReference(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter the message \"message\", \"This is a test to validate\"",
  "keyword": "And "
});
formatter.match({
  "location": "loginSpecDef.iEnterTheMessage(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I upload the file \"fileUpload\", \"/Users/it/Downloads/test.png\"",
  "keyword": "And "
});
formatter.match({
  "location": "loginSpecDef.iUploadTheFile(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I press the send message button \"submitMessage\"",
  "keyword": "And "
});
formatter.match({
  "location": "loginSpecDef.iPressTheSendMessageButton(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I validate error message \"Your message has been successfully sent to our team.\", \"/html/body/div/div[2]/div/div[3]/div/p\"",
  "keyword": "Then "
});
formatter.match({
  "location": "loginSpecDef.iValidateErrorMessage(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});