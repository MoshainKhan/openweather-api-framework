Feature: As a tester, I want a framework that will ensure the weather id, main, description and icon are valid combinations, so that I can test for correct weather outputs.

  Background: Checking weather description fields are related
    Given I have a weatherItem

  Scenario: ID of the weather item is valid
    When I check the weather ID
    Then Then it should within a valid range

  Scenario: ID of the weatherItem has the correct description, main description and id
    Then It should have the correct corresponding description, main description and iconID
