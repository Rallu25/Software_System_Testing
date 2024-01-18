Scenario: Like a Post
    Given the user is logged into their Facebook account
    When they view a post
    And click the "Like" button
    Then the post shows that the user has liked it