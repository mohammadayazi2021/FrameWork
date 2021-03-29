@Existing 
Feature: For this feature you have to have an existing account 


Background: Login to Existing Account 

	Given User is on Retail website 
	And User click on MyAccount 
	When  User clicked on Login 
	And User enter on emailaddress 'irfan@gmail.com' and password 'irfan123' 
	And User click on Login Btn 
@RegisterAffiliate 
Scenario: Register as an Affiliate user with Cheque Payment Method 
	When User click on ‘Register for an Affiliate Account’ link 
	And User fill affiliate form with below information 
		|company|website|taxID|paymentMethod|chequePayeeName|
		|Tekschool|http://tek-school.com/|123456|Cheque|Test|
	And User check on About us check box 
	And User click on Continue button 
	Then User should see a success message 
	
@AffiliateInfo 
Scenario: 
	Edit your affiliate information from Cheque payment method to Bank Transfer 
	When User click on ‘Edit your affiliate informationlink 
	And user click on Bank Transfer radio button 
	And User fill Bank information with below information 
		|bankName|abaNumber|swiftCode|accountName|accountNumber|
		|Test|123456789|123456|irfan|ahmad|
	And User click on Continue button 
	Then User should see a success message 
@AcctInfo 
Scenario: Edit your account Information 
	When User click on ‘Edit your account information’ link 
	And User modify below information 
		|firstname|lastName|email|telephone|
		|Test|Test|bob@gmail.com|123456789|
	And User click on continue button 
	Then User should see a message ‘Success: Your account has been successfully updated.’