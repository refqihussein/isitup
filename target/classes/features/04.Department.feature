Feature: Department feature
This feature will simulate user experience when on IsitUP department page 


Scenario: User able cancel add department
Given User open login page
And User fill login email
And User fill login password
And User click login button
Then User redirect to dashboard page
And User click setup button menu
Then User redirect to setup page
And User click department button menu
And User click add new department button
And User fill setup department name
And User select company from list
And User click cancel button
Then User back to department list
And User quit the browser


Scenario: User able add department
Given User open login page
And User fill login email
And User fill login password
And User click login button
Then User redirect to dashboard page
And User click setup button menu
Then User redirect to setup page
And User click department button menu
And User click add new department button
And User fill setup department name
And User select company from list
And User click add new button
Then User view toast message
And User quit the browser


Scenario: User able edit department
Given User open login page
And User fill login email
And User fill login password
And User click login button
Then User redirect to dashboard page
And User click setup button menu
Then User redirect to setup page
And User click department button menu
And User edit button on QA category
And User edit to QC
And User select other company from list
And User click save button
Then User view toast message
And User quit the browser


Scenario: User able cancel delete department
Given User open login page
And User fill login email
And User fill login password
And User click login button
Then User redirect to dashboard page
And User click setup button menu
Then User redirect to setup page
And User click department button menu
And User delete button on QC department
Then User view pop up message
And User click no button
Then User back to department list
And User quit the browser


Scenario: User able delete department
Given User open login page
And User fill login email
And User fill login password
And User click login button
Then User redirect to dashboard page
And User click setup button menu
Then User redirect to setup page
And User click department button menu
And User delete button on QC department
Then User view pop up message
And User click yes delete button
Then User view toast message
And User quit the browser