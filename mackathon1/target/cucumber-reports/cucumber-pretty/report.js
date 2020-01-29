$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/homePage.feature");
formatter.feature({
  "name": "Home page Testing",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@homePage"
    }
  ]
});
formatter.scenario({
  "name": "Verify title of Home Page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@homePage"
    },
    {
      "name": "@verifytitle"
    }
  ]
});
