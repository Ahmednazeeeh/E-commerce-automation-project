@smoke
Feature: F05_hoverCategories | users could hover on one of the three main categories and select random subcategory
  Scenario: users could hover on one of the three main categories and select random subcategory
    When user selects and hovers on one of the three main categories
    And user selects random one of the sub categories
    Then  the sub-category title is (equal or contains) the one you get it while selecting random sub-category


