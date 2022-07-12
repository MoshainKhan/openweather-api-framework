Feature: As a tester, I want a framework that will check the values for pressure are between 100 and 1100, so that I can easily test for inaccurate outputs.

  Background:  Checking pressure is formatted correctly
    Given I have a JSON response

  Scenario: Checking pressure is a number type
    When I test values for pressure
    Then I should receive a number data type

  Scenario: Checking pressure is between 100 and 1100
    When I test values for pressure
    Then I should receive a value between 100 and 1100 only

