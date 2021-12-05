Feature: Add To Cart


  Scenario Outline: Products that should not be listed in Products Section
    Given a user in the Home Page within "PRODUCTS" section
    When search for <Product Name>
    Then the product <Product Name> should not be listed on Product Section

    Examples:
      | Product Name        | Product Price  |
      | PS5                 | 49.99          |
      | PS4                 | 49.99          |
      | PS3                 | 49.99          |


  Scenario Outline: Products that should be listed in Products Section
    Given a user in the Home Page within "PRODUCTS" section
    When search for <Product Name>
    Then the product <Product Name> should be listed on Product Section

    Examples:
      | Product Name              |
      | Sauce Labs Backpack       |
      | Sauce Labs Fleece Jacket  |
      | Sauce Labs Onesie         |


  Scenario Outline: Add to cart a specific Product
    Given a user in the Home Page within "PRODUCTS" section
    When search for <Product Name>
    And add to the cart the <Product Name> just found
    Then the product <Product Name> should be listed on Your Cart Section with expected <Product Price>

    Examples:
      | Product Name              | Product Price  |
      | Sauce Labs Backpack       | 49.99          |
      | Sauce Labs Fleece Jacket  | 49.99          |
      | Sauce Labs Onesie         | 49.99          |
    