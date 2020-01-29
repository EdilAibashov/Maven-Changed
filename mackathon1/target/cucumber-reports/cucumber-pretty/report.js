$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/phpPage.feature");
formatter.feature({
  "name": "Php page Testing",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@phpPage"
    }
  ]
});
formatter.scenario({
  "name": "Verify title of PHP Page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@phpPage"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User opens home page",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePage_STEPS.user_opens_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens php page",
  "keyword": "Then "
});
formatter.match({
  "location": "PhpPage_STEPS.user_opens_php_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verify title of PHP Page",
  "keyword": "And "
});
formatter.match({
  "location": "PhpPage_STEPS.user_verify_title_of_PHP_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});