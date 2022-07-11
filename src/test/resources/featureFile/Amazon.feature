@Amazon
Feature: To check whether add to cart is working properly or not

  Scenario: To validate add to cart button
    Given User have to Enter Amazon Website throughh Chrome Browser
    And User have to click signin button
    And User have to pass "<email>"
    And click Continue button
    And User have to send "<password>"
    And click sigin button
    And User have to click in Search tab
    And In search tab Enter Mobiles
    And Click Search button
    And Click any product in new page
    Then Click add to cart button
   