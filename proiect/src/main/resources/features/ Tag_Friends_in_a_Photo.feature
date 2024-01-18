Scenario: Tag Friends in a Photo
    Given the user is creating a photo post on Facebook
    When they tag friends in the photo
    And click the "Post" button
    Then friends are tagged in the photo