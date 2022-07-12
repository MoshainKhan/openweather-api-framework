Feature: As a tester I want the framework that checks the type,id,message,country code
          are valid so that I can test the values are valid.

  Background:checking the values are in correct data types
    Given I have a JSON response

  Scenario: checking the system type is in int.
    When I test value for the system type
    Then the value should be in int.

  Scenario: checking the system id is in int.
    When I test value for the ID type
    Then the value should be in int.

  Scenario: checking the system country code is in String.
    When I test value for the country code type
    Then the value should return a String.

  Scenario: checking the system country code with actual country code.
    When I return the country code
    Then The code should correspond with the correct country