Feature: As a tester, I want a framework that tests the ID (city id) returns a number datatype, so that I can test the datatype returned is valid.

Scenario: cityID should be an int
  Given I have received a JSON response
  When I check the city ID
  Then It should return the correct data Type

