Feature: As a user, I want to be able to check the wind data to be able to check the wind-speeds and the wind direction.

  Background: Checking if the returned wind data is valid
    Given I have wind data in the JSON response

  Scenario: No wind gust
    When There is no gust data
    Then Gust should be null

  Scenario: There is wind gust
    When There is gust data
    Then Gust should be greater than wind speed

  Scenario: Wind speed should always be greater than zero
    When I check the wind speeds
    Then They should be greater than 0

  Scenario: Checking the direction of wind is valid
    When I check the wind direction
    Then The value should be between 0 and 360


