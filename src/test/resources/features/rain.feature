Feature: As a tester,I want to test  that I can see the rain volume for
         the past 1 hours or 3 hours,
         so that I can test for the valid time period outputs.

  Background:checking the volume of the rain for 1 hours or 3 hours.
    Given I have a JSON response

  Scenario: checking the volume of the rain for 1 hour.
    When I test value for the rain in an hour
    Then I should  match the volume with the actual.

  Scenario: checking the volume of the rain for 3 hours.

    When I test value for the rain in 3 hours
    Then I should  match the volume  with the actual.

  Scenario: checking the volume of the rain is in millimeter(mm).

    When I test value for the rain
    Then It should be in the correct format