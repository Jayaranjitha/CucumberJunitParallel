@TestRun
Feature: Login to HRM Application

  Background:
 
    Given User is on HRMLogin page "https://opensource-demo.orangehrmlive.com/"


  @MissingUsername
  Scenario: Login with blank username

    When User enters username as " " and password as "admin123"
    Then User should be able to see a message "Required" below Username