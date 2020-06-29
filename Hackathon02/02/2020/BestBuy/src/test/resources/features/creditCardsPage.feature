@creditCards
Feature: Test credit cards Page
  @smoke @regression
  Scenario: Verify credit cards page title and button name
    Given User opens home page
    Then User clicks credit cards button
    When User sees "Manage Account*"
    Then Verifies title is "Best Buy Credit Card: Rewards & Financing"