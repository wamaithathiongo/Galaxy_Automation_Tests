
Feature:
  As a user
  I want to be able to recover password

  Background:
    Given the user is on landing page


  Scenario: Create User
    Given they click on forgot password
    And they provide their email as charlynmbugua@gmail.com
    And they click recover my password
    Then they should recover password


