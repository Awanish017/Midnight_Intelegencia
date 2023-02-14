Feature: Midnight functionality

 Background: Step to login
    Given User Launch Chorme Browser
    When User Open URL "https://rc.vsmidnight.com/"
    And User Enter User Name "vsuser"
    And User Enter Password "Inthemidnighthour"
    And User Click on Login Button
    Then Page titel should be "Midnight"

 Scenario: First-Open the CRM Page Search Page
    When User Click on CRM Module
    And Click on New Customer Button
    When Click on Cancel Button
    Then Click on Logout button
    And Close the Browser

 Scenario: Second-Open the Estimate Search Page
    And Click on Estimate MOdule
    And Click on New Estimate Butto
    And Click on Cancel Button
    Then Click on Logout button
    And Close the Browser
    
  Scenario: Third-Open the Order Module
     And Click OrderModule
     And Click on ExtendedSearch Button
     And Click on Extendesearch Cancel button
     And Click on New Order Button
     And Click on Order Cancel button
     Then Click on Logout button
     And Close the Browser
       
