Feature: Add To Cart


  Scenario Outline: Products that should not be listed in Products Section
    Given a user in the Home Page within "PRODUCTS" section
    When search for <Product Name>
    Then the product <Product Name> should not be listed on Product Section

    Examples:
      | Product Name        |
      | PS5                 |
      | PS4                 |
      | PS3                 |


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
      | Sauce Labs Backpack       | $29.99         |
      | Sauce Labs Fleece Jacket  | $49.99         |
      | Sauce Labs Onesie         | $7.99          |
    