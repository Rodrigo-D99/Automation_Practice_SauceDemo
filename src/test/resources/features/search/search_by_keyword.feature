Feature: Search by keyword

  @login
  Scenario: Searching in page
    Given Sergey opens sauce demo login page
    When he login with credentials "standard_user" "secret_sauce"
    Then he click on add product to cart

