Feature: As a tester, I want a framework to test is the timezone returned in the response is valid, so that I can ensure it is correct in relation to UTC.

  Background: When looking at the data in the main response of the JSON:
    Given I receive a JSON response

  Scenario: The timezone should be in the correct range of UTC
    When I check the timezone
    Then I want to check it within the valid range  [-12hours, +14hours] of UTC

  Scenario: The timezone should be a multiple of 3600, so that we can verify it is the correct amount of time away from UTC.
    When I check the timezone
    Then It should be a multiple of 3600

