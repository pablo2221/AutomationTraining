Feature: Login Functionality
  Scenario: Verify unsuccessfully login
    Given I am on Login Page of "http://automationpractice.com/index.php?controller=authentication&back=my-account"
    When I enter a valid username "hola@hola.com"
    And I enter a invalid password "nopass"
    And I click the sign in button
    Then I see the error message

