  Scenario: Search for Friends
    Given the user is on the Facebook homepage
    When they use the search bar to find friends
    Then they see a list of matching profiles
