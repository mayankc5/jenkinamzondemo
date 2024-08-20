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
Feature: Amazon Home page content
  I want to test Amazon Portal content

Background:
	Given I am on Amazon Home page
	
  @mazonmobilepage
  Scenario Outline: Verify items available on Mobile Page
    
    And I select mobile category
    And I select brand Samsung
    And I select price range
    And I select min max range
    And I validate filter result
    #And I navigate to Mobile page
    #Then Mobile page should contains Mobile contents
    #And Mobile page should contains all the mobile with their details
  

    Examples: 
      | Brand  						 | value | status  |
      |  	Samsung								 | 15000      |   Yes      |
