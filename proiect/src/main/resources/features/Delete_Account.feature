Scenario: Delete Account
    Given the user is logged into their Facebook account
    When they navigate to account settings
    And choose to delete their account
    The account is permanently deleted