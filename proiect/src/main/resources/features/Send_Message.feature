 Scenario: Send Message
    Given the user is on a friend's profile
    When they click the "Message" button
    And compose a message
    Then the message is sent to the friend