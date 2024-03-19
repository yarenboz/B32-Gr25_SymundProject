@login
Feature: Users should be able to login

  Background: User is already in the login page
    Given the user is on the login page
    And the user logged in with username as "Employee125" and password as "Employee123"
    And the user navigates to "Notes" module

  @wip
  Scenario: Verify login with valid credentials


