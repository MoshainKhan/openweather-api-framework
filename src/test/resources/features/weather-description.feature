Feature: As a tester, I want a framework that will ensure the weather id, main, description and icon are valid combinations, so that I can test for correct weather outputs.

  Background: Checking weather description fields are related
    Given I have a weatherItem

  Scenario: ID of the weather item is valid
    When I get the weather ID
    Then Then it should within a valid range

  Scenario: Weather main description is a valid main description
    When I get the weather description
    Then It should be a valid description

  Scenario: ID of the weatherItem has the correct description, main description and id
    When I get the weather ID
    Then It should have the correct corresponding description, main description and iconID

    Scenario: weatherItem should not be null
      When I go get the weatherItem response
      Then The fields should not be null