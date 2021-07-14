Feature: Verify selenium webpage

  @test
  Scenario Outline: Verify Download Page
    Given user launch "<Browser_type>" browser
    When user enter URL https://www.selenium.dev/
    When Click on  download button from header of the page
    Then It should navigate to the downlod page

    Examples: 
      | Browser_type |
      | Chrome       |
      | Firefox      |

  @test
  Scenario Outline: Verify Governance and Sponsers page
    Given user launch "<Browser_type>" browser
    When user enter URL https://www.selenium.dev/
    And User click on the about section in the top header
    And Select Governance from the section and verify the navigation is successful
    And Click on Learn More from the bottom of the page
    Then it should navigate Sponsers page

    Examples: 
      | Browser_type |
      | Chrome       |
      | Firefox      |

  @test
  Scenario Outline: Verify Documentation
    Given user launch "<Browser_type>" browser
    When user enter URL https://www.selenium.dev/
    And User click on Documentation
    And User is in documentation page
    When User search "Grid" in the search panel
    And Select the second search result
    Then It should navigate to selected page

    Examples: 
      | Browser_type |
      | Chrome       |
