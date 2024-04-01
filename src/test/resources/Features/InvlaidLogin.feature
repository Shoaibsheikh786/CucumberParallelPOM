
Feature: Login Functionality

Scenario: To check we are not able to login with invalid credentials 
Given user is on the login page
When user gives username "xxxxx"
And user given password "XXxXXX"
Then user should be redirected to the dashboard "Test Automation Practice: Working with Login form"
