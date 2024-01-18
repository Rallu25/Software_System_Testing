  Scenario: Block a User
    Given the user is on another user's profile
    When they click the "More" button
    And choose to block the user
    Then the user is blocked from interacting with the profile