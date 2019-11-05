Feature: Manufacturer feature
This feature will simulate user experience when on IsitUP manufacturer page 


Scenario: User able cancel add manufacturer
Given User open login page
And User fill login email
And User fill login password
And User click login button
Then User redirect to dashboard page
And User click setup button menu
Then User redirect to setup page
And User click manufacturer button menu
And User click add new manufacturer button
And User fill manufacturer name
And User fill manufacturer description
And User click cancel button
And User back to manufacturer list
And User quit the browser


Scenario: User able add manufacturer
Given User open login page
And User fill login email
And User fill login password
And User click login button
Then User redirect to dashboard page
And User click setup button menu
Then User redirect to setup page
And User click manufacturer button menu
And User click add new manufacturer button
And User fill manufacturer name
And User fill manufacturer description
And User click add new button
Then User view toast message
And User quit the browser


Scenario: User able edit manufacturer
Given User open login page
And User fill login email
And User fill login password
And User click login button
Then User redirect to dashboard page
And User click setup button menu
Then User redirect to setup page
And User click manufacturer button menu
And User search viar manufacturer
And User click edit button on manufacturer
And User change manufacturer name
And User change manufacturer description
And User click save button
Then User view toast message
And User quit the browser


Scenario: User able cancel delete manufacturer
Given User open login page
And User fill login email
And User fill login password
And User click login button
Then User redirect to dashboard page
And User click setup button menu
Then User redirect to setup page
And User click manufacturer button menu
And User search tvs manufacturer
And User click delete button on manufacturer
Then User view pop up message
And User click no button
And User back to manufacturer list
And User quit the browser


Scenario: User able delete manufacturer
Given User open login page
And User fill login email
And User fill login password
And User click login button
Then User redirect to dashboard page
And User click setup button menu
Then User redirect to setup page
And User click manufacturer button menu
And User search tvs manufacturer
And User click delete button on manufacturer
Then User view pop up message
And User click yes delete button
Then User view toast message
And User quit the browser