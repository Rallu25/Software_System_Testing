  Scenario: Report Inappropriate Content
    Given the user is viewing a post
    When they click the "Report" button
    And select the reason for reporting
    Then the content is reported for review