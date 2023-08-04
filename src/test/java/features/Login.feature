
Feature:
  In order to ensure Login Functionality works,
  I want to run the cucumber test to verify it is working


  Scenario: Log in a user
    Given the user is on landing page
    And they provide the email as wamaithathiongo@gmail.com
    And they provide the password as Cm209054!
#    And they click the login button
    Then they should log in



