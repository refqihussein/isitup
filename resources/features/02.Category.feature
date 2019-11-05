Feature: Categoryy feature
This feature will simulate user experience when on IsitUP category page 


Scenario: User able cancel add category
Given User open login page
And User fill login email
And User fill login password
And User click login button
Then User redirect to dashboard page
And User click setup button menu
Then User redirect to setup page
And User click add new category button
And User fill category name
And User fill category description
And User click cancel button
And User back to category list
And User quit the browser


Scenario: User able add category
Given User open login page
And User fill login email
And User fill login password
And User click login button
Then User redirect to dashboard page
And User click setup button menu
Then User redirect to setup page
And User click add new category button
And User fill category name
And User fill category description
And User click add new button
Then User view toast message
And User quit the browser


Scenario: User able edit category
Given User open login page
And User fill login email
And User fill login password
And User click login button
Then User redirect to dashboard page
And User click setup button menu
Then User redirect to setup page
And User edit button on AA category
And User edit to AB
And User fill category description
And User click save button
Then User view toast message
And User quit the browser


Scenario: User able cancel delete category
Given User open login page
And User fill login email
And User fill login password
And User click login button
Then User redirect to dashboard page
And User click setup button menu
Then User redirect to setup page
And User delete button on AB category
Then User view pop up message
And User click no button
And User back to category list
And User quit the browser


Scenario: User able delete category
Given User open login page
And User fill login email
And User fill login password
And User click login button
Then User redirect to dashboard page
And User click setup button menu
Then User redirect to setup page
And User delete button on AB category
Then User view pop up message
And User click yes delete button
Then User view toast message
And User quit the browser