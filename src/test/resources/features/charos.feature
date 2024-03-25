@deck
Feature: Deck Module Functionality

  Background: User logins and navigates to Tasks module
    Given the user is on the login page
    And the user logged in with username as "Employee35" and password as "Employee123"
    And the user navigates to "Deck" module

  @charos
  Scenario: Create a new board
    When user creates a new board
    Then the board is created successfully
@giv
  Scenario: Create a new list under a board
   Given user has a board named "Personal"
   When user creates a new list "To Do" under the board
   Then "To Do" list is created successfully
@yu
  Scenario: Add a new card/task to a list
#    Given user has a board named "Personal" with a list "To Do"
    Given user adds a new card task "Task1" to the "To Do" list
    Then "Task1" is added successfully to the list
@abh
  Scenario: Assign a card/task to self
#    Given user has a board named "Personal" with a list "To Do" containing "Task 1"
  Given user assigns "Task 1" to self
    Then "Task 1" is assigned to the user