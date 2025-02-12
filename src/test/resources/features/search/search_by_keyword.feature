Feature: Search by keyword

  @green
  Scenario: Searching for 'green'
    Given Sergey opens sauce demo login page
    When he login with credentials "standard_user" "secret_sauce"
    Then he should see sauce demo home page
