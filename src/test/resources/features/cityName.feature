Feature: As a tester, I want a framework that tests the Name (city name) is a string, so that I can test the datatype returned is valid.

  Scenario: cityName should be a String and should be a correct city name
    Given  I have received a JSON response
    When I check the city name
    Then I want it to return a String