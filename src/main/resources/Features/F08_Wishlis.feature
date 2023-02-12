@smoke
Feature:F08_Wishlist | users could add products to Wishlist
  Scenario:  user could add product of the four products shown on the Homepage to Wishlist ( HTC One M8 Android L 5.0 Lollipop )
    When you click on wishlist button ❤️  on this product "HTC One M8 Android L 5.0 Lollipop"
    Then you will see success message "The product has been added to your wishlist" with green background color


  Scenario:  user opens Wishlist and checks if product added correctly ( HTC One M8 Android L 5.0 Lollipop )
    When you click on wishlist button ❤️  on this product "HTC One M8 Android L 5.0 Lollipop"
    And wait until success message is disappeared
    And click on Wishlist tab
    Then you should see your product is added correctly

