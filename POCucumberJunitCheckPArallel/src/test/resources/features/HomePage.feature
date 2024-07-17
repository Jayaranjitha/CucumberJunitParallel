@TestRunHomePage
Feature: Login to HRM Application

  Background: 
    Given User is on HRMLogin page "https://opensource-demo.orangehrmlive.com/"
    When User enters username as "Admin" and password as "admin123"
    Then User should be able to login sucessfully and new page open

  @MinimieleftHover
  Scenario: Admin Page check
    Given user clicks on the admin button
    And user minimizes the side view
    And user enters the name "Admin"
    And user selects the role as "Admin"
    And user selects the status as "Enabled"
    And user clicks on search button
