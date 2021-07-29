Feature: This is to test User Registration operation in Lumens page

@Scenario1
Scenario: Verifying User Registration functionality
	Given user able to open browser and enter url
	Then user able to mouseover on account and select my account
	Then user able to fill details for account creation
	Then user able to click createaccount button

@Scenario2
Scenario: user is able to Login Lumens  application
    Given user able to open browser and enter url
    When Mouse over to account and click sign In button
    Then Enter the valid credentials
    
@Scenario3   
Scenario: user is able to add the product to cart
 	Given user able to open browser and enter url
 	When Mouse over to account and click sign In button
 	Then Enter the valid credentials
 	Then user able to navigate to ligthings and Large Chandelier
 	Then user is able to select the product and add to cart
 
 @Scenario4
 Scenario: user in valid login operation
 	Given user able to open browser and enter url
 	When Mouse over to account and click sign In button
 	Then Enter the invalid credentials
 	Then user should get an error and takes screenshot
 
 @Scenario5
 Scenario: user is able to Signout Lumens  application
    Given user able to open browser and enter url
    When Mouse over to account and click sign In button
    Then Enter the valid credentials
    Then again mousehover on account click on signOut
 
 @Scenario6
  Scenario: user is able to Login Live chat   
    Given user able to open browser and enter url
    Then user should click livechat on homepage and login with valid credentials
    
@Scenario7
Scenario: user is able navigate through tabs
 	Given user able to open browser and enter url
 	When Mouse over to account and click sign In button
 	Then Enter the valid credentials
 	Then user able to navigate to ligthings and navigate Large Chandelier
 
# @Scenario8
# Scenario: user is able to search the product
# 	Given user able to open browser and enter url
# 	When Mouse over to account and click sign In button
# 	Then Enter the valid credentials
# 	Then user should enter the product name and able to search that product in search bar
 
 @Scenario9
Scenario: Verify the product able to select spcefic product
	Given user able to open browser and enter url
 	When Mouse over to account and click sign In button
 	Then Enter the valid credentials 
	Then Selcted Product and click on cart in HomePage  
    
@Scenario10	
Scenario: Verify scroll up, scroll down action on HomePage
    Given user able to open browser and enter url
 	When Mouse over to account and click sign In button
 	Then Enter the valid credentials 
	Then Use scroll up/down method in home page
	
@Scenario11
Scenario: Verify title of the Lumens application 
	Given user able to open browser and enter url
 	When Mouse over to account and click sign In button
 	Then Enter the valid credentials 
	Then  verify the title of lumens page 
	
@Scenario12
Scenario: Verify the user able to remove specific product
	Given user able to open browser and enter url
 	When Mouse over to account and click sign In button
 	Then Enter the valid credentials 
	Then Selcted Product add to cart and click on cart in HomePage
    Then Remove Product from the Cart
    
@Scenario13
 Scenario: user is able to enter coupon code
 	Given user able to open browser and enter url
 	When Mouse over to account and click sign In button
 	Then Enter the valid credentials
 	Then user able to navigate to ligthings and Large Chandelier
 	Then user is able to select the product and add to cart
 	Then user should click on cart and enter the coupon code and click apply
 	
 @Scenario14
 Scenario: user is able to navigate back in page
 	Given user able to open browser and enter url
 	When Mouse over to account and click sign In button
 	Then Enter the valid credentials
 	Then user should able to navigate the lights and navigate back to the homepage
 
 @Scenario15	
 Scenario: User able to increase the quantity of the product 
	Given user able to open browser and enter url
	When Mouse over to account and click sign In button 
	Then Enter the valid credentials 
	Then select the product and increase the quantity of the product

@Scenario16	
Scenario: user is able to view  the added product in the cart 
	Given user able to open browser and enter url 
	When Mouse over to account and click sign In button 
	Then Enter the valid credentials 
	And Mouseover on lightenings and select the product 
	Then add the product to the cart 
	And user is able to view the cart 
	
@Scenario17
 Scenario: User able to verify zip code
    Given user able to open browser and enter url
 	When Mouse over to account and click sign In button
 	Then Enter the valid credentials
 	Then user able to navigate to ligthings and Large Chandelier
 	Then user is able to select the product and add to cart
    Then enter the zipCode
