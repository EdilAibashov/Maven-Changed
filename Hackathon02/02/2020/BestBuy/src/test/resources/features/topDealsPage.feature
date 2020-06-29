@topDeals
Feature: Verify top deals
  Scenario: verify top deals items
    Given User opens home page
    When User navigates to "top deals"
    Then User veryfies category "Shop Top Deals by category"
    And verify product by name
    Then sort by price and print
