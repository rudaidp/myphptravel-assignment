Feature: Customer Registration

Scenario: Successfully create New Customer
Given user open PHP travel website
When user click signup menu to open registration form
And user input correct data
And user click sign up button
Then user should be in account page

