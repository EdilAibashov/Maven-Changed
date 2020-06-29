@bookingPage
Feature: Booking Pages Test
  Background: User opens Admin home page
    Given User opens Admin home page
    When User logsin with admin account
  @createCoupon @smoke
  Scenario: Verify coupon code
    #Given User opens Admin home page
#    When User logsin with admin account
    And User navigate to Coupons page
    And Creates a new coupon
    Then Verifies coupon is "created"
    Given User opens home page
    When User opens "first tour" featured tour
    And Clicks on "Book Now" button
    And Applies existing coupon code
    Then Verifies positive message is displayed
    And User navigate to Coupons page

  @deleteCoupon
  Scenario: Verify coupon created and deleted
    #Given User opens Admin home page
#    When User logsin with admin account
    And User navigate to Coupons page
    And Creates a new coupon
    Then Verifies coupon is "created"
    And Deletes newly created coupon
    #Then Verifies coupon is "deleted"

  @deleteCouponWithParameter
  Scenario: Verify coupon created and deleted
    #Given User opens Admin home page
#    When User logsin with admin account
    And User navigate to Coupons page
    And Creates a new coupon with following info
    |key          |value      |
    |percentage   |25         |
    |max use      |5          |
    |start date   |30/01/2020 |
    |end date     |30/02/2020 |
    |cars checkbox|check      |
    |coupon code  |13% Coupon |
    And Deletes newly created coupon
    Then Verifies coupon is "created"
#    Then Verifies coupon is "deleted"


