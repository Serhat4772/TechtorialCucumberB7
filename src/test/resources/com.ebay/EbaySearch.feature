@ebay
Feature: Ebay search functionality

  @tc4 @smoke @regression
  Scenario: Search for iMac 2020
    Given user is on ebay home page
    When user searches for iMac 2020
    Then user sees about iMac only
    And there are more than 3 pages of results
