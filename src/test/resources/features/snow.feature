Feature: As a Tester, I want a framework that will ensure the snow volume values are valid, so that I can test for accurate data

  Background: Checking the snow volume values are valid
    Given I have a JSON response including snow

    Scenario: checking the snow volume values are an double for one hour
      When I check the snow values for one hour
      Then it should return the values which are double

    Scenario: checking the snow volume values are not less than zero for oen hour
      When I check the snow values for one hour
      Then it should return a value equal to or more than zero

      Scenario: checking the data type for snow 3 hours
        When I check the snow values for three hours
        Then it should return a double

        Scenario: checking the volume is valid for snow 3 hou
          When I check the snow values for three hours
          Then It should return a value greater than zero