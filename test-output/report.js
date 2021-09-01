$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("bookflight.feature");
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
  "name": "Click on Search button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Verify Search Flights",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Click On View Price button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Click On Book Now button",
  "keyword": "Then "
});
formatter.match({
  "location": "Bookflight.user_Opens_Browser()"
});
formatter.result({
  "duration": 21101828900,
  "status": "passed"
});
formatter.match({
  "location": "Bookflight.click_on_Random_place()"
});
formatter.result({
  "duration": 319787200,
  "status": "passed"
});
formatter.match({
  "location": "Bookflight.click_on_Search_button()"
});
formatter.result({
  "duration": 31058136000,
  "status": "passed"
});
formatter.match({
  "location": "Bookflight.verify_Search_Flights()"
});
formatter.result({
  "duration": 16604101100,
  "status": "passed"
});
formatter.match({
  "location": "Bookflight.click_On_View_Price_button()"
});
formatter.result({
  "duration": 317263500,
  "status": "passed"
});
formatter.match({
  "location": "Bookflight.click_On_Book_Now_button()"
});
formatter.result({
  "duration": 315481100,
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
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Click on Hotels Tab",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Select Mumbai from drop down",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Verify the Hotels Page",
  "keyword": "Then "
});
formatter.match({
  "location": "HotelList.user_Open_Browser()"
});
formatter.result({
  "duration": 33029004500,
  "error_message": "org.openqa.selenium.TimeoutException: timeout: Timed out receiving message from renderer: 19.609\n  (Session info: chrome\u003d92.0.4515.159)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-GCQ4TJ3\u0027, ip: \u0027192.168.1.4\u0027, os.name: \u0027Windows 8.1\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.3\u0027, java.version: \u00271.8.0_51\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 92.0.4515.159, chrome: {chromedriverVersion: 92.0.4515.43 (8c61b7e2989f2..., userDataDir: C:\\Users\\bschi\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:53292}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 907a845931ff2545b59ca23cc6ead545\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:422)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.get(RemoteWebDriver.java:277)\r\n\tat com.qa.util.TestBase.initialization(TestBase.java:58)\r\n\tat com.qa.stepDefinations.HotelList.user_Open_Browser(HotelList.java:21)\r\n\tat ✽.Given User Open Browser(searchhotels.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "HotelList.click_on_Randoms_place()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HotelList.click_on_Hotels_Tab()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HotelList.select_Mumbai_from_drop_down()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HotelList.verify_the_Hotels_Page()"
});
formatter.result({
  "status": "skipped"
});
});