Feature: To Test the add Customer functionality 

Scenario: To enter the Add Customer details
	Given The User is in gurantetelecom home page 
	And The User navigates to add customer page 
	When The user fill in the details 
	|Ramya| G |	ramyasekar@gmail.com | Chennai | 8870654456 |
	|Divya| Divu |	divyadivu@gmail.com | Bangalore | 7770686456 |
	|Agnes| Bhomila|	agnesbhomi@gmail.com | Salem | 9970654465 |
	And the User clicks the submit button 
	Then The Customer ID should be generated for the user