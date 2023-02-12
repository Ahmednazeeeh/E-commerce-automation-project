@smoke
Feature: F06_homesliders | users could select one of the two sliders on homepage and the slider directs him into product page
  Scenario: users could select product slider (S22 ultra)  and will be directed to it's page
    When user selects s22 ultra slider
    Then user should be directed to s22 ultra page



    Scenario: users could select product slider (Iphone 14)  and will be directed to it's page
      When user selects Iphone 14 slider
      Then user should be directed to Iphone 14 page



