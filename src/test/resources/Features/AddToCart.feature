Feature: Add To Cart


  Scenario Outline: Product exists in the list
    Given a user in the Home Page within "PRODUCTS" section
    When search for <Product Name>
    Then the product <Product Name> should be listed on Product Section


    Examples:
      | Product Name              | Product Price  |
      | Sauce Labs Fleece Jacket  | 49.99          |
    