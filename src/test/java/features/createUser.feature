
Feature:
  As a user
  I want to be able to sign up to Enterprise galaxy

  Background:
    Given the user is on landing page


  Scenario: Create User
    Given they click on Sign Up
    And they provide the firstname as test
    And they provide the lastname as one
    And they provide the email  as charlynmbugua@gmail.com
    And they provide the cellphone  as Cm209054!
    And they provide the user password as 1234
    And they confirm the password as 1234
    And they provide a referral code 0000
    And they click sign up
    Then they should be able to sign up


