Feature: As a tester, I want a framework that will check the values for clouds
          is between 0 and 100%,
        so that I can check for inaccurate outputs.

  Scenario: Checking cloud is a number type
    Given I have a JSON response
    When I test the cloud percentage
    Then I should get a number data type


  Scenario: Checking cloud is not negative
    Given I have a JSON response
    When I test the cloud percentage
    Then I should get a value greater than zero

  Scenario: Checking valid cloud outputs
    Given I have a JSON response
    When I test the cloud percentage
    Then I should get a value between zero and a hundred


