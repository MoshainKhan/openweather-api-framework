Feature: As a tester, I want a framework that tests the cod is a number, so that I can test the datatype returned is valid.

Scenario: The cod number should be 200 as this represents the status code
  Given  I have received a JSON response
  When I check the cod number
  Then I want it to return an int
  And I want it to return 200