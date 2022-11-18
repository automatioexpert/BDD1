#Author Valmiki Vishwakarma
#Date Nov 18 2022
#Description BDD Framework
Feature: feature to test login functionality

  Scenario: Check login is successful with valid credentials
    Given user is on login page
    When user enters username and password
    And user clicks on login button
    Then user is navigated to login page
