Feature: Signup feature
This feature will simulate user experience when sign up to IsitUP


Scenario: User unable signup with empty first name
Given User open signup page
And User fill first name with empty
And User fill last name
And User fill company name
And User fill email address
And User click agreement
And User click register button
Then User view error first name message
And User quit the browser


Scenario: User unable signup with empty last name
Given User open signup page
And User fill first name
And User fill last name with empty
And User fill company name
And User fill email address
And User click agreement
And User click register button
Then User view error last name message
And User quit the browser


Scenario: User unable signup with empty company name
Given User open signup page
And User fill first name
And User fill last name
And User fill company name with empty
And User fill email address
And User click agreement
And User click register button
Then User view error company name message
And User quit the browser


Scenario: User unable signup with empty email address
Given User open signup page
And User fill first name
And User fill last name
And User fill company name
And User fill email address with empty
And User click agreement
And User click register button
Then User view error email address message
And User quit the browser


Scenario: User unable signup with wrong format email
Given User open signup page
And User fill first name
And User fill last name
And User fill company name
And User fill email address with wrong format
And User click agreement
And User click register button
Then User view error email address message
And User quit the browser


Scenario: User able signup with valid data
Given User open signup page
And User fill first name
And User fill last name
And User fill company name
And User fill email address
And User click agreement
And User wait for some second
And User click register button
Then User view register success message
And User quit the browser