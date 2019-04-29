Feature: Login Functionality
  Scenario: Verify unsuccessfully login
    Given I am on Login Page of "http://automationpractice.com/index.php?controller=authentication&back=my-account"
    When I enter a valid username "hola@hola.com"
    And I enter a invalid password "nopass"
    And I click the sign in button
    Then I see the error message

  Scenario: Verify successfully login
    Given I am on Login Page of "http://automationpractice.com/index.php?controller=authentication&back=my-account"
    When I enter a valid username "hola@qatest.com"
    And I enter a invalid password "testQA"
    And I click the sign in button
    Then I see the account page displayed

    # el Escenario de abajo es del proyecto final de automation fundamentals

  Scenario: Verify error message
    Given I am on Login Page of "http://automationpractice.com/index.php"
    When I Press the Login button
    And I press the create account button
    Then I validate the error message displayed "Invalid email address."


