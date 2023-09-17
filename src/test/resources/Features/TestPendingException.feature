Feature: Throw pending exception

  Scenario: Try pending exception
    Given user is on signup page
    When user enters username on signup page
    And user clicks on signup button
    But sign up is not successful
    Then throw a pending exception in this case
