Feature: API
  Verify APIs with RestAssured


  Scenario: GET Method
    When sends Get Method
    Then the response code should be "400"

  Scenario: POST Method
    When sends Post Method
    Then the response code should be "200"