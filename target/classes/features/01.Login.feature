Feature: Login feature
This feature will simulate user experience when login to IsitUP


Scenario: User unable login with empty email
Given User open login page
And User fill login email with empty
And User fill login password
And User click login button
Then User view error empty email message
And User quit the browser


Scenario: User unable login with empty password
Given User open login page
And User fill login email
And User fill login password with empty
And User click login button
Then User view error empty password message
And User quit the browser


Scenario: User unable login with wrong email
Given User open login page
And User fill login email with wrong email
And User fill login password
And User click login button
Then User view toast message
And User quit the browser


Scenario: User unable login with wrong password
Given User open login page
And User fill login email
And User fill login password with wrong password
And User click login button
Then User view toast message
And User quit the browser


Scenario: User able login with valid data
Given User open login page
And User fill login email
And User fill login password
And User click login button
Then User redirect to dashboard page
And User quit the browser