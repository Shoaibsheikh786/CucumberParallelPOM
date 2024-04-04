Feature: Login feature

Scenario: To check the we are able to login the application with the valid credentials

Given user is on the login page
When user gives username "practice"
And user given password "SuperSecretPassword!"
Then user should be redirected to the dashboard "Test Automation Practice: Working with Secure Page"

Scenario: To check we are not able to login with invalid credentials 
Given user is on the login page
When user gives username "xxxxx"
And user given password "XXxXXX"
Then user should be redirected to the dashboard "Test Automation Practice: Working with Login form"

Scenario: To check the we are able to login the application with the valid credentials

Given user is on the login page
When user gives username "practice"
And user given password "SuperSecretPassword!"
Then user should be redirected to the dashboard "Test Automation Practice: Working with Secure Page"

Scenario: To check we are not able to login with invalid credentials 
Given user is on the login page
When user gives username "xx1xxx"
And user given password "1XXxXXX"
Then user should be redirected to the dashboard "Test Automation Practice: Working with Login form"