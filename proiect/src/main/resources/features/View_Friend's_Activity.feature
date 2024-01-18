  Scenario: View Friend's Activity
    Given the user is on a friend's profile
    When they click the "Activity" tab
    Then they see a history of their friend's recent activity
