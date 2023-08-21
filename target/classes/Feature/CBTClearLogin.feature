Feature: Clear Login
Background: User Logged In
Given user is on Login Page
Then user Enters Username and Password
|Username|Password|
|gt0701|J5xhpAYu|
Then user Clicks on LoginButton

Scenario: Login Admin
Given user is on Admin Login Page
Then User Enters Admin Module Username and Password
|Username|Password|
|admin+MT0009@edulabcbt.com|admin123|
And user clicks on admin LoginButton
Given user Clicks on clear Login
Then user select The centre
And clicks Examinees number
And user Enter on Examniees number in Candidates Search
And user Clicks on Search
And user select Radio button
Then user Clicks on Choice
And Clear Login

Scenario: Again Login 
And user Navigate Forward to test Taker module
And Enters Username and Password
|Username|Password|
|gt0701|J5xhpAYu|
And User Should be Logged In successFully





