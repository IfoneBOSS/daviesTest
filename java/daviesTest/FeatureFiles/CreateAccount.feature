@create
Feature: Create an account

Background: 

	Given My browser is on the authentication page

Scenario: Create an account with a previously unregistered email address


  Then I enter unregistered email address "brandNewEmail145@mymail.com" into the Create an Account email address field

  When I Click create an account

  Then I should be taken to the user registration page


Scenario: Attempt to create a new account with a previously registered email address


  Then I enter the registered address email address "ianw.f1@gmail.com" into the create an account email address field

  When I Click create an account

  Then I should remain on the same page

  And I should see an error message stating that the account has already been registered


Scenario: Attempt to create a new account with an invalid email address


  Then I enter an invalid value "notAnEmail" into the Create an Account email address field

  When I Click create an account

  Then I should remain on the same page

   And I should see an error message stating that a valid email address must be used
   
    Scenario: Log in using registered email address and correct password
        
        
        And I enter my registered email address into the login email field
        
        And I enter a password into the password field
        
        When I click sign in
        
        Then I should be logged in successfully to my account
        
        
        
    Scenario: Attempt Log in using unregistered email address and password
        
        
        And I enter an unregistered email into the login email field
        
        And I enter a password into the password field
        
        When I click sign in
        
        Then I should not be logged in
        
        And should see an error message stating Authentication Failed
        

    Scenario: Attempt Log in using registered email address and incorrect password
        
        
        And I enter my registered email address into the login email field
        
        And I enter an incorrect password into the password field
        
        When I click sign in
        
        Then I should not be logged in
        
        And should see an error message stating Authentication Failed
        
        
    Scenario: Attempt Log in using registered email address but no password
        
        
        And I enter an unregistered email into the login email field
              
        When I click sign in
        
        Then I should not be logged in
        
        And should see an error message stating Password is required
        
        
    Scenario: Attempt Log in using no entered details
        
        
        When I click sign in
        
        Then I should not be logged in
        
        And should see error messages stating Email address and Password are both required
    
    
