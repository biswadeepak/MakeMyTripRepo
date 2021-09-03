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
  "name": "Click on Mumbai 6-12 button",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "Verify Search Flights",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "Click On View Price button",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "Click On Book Now button",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "Enter Customer Details",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "Verify Fare Summery",
  "keyword": "Then "
});
formatter.match({
  "location": "Bookflight.user_Opens_Browser()"
});
formatter.result({
  "duration": 25554629700,
  "status": "passed"
});
formatter.match({
  "location": "Bookflight.click_on_Random_place()"
});
formatter.result({
  "duration": 226591400,
  "status": "passed"
});
formatter.match({
  "location": "Bookflight.select_From_Mumbai()"
});
formatter.result({
  "duration": 3606959800,
  "status": "passed"
});
formatter.match({
  "location": "Bookflight.select_To_Delhi()"
});
formatter.result({
  "duration": 5754262900,
  "status": "passed"
});
formatter.match({
  "location": "Bookflight.select_the_date()"
});
formatter.result({
  "duration": 88615100,
  "status": "passed"
});
formatter.match({
  "location": "Bookflight.click_on_Search_button()"
});
formatter.result({
  "duration": 30763641300,
  "status": "passed"
});
formatter.match({
  "location": "Bookflight.click_on_Non_Stop_Checkbox()"
});
formatter.result({
  "duration": 15949402200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "6",
      "offset": 16
    },
    {
      "val": "12",
      "offset": 18
    }
  ],
  "location": "Bookflight.click_on_Mumbai_button(int,int)"
});
formatter.result({
  "duration": 1208873600,
  "status": "passed"
});
formatter.match({
  "location": "Bookflight.verify_Search_Flights()"
});
formatter.result({
  "duration": 15243622600,
  "status": "passed"
});
formatter.match({
  "location": "Bookflight.click_On_View_Price_button()"
});
formatter.result({
  "duration": 252171800,
  "status": "passed"
});
formatter.match({
  "location": "Bookflight.click_On_Book_Now_button()"
});
formatter.result({
  "duration": 840085700,
  "status": "passed"
});
formatter.match({
  "location": "Bookflight.enter_Customer_Details()"
});
formatter.result({
  "duration": 45707413700,
  "status": "passed"
});
formatter.match({
  "location": "Bookflight.verify_Fare_Summery()"
});
formatter.result({
  "duration": 20000,
  "status": "passed"
});
});