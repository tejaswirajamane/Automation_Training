$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/Samplee/cucumber/src/main/java/features/Login.feature");
formatter.feature({
  "line": 1,
  "name": "Travels feature",
  "description": "",
  "id": "travels-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Test",
  "description": "",
  "id": "travels-feature;test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is already on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of login page is",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters \"admin@phptravels.com\" and \"demoadmin\"",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user is on Home Page",
  "keyword": "And "
});
formatter.match({
  "location": "LoginstepsDefinations.user_is_already_on_login_page()"
});
formatter.result({
  "duration": 15981947906,
  "status": "passed"
});
formatter.match({
  "location": "LoginstepsDefinations.title_of_login_page_is()"
});
formatter.result({
  "duration": 11357201,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin@phptravels.com",
      "offset": 13
    },
    {
      "val": "demoadmin",
      "offset": 40
    }
  ],
  "location": "LoginstepsDefinations.user_enters_username_and_password(String,String)"
});
formatter.result({
  "duration": 3316860999,
  "status": "passed"
});
formatter.match({
  "location": "LoginstepsDefinations.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 128536267,
  "status": "passed"
});
formatter.match({
  "location": "LoginstepsDefinations.user_is_on_Home_Page()"
});
formatter.result({
  "duration": 4662985276,
  "status": "passed"
});
});