 Scenario: Accept Friend Request
    Given the user has a pending friend request
    When they navigate to friend requests
    And accept the friend request
    Then the user is added to their friend list
