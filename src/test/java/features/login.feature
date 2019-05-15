
Feature: Login Functionality

  @sanity
  Scenario: Verify unsuccessfully login
    Given I am on Login Page of "http://automationpractice.com/index.php?controller=authentication&back=my-account"
    When I enter a valid username "hola@hola.com"
    And I enter a invalid password "nopass"
    And I click the sign in button
    Then I see the error message

  @sanity
  Scenario: Verify successfully login
    Given I am on Login Page of "http://automationpractice.com/index.php?controller=authentication&back=my-account"
    When I enter a valid username "hola@qatest.com"
    And I enter a invalid password "testQA"
    And I click the sign in button
    Then I see the account page displayed

    # a partir de aca son escenarios del curso de fundamentals

  @smoke
  Scenario: Verify error message
    Given I am on Login Page of "http://automationpractice.com/index.php"
    When I Press the Login button
    And I press the create account button
    Then I validate the error message displayed "Invalid email address."

    # El escenario corresponde a validar que al colocar datos de una cuenta no creada se muestre un msj de error y se compare con el esperado

  @smoke
  Scenario: Verify Sign in error message
    Given I am on Login Page of "http://automationpractice.com/index.php"
    When I Press the Login button
    And I enter the email address "pablo.2221@hotmail.com"
    And I enter the password "passwordGeneric"
    And I press the Sign in button "SubmitLogin"
    Then I validate error message "Authentication failed."

  # Esta prueba simula el proceso de enviar un msj a servicio al cliente agregando un file upload y valida el msj de confirmacion

  @smoke
  Scenario: Verify process to send a message to customer service including a .png attachment
    Given I navigate to contact us page "http://automationpractice.com/index.php?controller=contact"
    When I select from the dropdown the index 1
    And I enter the email address "pablo.2221@hotmail.com"
    And I enter the order reference "id_order", "123456"
    And I enter the message "message", "This is a test to validate"
    And I upload the file "fileUpload", "/Users/it/Downloads/test.png"
    And I press the send message button "submitMessage"
    Then I validate error message "Your message has been successfully sent to our team.", "/html/body/div/div[2]/div/div[3]/div/p"
