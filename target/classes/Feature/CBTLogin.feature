Feature: Login Page Functionality

  Background: user is logged in
    Given user is on login page

  @ValidLoginCredentials
  Scenario Outline: Login With Valid Credentials
    Then User Enter valid Username "<Username>" and valid Password "<Password>"
    And User Enters Login button
    Then User Clicks On LogOut Tab 
    And User Clicks on Logout button
    Then Return To loginpage Popup Displayed
    Then User Return to Login Page
    

    Examples: 
      | Username | Password |
      | gt0701   | J5xhpAYu |

  @InvalidLoginCredentials
  Scenario Outline: Login With InValid Credentials
    Then User Enter Invalid Username "<Username>" and Invalid Password "<Password>"
    And User Hits Login button
    And Close The Browser

    Examples: 
      | Username | Password |
      | gt       | J5       |
