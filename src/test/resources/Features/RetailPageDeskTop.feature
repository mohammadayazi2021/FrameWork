@Desktop 
Feature: Desktops Feature 

Background: 
	Given User is on Retail website 
	When User click on Desktops tab 
	And User click on Show all desktops 
@Desk 
Scenario: User add HP LP 3065  from Desktops tab to the cart 

	And User click ADD TO CARToption on ‘HP LP3065’item 
	And User select quantity 1 
	And User click add to Cart button 
	Then User should see a message ‘Success: you have added HP LP 3065 to your Shopping cart!’ 
	
@Canon 
Scenario: User add Canon EOS 5D from Desktops tab to the cart 

	And User click ADD TO CART option on ‘Canon EOS 5D’ item 
	And User select color from dropdown ‘Red’ 
	And User select Canon quantity 1 
	And User click add to Canon Cart button 
	Then User should see a message ‘Success: You have added Canon EOS 5D to your shopping cart!