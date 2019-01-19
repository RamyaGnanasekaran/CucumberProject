$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/AddCustomer.feature");
formatter.feature({
  "name": "To Test the add Customer functionality",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.scenario({
  "name": "To enter the Add Customer details",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    },
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
formatter.step({
  "name": "The User is in gurantetelecom home page",
  "keyword": "Given "
});
formatter.match({
  "location": "AddCustomerSteps.the_User_is_in_gurantetelecom_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The User navigates to add customer page",
  "keyword": "And "
});
formatter.match({
  "location": "AddCustomerSteps.the_User_navigates_to_add_customer_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user fill in the details",
  "rows": [
    {
      "cells": [
        "Ramya",
        "G",
        "ramyasekar@gmail.com",
        "Chennai",
        "8870654456"
      ]
    },
    {
      "cells": [
        "Divya",
        "Divu",
        "divyadivu@gmail.com",
        "Bangalore",
        "7770686456"
      ]
    },
    {
      "cells": [
        "Agnes",
        "Bhomila",
        "agnesbhomi@gmail.com",
        "Salem",
        "9970654465"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "AddCustomerSteps.the_user_fill_in_the_details(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the User clicks the submit button",
  "keyword": "And "
});
formatter.match({
  "location": "AddCustomerSteps.the_User_clicks_the_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The Customer ID should be generated for the user",
  "keyword": "Then "
});
formatter.match({
  "location": "AddCustomerSteps.the_Customer_ID_should_be_generated_for_the_user()"
});
formatter.result({
  "error_message": "org.openqa.selenium.WebDriverException: chrome not reachable\n  (Session info: chrome\u003d71.0.3578.98)\n  (Driver info: chromedriver\u003d2.44.609538 (b655c5a60b0b544917107a59d4153d4bf78e1b90),platform\u003dWindows NT 10.0.17134 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LAPTOP-H7N93MD5\u0027, ip: \u0027192.168.1.67\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_191\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.44.609538 (b655c5a60b0b54..., userDataDir: C:\\Users\\Ramya\\AppData\\Loca...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:61975}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: ignore, unhandledPromptBehavior: ignore, version: 71.0.3578.98, webStorageEnabled: true}\nSession ID: d12e991fa57be4960eda5752b11ddc24\n*** Element info: {Using\u003dxpath, value\u003d//b[text()\u003d\u0027Please Note Down Your Customer123\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.hex.AddCustomerSteps.the_Customer_ID_should_be_generated_for_the_user(AddCustomerSteps.java:58)\r\n\tat ✽.The Customer ID should be generated for the user(src/test/resources/AddCustomer.feature:13)\r\n",
  "status": "failed"
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
formatter.scenario({
  "name": "To Reset the Add Customer details",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    },
    {
      "name": "@reg"
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
formatter.step({
  "name": "The User is in gurantetelecom home page to check the Reset option",
  "keyword": "Given "
});
formatter.match({
  "location": "AddCustomerSteps.the_User_is_in_gurantetelecom_home_page_to_check_the_Reset_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The User navigates to add customer page to test the Reset button",
  "keyword": "And "
});
formatter.match({
  "location": "AddCustomerSteps.the_User_navigates_to_add_customer_page_to_test_the_Reset_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user fill in the details to reset",
  "rows": [
    {
      "cells": [
        "Ramya",
        "G",
        "ramyasekar@gmail.com",
        "Chennai",
        "8870654456"
      ]
    },
    {
      "cells": [
        "Divya",
        "Divu",
        "divyadivu@gmail.com",
        "Bangalore",
        "7770686456"
      ]
    },
    {
      "cells": [
        "Agnes",
        "Bhomila",
        "agnesbhomi@gmail.com",
        "Salem",
        "9970654465"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "AddCustomerSteps.the_user_fill_in_the_details_to_reset(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the User clicks the Reset button",
  "keyword": "And "
});
formatter.match({
  "location": "AddCustomerSteps.the_User_clicks_the_Reset_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The page should be reseted",
  "keyword": "Then "
});
formatter.match({
  "location": "AddCustomerSteps.the_page_should_be_reseted()"
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