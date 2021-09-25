Feature: Search Devlabs in Google

  Scenario: Search Devlabs
    Given User should launch the browser
    And User go to google.com
    When User enter the value as Devlabs
    Then User should see the page title that has Devlabs
