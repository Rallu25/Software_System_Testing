Scenario: User Registration
    Given the user is on the Facebook registration page
    When they provide valid registration details
    And click the sign-up button
    Then they see the welcome page 