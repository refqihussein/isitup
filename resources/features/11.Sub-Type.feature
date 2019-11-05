Feature: Sub Type feature
This feature will simulate user experience when on IsitUP Sub Type page 


Scenario: User able cancel add Sub Type
Given User open login page
And User fill login email
And User fill login password
And User click login button
Then User redirect to dashboard page
And User click setup button menu
Then User redirect to setup page
And User click dropdown type
And User click sub type button menu
And User click add new sub type button
And User select category sub type from list
And User select type from list
And User fill sub type name
And User click cancel button
Then User back to sub type list
And User quit the browser


Scenario: User able add Sub Type
Given User open login page
And User fill login email
And User fill login password
And User click login button
Then User redirect to dashboard page
And User click setup button menu
Then User redirect to setup page
And User click dropdown type
And User click sub type button menu
And User click add new sub type button
And User select category sub type from list
And User select type from list
And User fill sub type name
And User click save button
Then User view toast message
And User quit the browser


Scenario: User able edit Sub Type
Given User open login page
And User fill login email
And User fill login password
And User click login button
Then User redirect to dashboard page
And User click setup button menu
Then User redirect to setup page
And User click dropdown type
And User click sub type button menu
And User click edit sub type button
And User change category sub type from list
And User change type from list
And User change sub type name
And User click edit button
Then User view toast message
And User quit the browser


Scenario: User able search Sub Type
Given User open login page
And User fill login email
And User fill login password
And User click login button
Then User redirect to dashboard page
And User click setup button menu
Then User redirect to setup page
And User click dropdown type
And User click sub type button menu
And User search hardisk
Then User find hardisk result
And User quit the browser


Scenario: User able cancel delete Sub Type
Given User open login page
And User fill login email
And User fill login password
And User click login button
Then User redirect to dashboard page
And User click setup button menu
Then User redirect to setup page
And User click dropdown type
And User click sub type button menu
And User search hardisk
Then User find hardisk result
And User click delete sub type button
Then User view pop up message
And User click no button
Then User back to sub type list
And User quit the browser


Scenario: User able delete Sub Type
Given User open login page
And User fill login email
And User fill login password
And User click login button
Then User redirect to dashboard page
And User click setup button menu
Then User redirect to setup page
And User click dropdown type
And User click sub type button menu
And User search hardisk
Then User find hardisk result
And User click delete sub type button
Then User view pop up message
And User click yes delete button
Then User view toast message
And User quit the browser