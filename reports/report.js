$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/feature/CreateLead.feature");
formatter.feature({
  "name": "Create Lead",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "TC001_Creating a New Lead",
  "description": "//Given Open Chrome Browser \n//And launch Url \n//And Enter Username as Demosalesmanager\n//And Enter Password as crmsfa  \n//When Click on Login Button",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Click on Leads",
  "keyword": "When "
});
formatter.match({
  "location": "CreateLead.clickLead()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Create Lead",
  "keyword": "When "
});
formatter.match({
  "location": "CreateLead.clickCreateLead()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Company Name",
  "keyword": "Given "
});
formatter.match({
  "location": "CreateLead.enterCname()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter First Name",
  "keyword": "Given "
});
formatter.match({
  "location": "CreateLead.enterFname()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Last Name",
  "keyword": "Given "
});
formatter.match({
  "location": "CreateLead.enterLname()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on CreateLead Link",
  "keyword": "When "
});
formatter.match({
  "location": "CreateLead.clickCreateLeadLink()"
});
formatter.result({
  "status": "passed"
});
});