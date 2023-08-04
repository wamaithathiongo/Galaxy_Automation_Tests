
Feature:
  As a user
  I want to be able to login via the recover password form

  Background:
    Given the user is on landing page


  Scenario: Login via recover password form
    Given they click forgot password
    And they click login
    Then they should be redirected to the login page


