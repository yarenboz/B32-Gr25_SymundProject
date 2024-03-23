@B32G25-219
Feature: Default

	#{color:#de350b}*User Story :*{color}
	#
	#As a user, I should be able to see all deleted files and delete/restore them permanently under the Deleted Files tab.
  @B32G25-216
  Scenario: User can order the all deleted files by newest to oldest or vice versa
    Given the user is on the login page
    And the user logged in with username as "Employee135" and password as "Employee123"
    When user should see File icon on the home page click on it
    Then user  should see Deleted files option and click on it
    And user should click and see files by newest to oldest or vice versa


  @B32G25-217
  Scenario: User can delete any deleted file permanently by using the three dots icon in the file’s line
    Given the user is on the login page
    And the user logged in with username as "Employee135" and password as "Employee123"
    When user should see File icon on the home page click on it
    Then user  should see Deleted files option and click on it
    When user click three dots button
    And  user click delete permanently button
    Then user should delete Deleted file permanently


  @B32G25-218
  Scenario: User can restore any deleted file and see it again under the All Files tab
    Given the user is on the login page
    And the user logged in with username as "Employee135" and password as "Employee123"
    When user should see File icon on the home page click on it
    Then user  should see Deleted files option and click on it
    When user click restore button
    Then user should see Deleted file under the all file tab