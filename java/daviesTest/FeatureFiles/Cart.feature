Feature: Add to cart

    Background:
    
        Given I have signed into my account

    @cart
    Scenario: Add item to cart from item profile
    
        
        And have navigated to an in stock item profile that I wish to buy
        
        When I click add to Cart
        
        Then the selected item should appear in my cart
        
        
    Scenario: Add item to cart from hover over item
    
        
        And hovered over an item to reveal the summary and options
        
        When I click add to Cart
        
        Then the selected item should appear in my cart
        