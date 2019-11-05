Feature: Company feature
This feature will simulate user experience when on IsitUP company page 


Scenario: User able cancel add company
Given User open login page
And User fill login email
And User fill login password
And User click login button
Then User redirect to dashboard page
And User click setup button menu
Then User redirect to setup page
And User click companies menu button
And User click add new company button
And User fill setup company name
And User fill setup company address field1
And User fill setup company address field2
And User fill setup company country
And User fill setup company state
And User fill setup company city
And User fill setup company street
And User fill setup company postal code
And User fill setup company registration id
And User fill setup company tax id
And User click cancel button
Then User back to company list
And User quit the browser


Scenario: User able add company
Given User open login page
And User fill login email
And User fill login password
And User click login button
Then User redirect to dashboard page
And User click setup button menu
Then User redirect to setup page
And User click companies menu button
And User click add new company button
And User fill setup company name
And User fill setup company address field1
And User fill setup company address field2
And User fill setup company country
And User fill setup company state
And User fill setup company city
And User fill setup company street
And User fill setup company postal code
And User fill setup company registration id
And User fill setup company tax id
And User click save button
Then User view toast message
Then User back to company list
And User quit the browser


Scenario: User able edit company
Given User open login page
And User fill login email
And User fill login password
And User click login button
Then User redirect to dashboard page
And User click setup button menu
Then User redirect to setup page
And User click companies menu button
And User click edit company
And User edit setup company name
And User edit setup company address field1
And User edit setup company address field2
And User edit setup company country
And User edit setup company state
And User edit setup company city
And User edit setup company street
And User edit setup company postal code
And User edit setup company registration id
And User edit setup company tax id
And User click save button
Then User view toast message
Then User back to company list
And User quit the browser


Scenario: User able cancel delete company
Given User open login page
And User fill login email
And User fill login password
And User click login button
Then User redirect to dashboard page
And User click setup button menu
Then User redirect to setup page
And User click companies menu button
And User click delete company
Then User view pop up message
And User fill reason delete company
And User click no button
Then User back to company list
And User quit the browser


Scenario: User able delete company
Given User open login page
And User fill login email
And User fill login password
And User click login button
Then User redirect to dashboard page
And User click setup button menu
Then User redirect to setup page
And User click companies menu button
And User click delete company
Then User view pop up message
And User fill reason delete company
And User click yes delete button
Then User view toast message
And User quit the browser