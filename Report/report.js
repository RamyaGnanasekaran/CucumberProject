$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/CheckBoxDemo.feature");
formatter.feature({
  "name": "To Test the Input Forms in Selenium easy Page - Check Box Demo",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To Select the checkbox in checkbox Demo",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
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
  "name": "The User is in Selenium home page screen",
  "keyword": "Given "
});
formatter.match({
  "location": "CheckBoxDemoSteps.the_User_is_in_Selenium_home_page_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The User navigates to the Checkbox Demo page",
  "keyword": "And "
});
formatter.match({
  "location": "CheckBoxDemoSteps.the_User_navigates_to_the_Checkbox_Demo_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user select the checkbox",
  "keyword": "When "
});
formatter.match({
  "location": "CheckBoxDemoSteps.the_user_select_the_checkbox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The Success message should display",
  "keyword": "Then "
});
formatter.match({
  "location": "CheckBoxDemoSteps.the_Success_message_should_display()"
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
});