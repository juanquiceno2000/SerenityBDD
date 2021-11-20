Feature: API
  Verify APIs with RestSharp


  Scenario: GET Method
    Given a user in the Login Page
    When sends Get Method
    Then the response code should be "200"


  Scenario: POST Method
    Given a user in the Login Page
    When sends Post Method
    Then the response code should be "200"