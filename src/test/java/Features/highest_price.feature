
Feature: Selecting and Adding Highest priced dress to Cart on 'automationpractice.com'

 
  Scenario: Add highest priced item to cart
    Given I open home page
    And Click on the 'DRESSES' Menu
    When I select Highest Price Item
    Then I add highest priced item to Cart
    Then I close the browser
   