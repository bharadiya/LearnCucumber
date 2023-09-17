Feature: feature to test login functionality using datatables

  Scenario: check login is successful
    Given user is on login page
    When user enters creds using datatable
      | standard_user           | secret_sauce |
    And clicks on login button
    Then user should be logged in
