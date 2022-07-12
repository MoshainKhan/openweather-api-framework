Feature: As a tester, I want a framework that will check the humidity values are between 0 & 100%, so that I can test for inaccurate outputs.

  Background: Checking humidity value is a percentage
    Given I have a JSON response

  Scenario: Checking humidity is a number type
    When I test the humidity field
    Then I should receive an integer data type


  Scenario: Checking humidity is between 0 and 100
    When I test the humidity field
    Then I should receive a value between 0 and 100


