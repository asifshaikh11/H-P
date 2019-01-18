$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("PPlusComparison.feature");
formatter.feature({
  "line": 1,
  "name": "Login into Pregnancy Plus Application",
  "description": "",
  "id": "login-into-pregnancy-plus-application",
  "keyword": "Feature"
});
formatter.before({
  "duration": 957639259,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Login using valid username and password",
  "description": "",
  "id": "login-into-pregnancy-plus-application;login-using-valid-username-and-password;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@PPlus"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Click on no i will join later button",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Enter the User Name Test",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Click on done button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Click on I agree",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Click on Baby tab",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Click on daily tab",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Get text to verify",
  "keyword": "Then "
});
formatter.match({
  "location": "PPlusDaily.clickOnNoIWillJoinLaterButton()"
});
formatter.result({
  "duration": 118492215,
  "error_message": "java.lang.NullPointerException\r\n\tat core.generic.WrapperFunctions.mobileClick(WrapperFunctions.java:849)\r\n\tat com.face.pageFactory.PPlusDailyPage.clickOnNoIWillJoinLaterButton(PPlusDailyPage.java:130)\r\n\tat com.face.stepDefinitions.PPlusDaily.clickOnNoIWillJoinLaterButton(PPlusDaily.java:27)\r\n\tat ✽.Given Click on no i will join later button(PPlusComparison.feature:5)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "Test",
      "offset": 20
    }
  ],
  "location": "PPlusDaily.enterUserName(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PPlusDaily.clickOnDoneButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PPlusDaily.clickOnIAgree()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PPlusDaily.clickOnBabyTab()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PPlusDaily.clickOnDailyTab()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PPlusDaily.thenGetTextToVerify()"
});
formatter.result({
  "status": "skipped"
});
});