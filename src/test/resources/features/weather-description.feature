Feature: As a tester, I want a framework that will ensure the weather id, main, description and icon are valid combinations, so that I can test for correct weather outputs.

  Background: Checking weather description fields are related
    Given I have a JSON response including weather data

  Scenario: Main description is Thunderstorm
    When Main description is Thunderstorm
    Then ID should be between two hundred and two hundred and thirty two

  Scenario: Main description is Thunderstorm and ID between 200 and 232
    When Main description is Thunderstorm
    Then Description should contain thunderstorm

  Scenario: Main description is Thunderstorm and ID between 200 and 232
    When Main description is Thunderstorm
    Then icon should be "11d"