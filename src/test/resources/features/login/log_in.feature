Feature: Log in

  Scenario: Try to log in with not valid credentials
    Given Samuel want to create a new post
    When he sends his credentials
    Then He should see title digita la colilla
