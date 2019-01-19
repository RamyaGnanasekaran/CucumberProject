
Feature: To Test the payment Gateway Project

Background: 
Given the user clicks on Generate Card Number
And the User gets the card details Card number, Cvv, Exp, Credit Limit

Scenario: To buy the Elephant toy using credit card

	When The user Clicks on Cart fill in the details and click on Buy now button
	And The user navigates to the payment process page and fill in the card details and click on Pay button
	
	Then Verify the order successful message
	And the user check the Credit card limit