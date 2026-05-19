Feature: Login page Automation of saucedemo App

  Scenario Outline: Check login is successful with valid creds
    Given User is on login page
    When User enters valid <username> and <password>
    And Clicks on Login Button
    Then User is navigated to Hpme Page
    And Close the browser
      
  Examples:
      | username       | password     | 
      | admin          | admin123     | 
      | admin          | wrongpass    | 
      | wronguser      | admin123     |    
    
