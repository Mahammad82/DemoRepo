Feature: Login page functionality 

	User enter credentials and lanch login page
	
@Test 
Scenario: Login page 

	Given User is on home page 
	When User enter username and password 
	And User click on submit button 
	Then User lanchs on login page