Feature: Validating incorrect email id error message
  
  Scenario: Validate error message when user enters incorrect email id
    Given Automation practice application is opened
    When I click sign in
    And I create account with emailid "abc123"
    Then I should get below error message
      "1. Invalid email address."
