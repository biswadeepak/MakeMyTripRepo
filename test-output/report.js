$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/com/qa/features/BookFlight.feature");
formatter.feature({
  "line": 1,
  "name": "Search \u0026 Book a flight",
  "description": "",
  "id": "search-\u0026-book-a-flight",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Search a flight in MakemyTrip",
  "description": "",
  "id": "search-\u0026-book-a-flight;search-a-flight-in-makemytrip",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User Opens Browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Click on Random place",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Select From Mumbai",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Select To Delhi",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Select the date",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Click on Search button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Click on Non Stop Checkbox",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Click on Mumbai 6-12 button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Verify Search Flights",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Click On View Price button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Click On Book Now button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Enter Customer Details",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Verify Fare Summery",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "Close the book flight Browser",
  "keyword": "And "
});
formatter.match({
  "location": "Bookflight.user_Opens_Browser()"
});
formatter.result({
  "duration": 17536979800,
  "status": "passed"
});
formatter.match({
  "location": "Bookflight.click_on_Random_place()"
});
formatter.result({
  "duration": 165387800,
  "status": "passed"
});
formatter.match({
  "location": "Bookflight.select_From_Mumbai()"
});
formatter.result({
  "duration": 2712822800,
  "status": "passed"
});
formatter.match({
  "location": "Bookflight.select_To_Delhi()"
});
formatter.result({
  "duration": 868679400,
  "status": "passed"
});
formatter.match({
  "location": "Bookflight.select_the_date()"
});
formatter.result({
  "duration": 169720400,
  "status": "passed"
});
formatter.match({
  "location": "Bookflight.click_on_Search_button()"
});
formatter.result({
  "duration": 31432389600,
  "status": "passed"
});
formatter.match({
  "location": "Bookflight.click_on_Non_Stop_Checkbox()"
});
formatter.result({
  "duration": 1544211100,
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
  "duration": 1052007600,
  "status": "passed"
});
formatter.match({
  "location": "Bookflight.verify_Search_Flights()"
});
formatter.result({
  "duration": 185724500,
  "status": "passed"
});
formatter.match({
  "location": "Bookflight.click_On_View_Price_button()"
});
formatter.result({
  "duration": 188225200,
  "status": "passed"
});
formatter.match({
  "location": "Bookflight.click_On_Book_Now_button()"
});
formatter.result({
  "duration": 803707200,
  "status": "passed"
});
formatter.match({
  "location": "Bookflight.enter_Customer_Details()"
});
formatter.result({
  "duration": 17591573400,
  "status": "passed"
});
formatter.match({
  "location": "Bookflight.verify_Fare_Summery()"
});
formatter.result({
  "duration": 60105500,
  "status": "passed"
});
formatter.match({
  "location": "Bookflight.close_the_book_flight_Browser()"
});
formatter.result({
  "duration": 1595045400,
  "status": "passed"
});
});