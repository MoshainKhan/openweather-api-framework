Feature: As a tester, I want a framework that tests the timestamps are greater than zero, so that I can verify the value returned is valid.

  Background: Checking that dt is an integer representing a valid Unix time
    Given I have received a JSON response

  Scenario: Checking dt is an integer
    When I test the data type of dt
    Then I should receive an integer data type

  Scenario: Checking dt is greater than 0
    When I test the value for dt
    Then I should receive an integer not less than 0

  Scenario: Checking dt is greater than yesterday
    When I test the value for dt
    Then I should receive an integer representing a Unix time greater than the previous day

  Scenario: Checking dt is within last 24 hours
    When I test the value for dt
    Then I should receive an integer representing Unix time that is within the last 24 hours