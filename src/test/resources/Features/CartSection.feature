Feature: Cart Section


  Scenario Outline: Remove specific Product from Your Cart
    Given a user in the Home Page within "PRODUCTS" section
    When search for <Product Name>
    And add to the cart the <Product Name> just found
    And navigate to Your Cart section
    And remove the <Product Name> just added
    Then the product with name <Product Name> just removed should not be listed any more


    Examples:
      | Product Name              |
      | Sauce Labs Backpack       |
      | Sauce Labs Fleece Jacket  |
      | Sauce Labs Onesie         |


  Scenario Outline: Remove specific Product from Your Cart with Cart Section not empty
    Given a user in the Home Page within "PRODUCTS" section
    When search for <Product Name>
    And add to the cart the <Product Name> just found
    And Add to the cart a second <Second Product Name>
    And navigate to Your Cart section
    And remove the <Second Product Name> just added
    Then the product with name <Second Product Name> just removed should not be listed any more


    Examples:
      | Product Name              | Second Product Name     |
      | Sauce Labs Backpack       | Sauce Labs Bike Light   |


  Scenario Outline: Remove all Products from Your Cart section and validate CheckOut Button (Feature not implemented)
    Given a user in the Home Page within "PRODUCTS" section
    When search for <Product Name>
    And add to the cart the <Product Name> just found
    And Add to the cart a second <Second Product Name>
    And Add to the cart a third <Third Product Name>
    And navigate to Your Cart section
    And remove all Products from Your Cart section
    #Then CheckOut Button should be disable (Feature not implemented)


    Examples:
      | Product Name          | Second Product Name     | Third Product Name   |
      | Sauce Labs Backpack   | Sauce Labs Bike Light   | Sauce Labs Onesie    |
    