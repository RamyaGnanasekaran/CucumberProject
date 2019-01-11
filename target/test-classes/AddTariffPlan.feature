Feature: To Test the Add Tariff functionality

Scenario: To enter the Add Tariff details
	Given The User is in gurantetelecom Demo Site
	And The User navigates to add tariff plans page 
	When The user should enter all the details
	 |rental1| 1000|
	 |local_minutes | 1000 |
	 |inter_minutes | 100 |
	 |sms_pack | 1000 |
	 |minutes_charges| 2 |
	 |inter_charges| 5 |	
	 |sms_charges| 1 |
	And The User click on submit button
	Then The Tariff plan should be added for the user