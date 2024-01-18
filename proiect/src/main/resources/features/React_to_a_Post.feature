  Scenario: React to a Post
    Given the user is viewing a post
    When they click the "React" button
    And choose an emoji reaction
    Then the reaction is applied to the post