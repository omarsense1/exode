@saveSettings
Feature: Testing saving settings for absolutely any field values

    Scenario: Verifying all the fields and saving the data by changing the first and last names.
      Given user navigates to "settings_endpoint"
      Then verify "settings" is displayed
      And verify "firstName" is displayed
      And verify "lastName" is displayed
      And verify "pageAddress" is displayed
      And verify "yourRole" is displayed
      And verify "sex" is displayed
      And verify "dateOfBirth" is displayed
      And verify "saveButton" is displayed
      And verify "saveButton" is disabled
      And enter "John" to "firstName" input field
      And enter "Shin" to "lastName" input field
      And verify "saveButton" is enabled
      And click on "saveButton"
      And verify "informationSuccessfullySavedMessage" is displayed


