Feature: Item Code feature
This feature will simulate user experience when on IsitUP Item Code page 


Scenario: User able cancel add Item Code
Given User open login page
And User fill login email
And User fill login password
And User click login button
Then User redirect to dashboard page
And User click setup button menu
Then User redirect to setup page
And User click item code button menu
And User click add new item code button
And User fill item code
And User fill code name
And User fill item code description
And User select manufacture from list
And User select model from list
And User select categories from list
And User select asset type from list
And User select suplier from list
And User click cancel button
And User back to item code list
And User quit the browser


Scenario: User able add Item Code
Given User open login page
And User fill login email
And User fill login password
And User click login button
Then User redirect to dashboard page
And User click setup button menu
Then User redirect to setup page
And User click item code button menu
And User click add new item code button
And User fill item code
And User fill code name
And User fill item code description
And User select manufacture from list
And User select model from list
And User select categories from list
And User select asset type from list
And User select suplier from list
And User click add new button
Then User view toast message
And User quit the browser


Scenario: User able edit Item Code
Given User open login page
And User fill login email
And User fill login password
And User click login button
Then User redirect to dashboard page
And User click setup button menu
Then User redirect to setup page
And User click item code button menu
And User click edit item code button
And User change item code
And User change code name
And User change item code description
And User change manufacture from list
And User change model from list
And User change categories from list
And User change asset type from list
And User change suplier from list
And User click edit button
Then User view toast message
And User quit the browser


Scenario: User able cancel delete Item Code
Given User open login page
And User fill login email
And User fill login password
And User click login button
Then User redirect to dashboard page
And User click setup button menu
Then User redirect to setup page
And User click item code button menu
And User click delete item code button
Then User view pop up message
And User wait for some second
And User click no button
And User back to item code list
And User quit the browser


Scenario: User able delete Item Code
Given User open login page
And User fill login email
And User fill login password
And User click login button
Then User redirect to dashboard page
And User click setup button menu
Then User redirect to setup page
And User click item code button menu
And User click delete item code button
Then User view pop up message
And User click yes delete button
Then User view toast message
And User quit the browser