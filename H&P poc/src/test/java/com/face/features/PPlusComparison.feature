Feature: Login into Pregnancy Plus Application 
@PPlus 
Scenario Outline: Login using valid username and password 

	Given Click on no i will join later button 
	Then Enter the User Name <username> 
	Then Click on done button 
	Then Click on I agree 
	Then Click on Baby tab 
	Then Click on daily tab 
	Then Get text to verify 
	
	
	Examples: 
		|username	       |                                                    
		|Test              |
		
		
@PPlus1
Scenario Outline: Login using valid username and password 

	Given Click on no i will join later button 
	Then Enter the User Name <username> 
	Then Click on done button 
	Then Click on I agree 
	Then Click on Baby tab 
	Then Click on weekly tab 
	Then Get text to verify weekly pages
	 
	
	Examples: 
		|username	       |                                                    
		|Test              |
