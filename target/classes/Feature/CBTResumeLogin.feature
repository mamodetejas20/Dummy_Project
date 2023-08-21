Feature: Resume Login Validation
Background: User is logged in TestTakerModule
Given User Is Login Page
Then User Enters Username and Password
|Username|Password|
|gt0702|y6A2sFMw|
Then Clicks on Login button
And User clicks on Resume Test
And Confirmation Popup should be Displayed  



Scenario: Resume Exam On Admin Module
Given Admin is on login page
And Admin is logged in Sucesfully 
|Username|Password|
|admin+MT0009@edulabcbt.com|admin123|
Then admin Clicks on Resume Exam 
And clicks on Examinees Number
And Search Examinees Number in SearchField
And Clicks on Search
And Clicks on RadioButton
And Clicks on Choicebutton
And Admin gives Required time Adjustments
And Clicks on Submitted

Scenario: User Again Login in TestTaker Module
Given user Navigates to test Taker module
And user Looged in
|Username|Password|
|gt0702|y6A2sFMw|
And Clicks on Resume Test





