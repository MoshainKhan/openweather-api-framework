Feature: As a tester I want the framework that checks the type,id,message,country code
          are valid so that I can test the values are valid.

  Background:checking the values are in correct data types
    Given I have a weather JSON response

  Scenario: checking the system type is in integer.
    When I test value for the system type
    Then the value should be in integer.

  Scenario: checking the system id is in integer.
    When I test value for the ID type
    Then the value should be an integer.

  Scenario: checking the system message is in double.
    When I test value for the message type
    Then the value should be in double.

  Scenario: checking the system country code is in String.
    When I test value for the country code type
    Then the value should be in String.

    Scenario: checking the system country code is a valid code
    Then The value should correspond to a valid country

