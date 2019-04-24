$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:/Users/it/IdeaProjects/AutomationTraining/src/test/java/features/login.feature");
formatter.feature({
  "name": "Login Functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify unsuccessfully login",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on Login Page of \"http://automationpractice.com/index.php?controller\u003dauthentication\u0026back\u003dmy-account\"",
  "keyword": "Given "
});
formatter.match({
  "location": "loginSpecDef.iAmOnLoginPageOf(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter a valid username \"hola@hola.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "loginSpecDef.iEnterAValidUsername(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter a invalid password \"nopass\"",
  "keyword": "And "
});
formatter.match({
  "location": "loginSpecDef.iEnterAInvalidPassword(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click the sign in button",
  "keyword": "And "
});
formatter.match({
  "location": "loginSpecDef.iClickTheSignInButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I see the error message",
  "keyword": "Then "
});
formatter.match({
  "location": "loginSpecDef.iSeeTheErrorMessage()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify successfully login",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on Login Page of \"http://automationpractice.com/index.php?controller\u003dauthentication\u0026back\u003dmy-account\"",
  "keyword": "Given "
});
formatter.match({
  "location": "loginSpecDef.iAmOnLoginPageOf(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter a valid username \"hola@qatest.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "loginSpecDef.iEnterAValidUsername(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter a invalid password \"testQA\"",
  "keyword": "And "
});
formatter.match({
  "location": "loginSpecDef.iEnterAInvalidPassword(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click the sign in button",
  "keyword": "And "
});
formatter.match({
  "location": "loginSpecDef.iClickTheSignInButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I see the account page displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "loginSpecDef.iSeeTheAccountPageDisplayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});