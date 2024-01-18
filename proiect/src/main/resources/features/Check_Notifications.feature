  Scenario: Check Notifications
    Given the user is logged into their Facebook account
    When they check notifications
    Then they see a list of recent activities and interactions