Feature: feature to test login functionality

  Scenario Outline: check login is successful
    Given user is on login page
    When user enter <username> and <password>
    And clicks on login button
    Then user should be logged in

    Examples: 
      | username                | password     |
      | standard_user           | secret_sauce |
      | locked_out_user         | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |
