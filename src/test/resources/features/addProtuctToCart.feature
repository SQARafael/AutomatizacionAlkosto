Feature: Add product to cart Alkosto

  @AddProduct
  Scenario: Add product success to cart
    Given User open browser Alkosto.com
    When User choose a category and subcategory
    And user user choose product
    Then User can view a message successfully