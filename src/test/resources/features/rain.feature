Feature: As a tester,I want to test  that I can see the rain volume for
         the past 1 hours or 3 hours,
         so that I can test for the valid time period outputs.

  Background:checking the volume of the rain for 1 hours or 3 hours.
    Given I have a JSON response including Rain

  Scenario: checking the datatype of the rain for 1 hour.
    When I test value for the rain in an hour
    Then It should  return value in double.

  Scenario: checking the volume of the rain for 1 hour
    When I test value for the rain in an hour
    Then It should be greater than zero

Scenario: checking the type for rain 3 hours
    When I test value for the rain in three hours
    Then It should return a three hour value in  double.

  Scenario: checking the volume for rain 3 hours
    When I test value for the rain in three hours
    Then It should return a number greater than zero



