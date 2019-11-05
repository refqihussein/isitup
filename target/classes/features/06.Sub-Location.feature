Feature: Sub-Location feature
This feature will simulate user experience when on IsitUP sub-location page 


Scenario: User able cancel add sub location
Given User open login page
And User fill login email
And User fill login password
And User click login button
Then User redirect to dashboard page
And User click setup button menu
Then User redirect to setup page
And User click dropdown location
And User click sub location button menu
And User click add new sub location button
And User select company sub location from list
And User select location for sub location
And User fill sub location name
And User fill sub location address
And User click cancel button
Then User back to sub location list
And User quit the browser


Scenario: User able add sub location
Given User open login page
And User fill login email
And User fill login password
And User click login button
Then User redirect to dashboard page
And User click setup button menu
Then User redirect to setup page
And User click dropdown location
And User click sub location button menu
And User click add new sub location button
And User select company sub location from list
And User select location for sub location
And User fill sub location name
And User fill sub location address
And User click add new button
Then User view toast message
And User quit the browser


Scenario: User able search sub location
Given User open login page
And User fill login email
And User fill login password
And User click login button
Then User redirect to dashboard page
And User click setup button menu
Then User redirect to setup page
And User click dropdown location
And User click sub location button menu
And User search ziyadah
Then User find ziyadah result
And User quit the browser


Scenario: User able edit sub location
Given User open login page
And User fill login email
And User fill login password
And User click login button
Then User redirect to dashboard page
And User click setup button menu
Then User redirect to setup page
And User click dropdown location
And User click sub location button menu
And User click edit sub location button
And User change company sub location from list
And User change location for sub location
And User change sub location name
And User change sub location address
And User click save button
Then User view toast message
And User quit the browser


Scenario: User able cancel delete location
Given User open login page
And User fill login email
And User fill login password
And User click login button
Then User redirect to dashboard page
And User click setup button menu
Then User redirect to setup page
And User click dropdown location
And User click sub location button menu
And User click delete sub location button
Then User view pop up message
And User click no button
And User back to sub location list
And User quit the browser


Scenario: User able delete location
Given User open login page
And User fill login email
And User fill login password
And User click login button
Then User redirect to dashboard page
And User click setup button menu
Then User redirect to setup page
And User click dropdown location
And User click sub location button menu
And User click delete sub location button
Then User view pop up message
And User click yes delete button
Then User view toast message
And User quit the browser