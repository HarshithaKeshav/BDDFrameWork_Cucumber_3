Feature: Validate search functionality

  Background: users launches webpage
    Given amazon webpage is launched in "chrome"

  @SanityFlow
  Scenario Outline: Search for a product and validate the results
    When user enters a product name"<product name>" in the search box
    And clicks on search button
    Then search results should be displayed

    Examples:
    |product name|
    |Phone       |
    |TV          |

  @RegressionFlow
  Scenario: Search for a product and validate the results
    When user enters a product in the search box

    |product1|product2|
    |product3|product4|

    And clicks on search button
    Then search results should be displayed


  @RegressionFlow
  Scenario Outline: Search for a product and validate the results
    When user enters a product name"<product name>" in the search box
    And clicks on search button
    Then search results should be displayed

    Examples:
      |product name|
      |MacBook     |
      |Ipad        |