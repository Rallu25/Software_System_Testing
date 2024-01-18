 Scenario: Comment on a Post
    Given the user is logged into their Facebook account
    When they view a post
    And write a comment
    And click the "Post Comment" button
    Then the comment appears below the post