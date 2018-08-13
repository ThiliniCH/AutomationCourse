$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/RegisterUser.feature");
formatter.feature({
  "line": 1,
  "name": "Filling the Registration form of Mercury Tours",
  "description": "As a new user to the system\r\nI need to be able to register to the system\r\nSo that I can obtain their services",
  "id": "filling-the-registration-form-of-mercury-tours",
  "keyword": "Feature"
});
formatter.background({
  "line": 6,
  "name": "navigates to the Mercury Registration Page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "user is on Mercury Home Page \u003e Register Page",
  "keyword": "Given "
});
formatter.match({
  "location": "NewUserRegistrationStepDefs.userIsOnMercuryHomePageRegisterPage()"
});
formatter.result({
  "duration": 8832641480,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "User Fills the Registration Form Successfully",
  "description": "",
  "id": "filling-the-registration-form-of-mercury-tours;user-fills-the-registration-form-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "user fills first name as \"Thilini\"",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "user fills last name as \"Chamaree\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user fills user name as \"Mal\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user fills password as \"tp@12345\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user fills confirm password as \"tp@12345\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user clicks on submit button",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "Note should denote Your user name is \"Mal\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Thilini",
      "offset": 26
    }
  ],
  "location": "NewUserRegistrationStepDefs.userFillsFirstNameAs(String)"
});
formatter.result({
  "duration": 156013729,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Chamaree",
      "offset": 25
    }
  ],
  "location": "NewUserRegistrationStepDefs.userFillsLastNameAs(String)"
});
formatter.result({
  "duration": 114654287,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mal",
      "offset": 25
    }
  ],
  "location": "NewUserRegistrationStepDefs.userFillsUserNameAs(String)"
});
formatter.result({
  "duration": 87397487,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "tp@12345",
      "offset": 24
    }
  ],
  "location": "NewUserRegistrationStepDefs.userFillsPasswordAs(String)"
});
formatter.result({
  "duration": 144962318,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "tp@12345",
      "offset": 32
    }
  ],
  "location": "NewUserRegistrationStepDefs.userFillsConfirmPasswordAs(String)"
});
formatter.result({
  "duration": 329004244,
  "status": "passed"
});
formatter.match({
  "location": "NewUserRegistrationStepDefs.userClicksOnSubmitButton()"
});
formatter.result({
  "duration": 1822082056,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mal",
      "offset": 38
    }
  ],
  "location": "NewUserRegistrationStepDefs.noteShouldDenoteYourUserNameIs(String)"
});
formatter.result({
  "duration": 110288321,
  "status": "passed"
});
});