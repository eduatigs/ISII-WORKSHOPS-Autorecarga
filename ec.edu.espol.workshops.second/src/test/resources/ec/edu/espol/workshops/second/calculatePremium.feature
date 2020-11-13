#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Is a valid customer?

  @tag1
  Scenario: Customer too old
    Given The customer is older than 85 years old
    When I calculate the insurance prime
    Then The system should show -1
    
  @tag2
  Scenario: Young Single Customer
    Given The customer is a young single men
    When I calculate the insurance prime
    Then The system should show 2000

  @tag3
  Scenario Outline: Adult Married Customer
    Given The customer is an adult married women
    When I calculate the insurance prime
    Then The system should show 300

    Examples: 
      | name    | answer | status  |
      | Old     |     -1 | success |
      | Young   |   2000 | success |
      | Married |    300 | success |
