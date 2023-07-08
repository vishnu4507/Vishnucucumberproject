@reg
Feature: 
  Facebook Application Demo
 
  Scenario: Login Should be successfull
    Given that I have gone to the Google page
    When I add Horse to the search box
    And click the Search Button
    Then cats should be mentioned in the results
    Then close the browser
