@smoke
Feature: F03_Currencies | users could change currency to (€)
  Scenario: user could change currency from homepage to (€)
    When user Selects Euro currency from the dropdown list on the top left of home page
    Then  Euro Symbol (€) is shown on the four products displayed in Home page
