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
  "name": "Search a flight in MakemyTrip",
  "description": "",
  "id": "search-hotels-in-makemytrip;search-a-flight-in-makemytrip",
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
  "duration": 35384634000,
  "status": "passed"
});
formatter.match({
  "location": "HotelList.click_on_Randoms_place()"
});
formatter.result({
  "duration": 15516103800,
  "status": "passed"
});
formatter.match({
  "location": "HotelList.click_on_Hotels_Tab()"
});
formatter.result({
  "duration": 2038481300,
  "status": "passed"
});
formatter.match({
  "location": "HotelList.select_Mumbai_from_drop_down()"
});
formatter.result({
  "duration": 32918080100,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//div[@class\u003d\u0027loginModal displayBlock modalLogin dynHeight personal \u0027]\"}\n  (Session info: chrome\u003d92.0.4515.159)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-GCQ4TJ3\u0027, ip: \u0027192.168.1.5\u0027, os.name: \u0027Windows 8.1\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.3\u0027, java.version: \u00271.8.0_51\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 92.0.4515.159, chrome: {chromedriverVersion: 92.0.4515.107 (87a818b10553..., userDataDir: C:\\Users\\bschi\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:56887}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 213cce3575aede4a5be42557beb3805b\n*** Element info: {Using\u003dxpath, value\u003d//div[@class\u003d\u0027loginModal displayBlock modalLogin dynHeight personal \u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:422)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy15.click(Unknown Source)\r\n\tat com.qa.pages.HomePage.randomClick(HomePage.java:112)\r\n\tat com.qa.pages.HotelsPage.SelectLocAsMumbai(HotelsPage.java:60)\r\n\tat com.qa.stepDefinations.HotelList.select_Mumbai_from_drop_down(HotelList.java:43)\r\n\tat ✽.Then Select Mumbai from drop down(C:/NewWorkSpace/TPoint/MakeMyTripBDDFramework/src/main/java/com/qa/features/searchhotels.feature:8)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "HotelList.verify_the_Hotels_Page()"
});
formatter.result({
  "status": "skipped"
});
});