Feature: Supplier feature
This feature will simulate user experience when on IsitUP supplier page 


Scenario: User able cancel add suplier
Given User open login page
And User fill login email
And User fill login password
And User click login button
Then User redirect to dashboard page
And User click setup button menu
Then User redirect to setup page
And User click suplier button menu
And User click add new suplier button
And User fill suplier name
And User select suplier country from list
And User fill suplier state
And User fill suplier city
And User fill suplier street
And User fill suplier postal code
And User fill suplier contact person name
And User fill suplier primary contact number
And User fill suplier alternate contact number
And User fill suplier email address
And User fill suplier website
And User fill suplier company register id
And User click cancel button
And User back to suplier list
And User quit the browser


Scenario: User able add suplier
Given User open login page
And User fill login email
And User fill login password
And User click login button
Then User redirect to dashboard page
And User click setup button menu
Then User redirect to setup page
And User click suplier button menu
And User click add new suplier button
And User fill suplier name
And User select suplier country from list
And User fill suplier state
And User fill suplier city
And User fill suplier street
And User fill suplier postal code
And User fill suplier contact person name
And User fill suplier primary contact number
And User fill suplier alternate contact number
And User fill suplier email address
And User fill suplier website
And User fill suplier company register id
And User click save button
Then User view toast message
And User quit the browser


Scenario: User able edit suplier
Given User open login page
And User fill login email
And User fill login password
And User click login button
Then User redirect to dashboard page
And User click setup button menu
Then User redirect to setup page
And User click suplier button menu
And User search suplier name
And User click edit suplier button
And User change suplier name
And User change suplier country from list
And User change suplier state
And User change suplier city
And User change suplier street
And User change suplier postal code
And User change suplier contact person name
And User change suplier primary contact number
And User change suplier alternate contact number
And User change suplier email address
And User change suplier website
And User change suplier company register id
And User click edit button
Then User view toast message
And User quit the browser


Scenario: User able cancel delete suplier
Given User open login page
And User fill login email
And User fill login password
And User click login button
Then User redirect to dashboard page
And User click setup button menu
Then User redirect to setup page
And User click suplier button menu
And User search suplier name
And User click delete suplier button
Then User view pop up message
And User click no button
And User back to suplier list
And User quit the browser


Scenario: User able delete suplier
Given User open login page
And User fill login email
And User fill login password
And User click login button
Then User redirect to dashboard page
And User click setup button menu
Then User redirect to setup page
And User click suplier button menu
And User search suplier name
And User click delete suplier button
Then User view pop up message
And User click yes delete button
Then User view toast message
And User quit the browser