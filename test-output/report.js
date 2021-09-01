$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/NewWorkSpace/TPoint/MakeMyTripBDDFramework/src/main/java/com/qa/features/searchhotels.feature");
formatter.feature({
  "line": 1,
  "name": "Search Hotels in MakeMyTrip",
  "description": "",
  "id": "search-hotels-in-makemytrip",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Verify Hotels Page in MakemyTrip",
  "description": "",
  "id": "search-hotels-in-makemytrip;verify-hotels-page-in-makemytrip",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User Open Browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Click on Randoms place",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Click on Hotels Tab",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Select Mumbai from drop down",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Verify the Hotels Page",
  "keyword": "Then "
});
formatter.match({
  "location": "HotelList.user_Open_Browser()"
});
formatter.result({
  "duration": 26980540500,
  "status": "passed"
});
formatter.match({
  "location": "HotelList.click_on_Randoms_place()"
});
formatter.result({
  "duration": 303276800,
  "status": "passed"
});
formatter.match({
  "location": "HotelList.click_on_Hotels_Tab()"
});
formatter.result({
  "duration": 2086331000,
  "status": "passed"
});
formatter.match({
  "location": "HotelList.select_Mumbai_from_drop_down()"
});
formatter.result({
  "duration": 5309845800,
  "status": "passed"
});
formatter.match({
  "location": "HotelList.verify_the_Hotels_Page()"
});
formatter.result({
  "duration": 2254349300,
  "status": "passed"
});
});