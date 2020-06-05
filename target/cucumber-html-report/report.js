$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 2,
  "name": "Login Functionality",
  "description": "",
  "id": "login-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@login"
    }
  ]
});
formatter.scenarioOutline({
  "line": 23,
  "name": "Verify the Registration Form",
  "description": "",
  "id": "login-functionality;verify-the-registration-form",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 22,
      "name": "@RegistrationForm"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "User is on Homepage of the application",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "User navigates to login page",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "Verify user on login page",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "User logs in with \"\u003cemailId\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "Click on Registration link",
  "keyword": "Given "
});
formatter.step({
  "line": 29,
  "name": "Verify the Title",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "Fill the registration form",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "Submit the Form",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 35,
  "name": "",
  "description": "",
  "id": "login-functionality;verify-the-registration-form;",
  "rows": [
    {
      "cells": [
        "emailId",
        "pwd"
      ],
      "line": 36,
      "id": "login-functionality;verify-the-registration-form;;1"
    },
    {
      "cells": [
        "Test@gmail.com",
        "123456"
      ],
      "line": 37,
      "id": "login-functionality;verify-the-registration-form;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 37,
  "name": "Verify the Registration Form",
  "description": "",
  "id": "login-functionality;verify-the-registration-form;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 22,
      "name": "@RegistrationForm"
    },
    {
      "line": 1,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "User is on Homepage of the application",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "User navigates to login page",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "Verify user on login page",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "User logs in with \"Test@gmail.com\" and \"\u003cpassword\u003e\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "Click on Registration link",
  "keyword": "Given "
});
formatter.step({
  "line": 29,
  "name": "Verify the Title",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "Fill the registration form",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "Submit the Form",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.verifyuserisonHomepageofapplication()"
});
formatter.result({
  "duration": 16847424400,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.verifyUserIsonLoginPage()"
});
formatter.result({
  "duration": 3728712200,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.verifyuseronLoginPage()"
});
formatter.result({
  "duration": 68000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Test@gmail.com",
      "offset": 19
    },
    {
      "val": "\u003cpassword\u003e",
      "offset": 40
    }
  ],
  "location": "HomePageSteps.userloginwithvalidusername(String,String)"
});
formatter.result({
  "duration": 9711291000,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationPageSteps.verifyuserisonHomepageofapplication()"
});
formatter.result({
  "duration": 1692498900,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationPageSteps.verifytheTitle()"
});
formatter.result({
  "duration": 5017768000,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationPageSteps.fillregistrationform()"
});
formatter.result({
  "duration": 8145753400,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationPageSteps.submittheform()"
});
formatter.result({
  "duration": 596217431200,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.closebrowser()"
});
formatter.result({
  "duration": 553256400,
  "status": "passed"
});
});