Feature: Location feature
This feature will simulate user experience when on IsitUP location page 


Scenario: User able cancel add location
Given User open login page
And User fill login email
And User fill login password
And User click login button
Then User redirect to dashboard page
And User click setup button menu
Then User redirect to setup page
And User click location button menu
And User click add new location button
And User fill setup location name
And User select company location from list
And User select show on map
And User click cancel button
Then User back to location list
And User quit the browser


Scenario: User able add location
Given User open login page
And User fill login email
And User fill login password
And User click login button
Then User redirect to dashboard page
And User click setup button menu
Then User redirect to setup page
And User click location button menu
And User click add new location button
And User fill setup location name
And User select company location from list
And User select show on map
And User click save button
Then User view toast message
And User quit the browser


Scenario: User able edit location
Given User open login page
And User fill login email
And User fill login password
And User click login button
Then User redirect to dashboard page
And User click setup button menu
Then User redirect to setup page
And User click location button menu
And User click edit peganden location
And User change location name
And User change company location from list
And User select show on map
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
And User click location button menu
And User delete location
Then User view pop up message
And User fill reason delete company
And User click no button
Then User back to location list
And User quit the browser


Scenario: User able delete location
Given User open login page
And User fill login email
And User fill login password
And User click login button
Then User redirect to dashboard page
And User click setup button menu
Then User redirect to setup page
And User click location button menu
And User delete location
Then User view pop up message
And User fill reason delete company
And User click yes delete button
Then User view toast message
And User quit the browser