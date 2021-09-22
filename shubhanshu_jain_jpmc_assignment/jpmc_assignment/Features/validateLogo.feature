
Feature: Validate Company Logo on Home Page

  Scenario: Search with keyword and validate Logo
    Given User Launch Chrome Browser
    When User opens URL "https://www.google.com/"
    And search for "J. P. Morgan"
    And click on Search Button
    And click on first link
    Then Validate Logo
   
   
