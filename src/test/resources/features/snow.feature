Feature: As a Tester, I want a framework that will ensure the snow volume values are valid, so that I can test for accurate data

  Background: Checking the snow volume values are valid
    Given I have a JSON response including snow

    Scenario: checking the snow volume values are an INT
      When I check the snow values
      Then it should return the values which are INTs

    Scenario: checking the snow volume values are not less than zero
      When I check the snow values
      Then it should return a value equal to or more than zero