Feature: To Test the Input Forms in Selenium easy Page - Input Form Submit

Scenario: To Fill and submit the Input form in Demo page
	Given The User is in Selenium home page to submit Input form
	And The User navigates to the Input Form Submit page
	When The user fill in the details in the input form Page
|Ramya|Gnana Sekar|ramyasekar@gmail.com|8870654456|Royapettah|Chennai|600 014|Air Travel|Air Travel Project|
	And the user clicks on Send button
	Then The success message should display