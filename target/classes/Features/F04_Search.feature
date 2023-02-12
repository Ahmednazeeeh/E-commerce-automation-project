@smoke
Feature: F04_Search | users could search for a product by name or serial number (sku)
  Scenario: user could search for a product by it's name
    When user clicks search box
    And user enters product name as "<productname>"
    And clicks on search button
    Then list of relevant products contains "<productname>" should appear in the search result list
    Examples:
      | productname |
      | book |
      | laptop |
      | nike |

  Scenario: user could search for a product by it's sku (serial number)
    When user clicks search box
    And user enters product serial number as "<sku>"
    And clicks on search button
    Then the right product with serial "<sku>" should appear in the search result list
    Examples:
       | sku |
      | SCI_FAITH |
      | APPLE_CAM |
      | SF_PRO_11 |

