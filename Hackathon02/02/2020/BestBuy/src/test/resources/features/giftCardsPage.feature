@giftCards
Feature: Navigate to Best Buy Gift Cards

  Scenario: Verify Best Buy Gift Cards
    Given User opens home page
    When User navigates to Gift Cards page
    Then Verifies title is "Best Buy Gift Cards"
    And verify list of items in Specialty Gift Cards
    Then print list of Specialty Gift Cards Items