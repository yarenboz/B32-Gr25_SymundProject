@B32G25-215
Feature: Users should be able to login

  Background: User is already in the login page
    Given the user is on the login page
    And the user logged in with username as "Employee125" and password as "Employee123"
    And the user navigates to "Notes" module

  @B32G25-211
  Scenario: User can create a new note
    Given user create new note
    Then user type "Hello world"
    Then user able to see new note title matches with the first word in the note created "Hello world"

  @B32G25-212
  Scenario: User are able to add any note to favorites
    Given user create new note
    Then user click 3dots in note module
    Then user able to see add to favorites
    When user click add to favorites
    Then  user navigates to "Files" module
    And user click to favorites
    Then user can see the new note added to favorites

  @B32G25-213
  Scenario:  User can see the number of letters and words that the note includes under the note title when clicked on the details of the note
    Given user create new note
    Then user type "Hello world"
    Then user click 3dots in the top right page
    Then user able to see Details
    When user click Details
    Then user can see the number of letters and words that the notes includes under the note title

  @B32G25-214
  Scenario: User can delete any note
    Given user create new note
    Then user click 3dots in note module
    Then user able to see Delete note
    When user click Delete note
    Then user able to see Delete "New note" in top right page