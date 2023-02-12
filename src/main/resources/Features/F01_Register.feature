@smoke
Feature:F01_Register | guest users could create new accounts
  Scenario:user could create new account with valid data
    Given user goes to register page
    When user selects gender type
    And user enters "automation" and "tester"
    And user selects date of birth
    And user enters email"test@example.com"
    And user enters "P@ssw0rd" and confirm it
    And user click register button
    Then account is created successfully