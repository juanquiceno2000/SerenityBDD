Feature: Login to the App
  As a user
  i want to login to the app
  to access the features available


  Scenario: Login Failed due to incorrect UserName
    Given a user in the Login Page for "Login Failed due to incorrect UserName" scenario
    When the user enters an incorrect UserName
    And the user enters expected Password
    And click on Login Button
    Then the system throws the error "Epic sadface: Username and password do not match any user in this service" message


  Scenario: Login Failed due to incorrect Password
    Given a user in the Login Page for "Login Failed due to incorrect Password" scenario
    When the user enters expected UserName
    And the user enters an incorrect Password
    And click on Login Button
    Then the system throws the error "Epic sadface: Username and password do not match any user in this service" message


  Scenario: Validate Mandatory UserName Field
    Given a user in the Login Page for "Validate Mandatory UserName Field" scenario
    When the user doesn't enter UserName in the Username field
    And the user enters expected Password
    And click on Login Button
    Then the system throws the error "Epic sadface: Username is required" message


  Scenario: Validate Mandatory Password Field
    Given a user in the Login Page for "Validate Mandatory Password Field" scenario
    When the user enters expected UserName
    And the user doesn't enter Password in the Password field
    And click on Login Button
    Then the system throws the error "Epic sadface: Password is required" message


  Scenario: Login Successfully
    Given a user in the Login Page for "Login Successfully" scenario
    When the user enters expected UserName
    And the user enters expected Password
    And click on Login Button
    Then the system grant access by leaving the user on the Home Page in "PRODUCTS" section




