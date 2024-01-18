  Scenario: Join an Event
    Given the user is browsing events on Facebook
    When they find an event of interest
    And click the "Join" button
    Then they are added to the event attendee list