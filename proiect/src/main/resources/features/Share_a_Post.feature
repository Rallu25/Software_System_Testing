Scenario: Share a Post
    Given the user is logged into their Facebook account
    When they view a post
    And click the "Share" button
    Then they can choose where to share the post
