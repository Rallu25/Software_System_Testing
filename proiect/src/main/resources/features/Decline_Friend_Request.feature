 Scenario: Decline Friend Request
    Given the user has a pending friend request
    When they navigate to friend requests
    And decline the friend request
    Then the user remains in the pending state
