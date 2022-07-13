Feature: As a Tester,I want the framework that will check the values for visibility
          are between 0 and 10km,so that I can check for in accurate outputs.

  Background:checking the value for the visibility.
    Given I have a JSON response

    Scenario: checking the value for the visibility is between 0 and 10 km.
    When I test the visibility value
    Then I should get a value between zero and ten km

