Feature: As a tester, I want to check that the humidity values are between 0 & 100%, so that I can be sure that the data is accurate.

  Background: Checking humidity value is a percentage
    Given I have humidity data in a JSON response

  Scenario: Checking humidity is a number type
    When I test the humidity field
    Then I should receive an integer data type.


  Scenario: Checking humidity is between zero and 100
    When I test the humidity field
    Then I should receive a value between zero and hundred


