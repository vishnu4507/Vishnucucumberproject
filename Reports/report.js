$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/FacebookLogin.feature");
formatter.feature({
  "name": "",
  "description": "  Facebook Application Demo",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@reg"
    }
  ]
});
formatter.scenario({
  "name": "Login Should be successfull",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@reg"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.write("Start: Vishnu");
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "that I have gone to the Google page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.thatIHaveGoneToTheGooglePage()"
});
formatter.result({
  "status": "passed"
});
formatter.write("End : Vishnu");
formatter.afterstep({
  "status": "passed"
});
formatter.write("Start: Vishnu");
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "I add Horse to the search box",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.iAddHorseToTheSearchBox()"
});
formatter.result({
  "status": "passed"
});
formatter.write("End : Vishnu");
formatter.afterstep({
  "status": "passed"
});
formatter.write("Start: Vishnu");
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "click the Search Button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.clickTheSearchButton()"
});
formatter.result({
  "status": "passed"
});
formatter.write("End : Vishnu");
formatter.afterstep({
  "status": "passed"
});
formatter.write("Start: Vishnu");
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "cats should be mentioned in the results",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.catsShouldBeMentionedInTheResults()"
});
formatter.result({
  "status": "passed"
});
formatter.write("End : Vishnu");
formatter.afterstep({
  "status": "passed"
});
formatter.write("Start: Vishnu");
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.closeTheBrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.write("End : Vishnu");
formatter.afterstep({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});