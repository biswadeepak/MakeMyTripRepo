$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/com/qa/features/bookflight.feature");
formatter.feature({
  "line": 1,
  "name": "Search \u0026 Book a flight",
  "description": "",
  "id": "search-\u0026-book-a-flight",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Search a flight in MakemyTrip",
  "description": "",
  "id": "search-\u0026-book-a-flight;search-a-flight-in-makemytrip",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Flight"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User Opens Browser",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Click on Random place",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Select From Mumbai",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Select To Delhi",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Select the date",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Click on Search button",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Click on Non Stop Checkbox",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Verify Search Flights",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "Click On View Price button",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "Click On Book Now button",
  "keyword": "Then "
});
formatter.match({
  "location": "Bookflight.user_Opens_Browser()"
});
formatter.result({
  "duration": 29198868700,
  "status": "passed"
});
formatter.match({
  "location": "Bookflight.click_on_Random_place()"
});
formatter.result({
  "duration": 261162600,
  "status": "passed"
});
formatter.match({
  "location": "Bookflight.select_From_Mumbai()"
});
formatter.result({
  "duration": 4158050400,
  "status": "passed"
});
formatter.match({
  "location": "Bookflight.select_To_Delhi()"
});
formatter.result({
  "duration": 6007058900,
  "status": "passed"
});
formatter.match({
  "location": "Bookflight.select_the_date()"
});
formatter.result({
  "duration": 156718400,
  "status": "passed"
});
formatter.match({
  "location": "Bookflight.click_on_Search_button()"
});
formatter.result({
  "duration": 35431013600,
  "status": "passed"
});
formatter.match({
  "location": "Bookflight.click_on_Non_Stop_Checkbox()"
});
formatter.result({
  "duration": 16599297200,
  "status": "passed"
});
formatter.match({
  "location": "Bookflight.verify_Search_Flights()"
});
formatter.result({
  "duration": 15188546000,
  "status": "passed"
});
formatter.match({
  "location": "Bookflight.click_On_View_Price_button()"
});
formatter.result({
  "duration": 330372700,
  "status": "passed"
});
formatter.match({
  "location": "Bookflight.click_On_Book_Now_button()"
});
formatter.result({
  "duration": 319992300,
  "status": "passed"
});
});