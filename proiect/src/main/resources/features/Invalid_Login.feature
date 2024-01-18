 Scenario: Invalid Login
    Given the user is on the Facebook login page
    When they enter invalid credentials
    And click the login button
    Then they see an error message