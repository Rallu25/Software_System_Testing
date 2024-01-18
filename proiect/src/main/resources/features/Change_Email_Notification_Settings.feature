  Scenario: Change Email Notification Settings
    Given the user is on the Facebook settings page
    When they adjust email notification preferences
    Then they receive notifications based on the updated settings