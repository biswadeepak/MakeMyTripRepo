$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("bookflight.feature");
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
  "line": 5,
  "name": "User Opens Browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Click on Random place",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Select From Mumbai",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Select To Delhi",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Select the date",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Click on Search button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Click on Non Stop Checkbox",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Click on Mumbai 6-12 button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Verify Search Flights",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Click On View Price button",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "Click On Book Now button",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Enter Customer Details",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "Verify Fare Summery",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "Close the book flight Browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Bookflight.user_Opens_Browser()"
});
formatter.result({
  "duration": 36794310900,
  "status": "passed"
});
formatter.match({
  "location": "Bookflight.click_on_Random_place()"
});
formatter.result({
  "duration": 433892000,
  "status": "passed"
});
formatter.match({
  "location": "Bookflight.select_From_Mumbai()"
});
formatter.result({
  "duration": 9912741400,
  "status": "passed"
});
formatter.match({
  "location": "Bookflight.select_To_Delhi()"
});
formatter.result({
  "duration": 5723621500,
  "status": "passed"
});
formatter.match({
  "location": "Bookflight.select_the_date()"
});
formatter.result({
  "duration": 281831400,
  "status": "passed"
});
formatter.match({
  "location": "Bookflight.click_on_Search_button()"
});
formatter.result({
  "duration": 37005692700,
  "status": "passed"
});
formatter.match({
  "location": "Bookflight.click_on_Non_Stop_Checkbox()"
});
formatter.result({
  "duration": 16376788900,
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
  "duration": 1353931400,
  "status": "passed"
});
formatter.match({
  "location": "Bookflight.verify_Search_Flights()"
});
formatter.result({
  "duration": 15316640400,
  "status": "passed"
});
formatter.match({
  "location": "Bookflight.click_On_View_Price_button()"
});
formatter.result({
  "duration": 1111288100,
  "status": "passed"
});
formatter.match({
  "location": "Bookflight.click_On_Book_Now_button()"
});
formatter.result({
  "duration": 472195400,
  "status": "passed"
});
formatter.match({
  "location": "Bookflight.enter_Customer_Details()"
});
formatter.result({
  "duration": 46663387600,
  "status": "passed"
});
formatter.match({
  "location": "Bookflight.verify_Fare_Summery()"
});
formatter.result({
  "duration": 211641900,
  "status": "passed"
});
formatter.match({
  "location": "Bookflight.close_the_book_flight_Browser()"
});
formatter.result({
  "duration": 6147095900,
  "status": "passed"
});
formatter.uri("searchhotels.feature");
formatter.feature({
  "line": 1,
  "name": "Search Hotels in MakeMyTrip",
  "description": "",
  "id": "search-hotels-in-makemytrip",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Verify Hotels Page in MakemyTrip",
  "description": "",
  "id": "search-hotels-in-makemytrip;verify-hotels-page-in-makemytrip",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Searchhotel"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User Open Browser",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Click on Randoms place",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Click on Hotels Tab",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Select Mumbai from drop down",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Verify the Hotels Page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Close the search hotels Browser",
  "keyword": "And "
});
formatter.match({
  "location": "HotelList.user_Open_Browser()"
});
formatter.result({
  "duration": 39391571900,
  "status": "passed"
});
formatter.match({
  "location": "HotelList.click_on_Randoms_place()"
});
formatter.result({
  "duration": 301892700,
  "status": "passed"
});
formatter.match({
  "location": "HotelList.click_on_Hotels_Tab()"
});
formatter.result({
  "duration": 365771300,
  "status": "passed"
});
formatter.match({
  "location": "HotelList.select_Mumbai_from_drop_down()"
});
formatter.result({
  "duration": 5041497100,
  "status": "passed"
});
formatter.match({
  "location": "HotelList.verify_the_Hotels_Page()"
});
formatter.result({
  "duration": 380458200,
  "status": "passed"
});
formatter.match({
  "location": "HotelList.close_the_search_hotels_Browser()"
});
formatter.result({
  "duration": 2837348000,
  "status": "passed"
});
});