@smokeTest
Feature: feature to test login functionality
  Scenario: Check login is successful with valid credentials

    Given user is on login page
    When user enter username and password
    And clicks on login button
    Then user navigated on the home page