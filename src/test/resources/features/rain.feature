Feature: As a tester,I want to test  that I can see the rain volume for
         the past 1 hours or 3 hours,
         so that I can test for the valid time period outputs.

  Background:checking the volume of the rain for 1 hours or 3 hours.
    Given I have a JSON response

  Scenario: checking the volume of the rain for 1 hour.
    When I test value for the rain in an hour
    Then I should  return the double.

  Scenario: checking the volume of the rain for three hours.

    When I test value for the rain for three hours.
    Then I should  return the a double.