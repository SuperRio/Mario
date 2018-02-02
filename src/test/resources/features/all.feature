@loginoutline
Feature: Login func. Test
Scenario: login with invalid credentials




    Given I am on the login page
    And I insert username
    And I insert password
    When I click login
    Then go to dashboard