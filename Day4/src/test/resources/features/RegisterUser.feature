Feature: Filling the Registration form of Mercury Tours
  As a new user to the system
  I need to be able to register to the system
  So that I can obtain their services

  Background: navigates to the Mercury Registration Page
    Given user is on Mercury Home Page > Register Page

    Scenario: User Fills the Registration Form Successfully
      Given user fills first name as "Thilini"
      And user fills last name as "Chamaree"
      And user fills user name as "Mal"
      And user fills password as "tp@12345"
      And user fills confirm password as "tp@12345"
      When user clicks on submit button
      Then Note should denote Your user name is "Mal"
