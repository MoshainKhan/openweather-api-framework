Feature: As a Tester, I want a framework that will check that the coordinates are correctly formatted, so that I can test for precise locations.

  Background: Checking lat and lon values are correctly formatted
    Given I have lat and lon in a JSON response


  Scenario: Checking lat is valid
    When I test the lat field
    Then I should receive a value between minus ninety and plus ninety

  Scenario: Checking lat has no more than 4 decimal places
    When I test the lat field
    Then I should receive a lat value with no more than four decimal places

  Scenario: Checking lon is valid
    When I test the lon field
    Then I should receive a value between minus180 and 180

  Scenario: Checking lon has no more than 4 decimal places
    When I test the lon field
    Then I should receive a lon value  with no more than four decimal places

