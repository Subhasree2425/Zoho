Feature: LeafTaps Login


Scenario: TC001_Test Login Functionality with valid credential


Given Open Chrome Browser 
And launch Url 
And Enter Username as Demosalesmanager
And Enter Password as crmsfa  
When Click on Login Button
Then Verify Homepage is Displayed 