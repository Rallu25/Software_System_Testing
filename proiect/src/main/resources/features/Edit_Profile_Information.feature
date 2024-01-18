Scenario: Edit Profile Information
    Given the user is on their profile page
    When they click the "Edit Profile" button
    And update profile information
    Then the changes are reflected in their profile