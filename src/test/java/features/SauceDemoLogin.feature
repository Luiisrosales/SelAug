Feature: Login SWAG LABS WebSite

  Scenario: Go to SWAG LABS WebSite and Login
    Given User should launch the browser
    And User go to SWAG LABS website
    When User enter Username 
    And User enter Password
    Then User should Login succesfully
    And User should get Title's page
