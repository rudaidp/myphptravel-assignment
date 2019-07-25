Feature: Search Hotel as guest or as registered user

Scenario: Successfully search Hotel for input criteria as guest
Given user open PHP travel website as guest
When user enters valid search criteria
And user clicks search-button
Then search result page is displayed