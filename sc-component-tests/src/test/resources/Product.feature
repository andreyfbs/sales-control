Feature: Products availables

  Scenario: List all products availables
    Given I'm a seller and I have the 01
    When I search products to sell
    Then The returned status is 200
    And The products are
    | name     | price   |
    | "Pen"    | "2.99"  |
    | "Pencil" | "1.50"  |