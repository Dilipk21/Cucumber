$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/featureFile/Login.feature");
formatter.feature({
  "name": "To validate Login Functionality of Facebook application",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User have to enter facebook application through chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_have_to_enter_facebook_Application_through_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate Login by using invalid username and valid password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@invaliduid"
    }
  ]
});
formatter.step({
  "name": "User have to enter invalid username and valid password",
  "rows": [
    {
      "cells": [
        "username",
        "Dilip"
      ]
    },
    {
      "cells": [
        "email",
        "dilip123@gmail.com"
      ]
    },
    {
      "cells": [
        "pswd",
        "dilip123"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_have_to_enter_invalid_username_and_valid_password(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User have to click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_have_to_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be in a invalid credential page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_should_be_in_a_invalid_credential_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});