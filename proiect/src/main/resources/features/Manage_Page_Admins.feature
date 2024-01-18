  Scenario: Manage Page Admins
    Given the user is the admin of a Facebook page
    When they navigate to page settings
    And add or remove page admins
    Then the changes are reflected in the page administration