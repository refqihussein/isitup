Feature: Model feature
This feature will simulate user experience when on IsitUP model page 


Scenario: User able cancel add model
Given User open login page
And User fill login email
And User fill login password
And User click login button
Then User redirect to dashboard page
And User click setup button menu
Then User redirect to setup page
And User click dropdown manufacturer
And User click model button menu
And User click add new model button
And User select manufacturer from list
And User fill model name
And User click cancel button
Then User back to model list
And User quit the browser


Scenario: User able add model
Given User open login page
And User fill login email
And User fill login password
And User click login button
Then User redirect to dashboard page
And User click setup button menu
Then User redirect to setup page
And User click dropdown manufacturer
And User click model button menu
And User click add new model button
And User select manufacturer from list
And User fill model name
And User click add new button
Then User view toast message
And User quit the browser


Scenario: User able edit model
Given User open login page
And User fill login email
And User fill login password
And User click login button
Then User redirect to dashboard page
And User click setup button menu
Then User redirect to setup page
And User click dropdown manufacturer
And User click model button menu
And User search yamaha model
And User click edit model button
And User change manufacturer from list
And User change model name
And User click save button
Then User view toast message
And User quit the browser


Scenario: User able cancel delete model
Given User open login page
And User fill login email
And User fill login password
And User click login button
Then User redirect to dashboard page
And User click setup button menu
Then User redirect to setup page
And User click dropdown manufacturer
And User click model button menu
And User search honda model
And User click delete model button
Then User view pop up message
And User click no button
And User back to category list
And User quit the browser


Scenario: User able delete model
Given User open login page
And User fill login email
And User fill login password
And User click login button
Then User redirect to dashboard page
And User click setup button menu
Then User redirect to setup page
And User click dropdown manufacturer
And User click model button menu
And User search honda model
And User click delete model button
Then User view pop up message
And User click yes delete button
Then User view toast message
And User quit the browser