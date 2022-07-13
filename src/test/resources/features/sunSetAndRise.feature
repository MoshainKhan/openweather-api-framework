Feature: As a Tester, I want a Framework that will check if Sunrise and Sunset for the given timezone, So that I can test the data.

  Background: Checking the Sunrise and Sunset times are correct
    Given I have a JSON response including Sunrise and Sunset

    Scenario: Checking the Sunrise is before the Sunset for that specific timezone
      When I compare the Sunrise and Sunset values
      Then the Sunrise value should always be before the Sunset value

    Scenario: Checking the Sunrise and Sunset values are the correct DataType.
      When I compare the Sunrise and Sunset values
      Then they should be in the EPOC format

    Scenario: Checking the Sunrise Sunset values are not equal to null
      When I compare the Sunrise and Sunset values
      Then they should NOT be equal to null