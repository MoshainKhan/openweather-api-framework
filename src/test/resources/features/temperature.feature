Feature: As a Tester, I want a Framework that will ensure the temperatures are valid, so that I can test for accurate data.

  Background: Checking the temperature values are correct
    Given I have a JSON response including temperature

    Scenario: Checking the MIN temperature is smaller than the MAX
      When I compare the MIN to the MAX
      Then the MIN should be smaller than the MAX

    Scenario: Checking the current temperature value is to between MIN and MAX
      When I check the current temperature value
      Then It should be between the MIN and MAX

    Scenario: Checking the temperature returns a valid value
      When I check the temperature value
      Then It should return a double

    Scenario: Checking the temperature is not equal to null
      When I check the temperature value
      Then It should not be equal to null

    Scenario: Checking the current temperature it is equal to or more than MIN
      When I check the current temperature value
      Then It should be equal to or more than MIN

    Scenario: Checking the current temperature it is equal to or less than MAX
      When I check the current temperature value
      Then It should be equal to or less than MAX

    Scenario: Checking the feels like temperature is within five of the current temperature
      When I check the feels like temperature value
      Then it should be within five degrees of the current temperature

     Scenario: Checking the feels like temperature is equal to or more than MIN
      When I check the feels like temperature value
      Then It should be equal to or more than MIN

    Scenario: Checking the feels like temperature is equal to or less than MAX
      When I check the feels like temperature value
      Then It should be equal to or less than MAX