Feature: Resume Login Functionality


  #@Smoke
  #Scenario Outline: Resume Login
    #Given is on Login Page
    #Then user Enters Username "<Username>" and Password "<Password>" and Clicks on Login button
    #Then Start The Exam
    #Then user Clicks on Esc button and refresh the Browser
#
    #Examples: 
      #| Username | Password |
      #| gt0103   | U5qZVhTy |
#
  #@Regression
  #Scenario Outline: Resume Login
    #Given user is on Login Page
    #Then user Enters Username as "<Username>" and Password as "<Password>" and Clicks on Login button
    #Then user Clicks on Start The Exam
    #Then user Clicks on Esc button and Click on Yes in PopUp
    #Then Refresh the Browser
#
    #Examples: 
      #| Username | Password |
      #| gt0103   | U5qZVhTy |

Background: User Logged In
    Given user is on Login Page
    Then user Enters Username  and Password and Clicks on Login button
      | Username | Password |
      | gt0103   | U5qZVhTy |
    Then user Clicks on Start The Exam

    
@Smoke      
Scenario: Escape and Refresh
	When user Clicks on Esc button and refresh the Browser
@Regression
Scenario: Escape and Refresh and Yes
    When user Clicks on Esc button and Click on Yes in PopUp and Refresh The Browser
    
@Sanity
Scenario: Escape and Refresh and No
    When user Clicks on Esc button and Click on No in PopUp and Refresh The Browser
    
@Smoke1
Scenario: Escape and No
When user clicks on Escape and No in Popup

@Smoke2
Scenario: Escape and yes
When user clicks on Escape and yes in Popup 



   




    
    

