Feature: Validate search functionality

  Background: users launches webpage
    Given amazon webpage is launched

  @SanityFlow
  Scenario Outline: Search for a product and validate the results
    When user enters a product name"<product name>" in the search box
    And clicks on search button
    Then search results should be displayed

    Examples:
      |product name|
      |Phone       |
      |TV          |