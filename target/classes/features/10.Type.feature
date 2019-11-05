Feature: Type feature
This feature will simulate user experience when on IsitUP type page 


Scenario: User able cancel add type
Given User open login page
And User fill login email
And User fill login password
And User click login button
Then User redirect to dashboard page
And User click setup button menu
Then User redirect to setup page
And User click type button menu
And User click add new type button
And User select category from list
And User fill type name
And User click cancel button
And User back to type list
And User quit the browser


Scenario: User able add type
Given User open login page
And User fill login email
And User fill login password
And User click login button
Then User redirect to dashboard page
And User click setup button menu
Then User redirect to setup page
And User click type button menu
And User click add new type button
And User select category from list
And User fill type name
And User click save button
Then User view toast message
And User quit the browser


Scenario: User able edit type
Given User open login page
And User fill login email
And User fill login password
And User click login button
Then User redirect to dashboard page
And User click setup button menu
Then User redirect to setup page
And User click type button menu
And User search typename
And User find typename
And User click edit type button
And User change category from list
And User change type name
And User click edit button
Then User view toast message
And User quit the browser


Scenario: User able cancel delete type
Given User open login page
And User fill login email
And User fill login password
And User click login button
Then User redirect to dashboard page
And User click setup button menu
Then User redirect to setup page
And User click type button menu
And User search typename
And User find typename
And User click delete type button
Then User view pop up message
And User click no button
And User back to type list
And User quit the browser


Scenario: User able delete type
Given User open login page
And User fill login email
And User fill login password
And User click login button
Then User redirect to dashboard page
And User click setup button menu
Then User redirect to setup page
And User click type button menu
And User search typename
And User find typename
And User click delete type button
Then User view pop up message
And User click yes delete button
Then User view toast message
And User quit the browser