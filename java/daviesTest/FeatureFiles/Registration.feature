Feature: User registration

Background:

	Given My browser is on the user registration page


@registration
Scenario: Complete registration with all mandatory information mobile number
    
  
        
    And I have entered a first name
        
    And I have entered a last name
    
    And I have entered a password
    
    And I have entered an address
    
    And I have entered a city
    
    And I have entered a zip code
    
    And I have selected a state
    
    And I have entered a mobile phone number
        
  When I click register
        
  Then I should be sent to the My Account page
        
   
        

Scenario: Complete registration with all mandatory information home phone number
    
        
    And I have entered a first name
        
    And I have entered a last name
    
    And I have entered a password
    
    And I have entered an address
    
    And I have entered a city
    
    And I have entered a zip code
    
    And I have selected a state
    
    And I have entered a home phone number
        
  When I click register
        
  Then I should be sent to the My Account page
        
        
        
    
Scenario: Attempt to register without a first name
    
        
    And I have entered a last name
    
    And I have entered a password
    
    And I have entered an address
    
    And I have entered a city
    
    And I have entered a zip code
    
    And I have selected a state
    
    And I have entered a mobile phone number
        
  When I click register
        
  Then I should be sent to the My Account page
        
  When I click register
        
  Then my account should not be created
        
   And I should see an error message stating First Name is required
        
        
Scenario: Attempt to register without a last name
    
    And I have entered a first name
    
    And I have entered a password
    
    And I have entered an address
    
    And I have entered a city
    
    And I have entered a zip code
    
    And I have selected a state
    
    And I have entered a mobile phone number
        
  When I click register
        
  Then I should be sent to the My Account page
        
  When I click register
        
  Then my account should not be created
        
    And I should see an error message stating last name is required
        
        
Scenario: Attempt to register without an email address
    
    And I have entered a first name
    
    And I have entered a last name
    
    And I have entered a password
    
    And I have entered an address
    
    And I have entered a city
    
    And I have entered a zip code
    
    And I have selected a state
    
    And I have entered a mobile phone number
              
    But I have deleted the contents of the email address field
        
  When I click register
        
  Then my account should not be created
        
    And I should see an error message stating email address is required
   
    
Scenario: Attempt to register without a password
    
    And I have entered a first name
    
    And I have entered a last name
    
    And I have entered an address
    
    And I have entered a city
    
    And I have entered a zip code
    
    And I have selected a state
    
    And I have entered a mobile phone number
        
  When I click register
       
  Then my account should not be created
        
    And I should see an error message stating password is required
        

Scenario: Attempt to register without an address line
    
	And I have entered a first name
    
    And I have entered a last name
    
    And I have entered a password   
    
    And I have entered a city
    
    And I have entered a zip code
    
    And I have selected a state
    
    And I have entered a mobile phone number
    
  When I click register
        
  Then my account should not be created
        
    And I should see an error message stating address is required
        
        
Scenario: Attempt to register without a city entered in the address
    
And I have entered a first name
    
    And I have entered a last name
    
    And I have entered a password
    
    And I have entered an address
    
    And I have entered a zip code
    
    And I have selected a state
    
    And I have entered a mobile phone number
    
  When I click register
        
  Then my account should not be created
        
    And I should see an error message stating city is required
        
        
Scenario: Attempt to register without a zip code entered in the address
    
And I have entered a first name
    
    And I have entered a last name
    
    And I have entered a password
    
    And I have entered an address
    
    And I have entered a city
    
    And I have selected a state
    
    And I have entered a mobile phone number
        
  When I click register
        
  Then my account should not be created
        
    And I should see an error message stating zip code is required
        
        
Scenario: Attempt to register without a state selected
    
And I have entered a first name
    
    And I have entered a last name
    
    And I have entered a password
    
    And I have entered an address
    
    And I have entered a city
    
    And I have entered a zip code
    
    And I have entered a mobile phone number
        
  When I click register
        
  Then my account should not be created
        
    And I should see an error message stating that state is required
        
        
Scenario: Attempt to register without a country selected
    
And I have entered a first name
    
    And I have entered a last name
    
    And I have entered a password
    
    And I have entered an address
    
    And I have entered a city
    
    And I have entered a zip code
    
    And I have selected a state
    
    And I have entered a mobile phone number
    
    But I have deleted the entered country
        
  When I click register
        
  Then my account should not be created
        
    And I should see an error message stating that country is required
        
        
Scenario: Attempt to register without a phone number
    
And I have entered a first name
    
    And I have entered a last name
    
    And I have entered a password
    
    And I have entered an address
    
    And I have entered a city
    
    And I have entered a zip code
    
    And I have selected a state
        
  When I click register
        
  Then my account should not be created
        
    And I should see an error message stating that at least one phone number is required
    