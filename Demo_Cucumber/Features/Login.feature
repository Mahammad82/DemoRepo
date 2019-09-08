Feature: Login 

	User enter unvalid credentials for lanching login page
	
@Test 
Scenario: Unsuccessfull login with unvalid credentials 

	Given User open URL "https://beta.sam.gov/" 
	And User clicks on sign in button 
	And User clicks on accept button 
	When User enters username as "demo@demo.com" and password as "123456789" 
	And User clicks on submit button 
	Then User gets error message as "resetting your password"