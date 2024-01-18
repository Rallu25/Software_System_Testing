  Scenario: Post Status Update
    Given the user is logged into their Facebook account
    When they write a status update
    And click the post button
    The status appears on their timeline