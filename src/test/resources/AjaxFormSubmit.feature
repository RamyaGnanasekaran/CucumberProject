Feature: To Test the Input Forms in Selenium easy Page - Ajax Form Submit

Scenario: To Fill and submit the Ajax form in Demo page
	Given The User is in Selenium home page to fill the Ajax form
	And The User navigates to the Ajax Form Submit page 
	When The user fill the Ajax form details
	|Ramya|Ajax Form|
	And the user clicks on Submit button in the Ajax form
	Then The Form submitted successfully message should display