@tasks
Feature: Deleted Files Tab Functionality

  Agile Story: User should be able to see all deleted files and delete/restore them permanently under the Deleted Files tab.


  Background: User is already in the log in page
    Given the user is on the login page
    And the user logged in with username as "Employee135" and password as "Employee123"

  @wip
  Scenario: User can order the all deleted files by newest to oldest or vice versa
    Given the user is on the login page
    When user should see "File" icon on the home page click on it
    Then user  should see Delete files option
    And user should click and see files by newest to oldest or vice versa

#  Scenario: User can delete any deleted file permanently by using the three dots icon in the file’s line
#    Given the user is on the login page
#    When user should see "File" icon on the home page click on it
#    Then user  should see Delete files option by newest to oldest or vice versa is as expected
#    Then user  should see Delete files option
#    And user should delete file by clicking three dots icon
#
#
#  Scenario: User can restore any deleted file and see it again under the All Files tab
#    Given the user is on the login page
#    When user should see "File" icon on the home page click on it
#    Then user  should see Delete files option by newest to oldest or vice versa is as expected
#    Then user  should see Delete files option
#    And user should restore any file by clicking three dots icon


