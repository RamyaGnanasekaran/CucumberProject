$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/InputFormSubmit.feature");
formatter.feature({
  "name": "To Test the Input Forms in Selenium easy Page - Input Form Submit",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "To Select the Input Form Submit page",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "The User is in Selenium home page to submit Input form",
  "keyword": "Given "
});
formatter.step({
  "name": "The User navigates to the Input Form Submit page",
  "keyword": "And "
});
formatter.step({
  "name": "The User fill in the Input form details \"\u003cfirst_name\u003e\", \"\u003clast_name\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "the user clicks on Send button",
  "keyword": "And "
});
formatter.step({
  "name": "The success message should display",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "first_name",
        "last_name"
      ]
    },
    {
      "cells": [
        "Ramya",
        "G"
      ]
    },
    {
      "cells": [
        "Abi",
        "S"
      ]
    }
  ]
});
formatter.scenario({
  "name": "To Select the Input Form Submit page",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "The User is in Selenium home page to submit Input form",
  "keyword": "Given "
});
formatter.match({
  "location": "InputFormSubmitSteps.the_User_is_in_Selenium_home_page_to_submit_Input_form()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The User navigates to the Input Form Submit page",
  "keyword": "And "
});
formatter.match({
  "location": "InputFormSubmitSteps.the_User_navigates_to_the_Input_Form_Submit_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The User fill in the Input form details \"Ramya\", \"G\"",
  "keyword": "When "
});
formatter.match({
  "location": "InputFormSubmitSteps.the_User_fill_in_the_Input_form_details(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on Send button",
  "keyword": "And "
});
formatter.match({
  "location": "InputFormSubmitSteps.the_user_clicks_on_Send_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The success message should display",
  "keyword": "Then "
});
formatter.match({
  "location": "InputFormSubmitSteps.the_success_message_should_display()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To Select the Input Form Submit page",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "The User is in Selenium home page to submit Input form",
  "keyword": "Given "
});
formatter.match({
  "location": "InputFormSubmitSteps.the_User_is_in_Selenium_home_page_to_submit_Input_form()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The User navigates to the Input Form Submit page",
  "keyword": "And "
});
formatter.match({
  "location": "InputFormSubmitSteps.the_User_navigates_to_the_Input_Form_Submit_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The User fill in the Input form details \"Abi\", \"S\"",
  "keyword": "When "
});
formatter.match({
  "location": "InputFormSubmitSteps.the_User_fill_in_the_Input_form_details(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on Send button",
  "keyword": "And "
});
formatter.match({
  "location": "InputFormSubmitSteps.the_user_clicks_on_Send_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The success message should display",
  "keyword": "Then "
});
formatter.match({
  "location": "InputFormSubmitSteps.the_success_message_should_display()"
});
formatter.result({
  "status": "passed"
});
});