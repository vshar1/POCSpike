Feature: Spike to proof serenity running against docker container
    I need to be able to have a test passing headless chrome container

@gridtest
  Scenario: Assert against a loaded page
    Given user is on search page
    When user enters selenium
    Then user can see selenium