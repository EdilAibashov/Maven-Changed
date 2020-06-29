@homePage
Feature: Home page Testing
  @verifytitle @smoke
  Scenario: Verify title of Home Page
    Given User opens home page
    Then Verifies title is "Best Buy | Official Online Store | Shop Now & Save"
    When User sees "Today's popular picks"
