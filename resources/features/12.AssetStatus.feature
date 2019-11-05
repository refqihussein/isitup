Feature: Asset Status feature
This feature will simulate user experience when on IsitUP Asset Status page 


Scenario: User able cancel add Asset Status
Given User open login page
And User fill login email
And User fill login password
And User click login button
Then User redirect to dashboard page
And User click setup button menu
Then User redirect to setup page
And User click asset status button menu
And User click add asset status button
And User fill asset status name
And User click cancel button
And User back to asset status list
And User quit the browser


Scenario: User able add Asset Status
Given User open login page
And User fill login email
And User fill login password
And User click login button
Then User redirect to dashboard page
And User click setup button menu
Then User redirect to setup page
And User click asset status button menu
And User click add asset status button
And User fill asset status name
And User click save button
Then User view toast message
And User quit the browser


Scenario: User able search Asset Status
Given User open login page
And User fill login email
And User fill login password
And User click login button
Then User redirect to dashboard page
And User click setup button menu
Then User redirect to setup page
And User click asset status button menu
And User search added asset status
Then User view search result
And User quit the browser


Scenario: User able edit Asset Status
Given User open login page
And User fill login email
And User fill login password
And User click login button
Then User redirect to dashboard page
And User click setup button menu
Then User redirect to setup page
And User click asset status button menu
And User search added asset status
Then User view search result
And User click edit asset status button
And User change asset status name
And User click edit button
Then User view toast message
And User quit the browser


Scenario: User able cancel delete Asset Status
Given User open login page
And User fill login email
And User fill login password
And User click login button
Then User redirect to dashboard page
And User click setup button menu
Then User redirect to setup page
And User click asset status button menu
And User search added asset status
Then User view search result
And User click delete asset status button
Then User view pop up message
And User click no button
And User back to asset status list
And User quit the browser


Scenario: User able delete Asset Status
Given User open login page
And User fill login email
And User fill login password
And User click login button
Then User redirect to dashboard page
And User click setup button menu
Then User redirect to setup page
And User click asset status button menu
And User search added asset status
Then User view search result
And User click delete asset status button
Then User view pop up message
And User click yes delete button
Then User view toast message
And User quit the browser