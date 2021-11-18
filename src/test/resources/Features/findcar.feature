Feature: Finding new cars
  As a user
  i want to find new cars
  to decide which one to buy

  Scenario Outline: Find a new car
    Given a user in the website
    And in the new cars section
    When user select the <brand> option
    Then the cars of that <brand> show

    Examples:
| brand  |
| Kia    |
| Toyota |
| Honda  |
