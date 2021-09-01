In order to run the project, below are the configurations that need to setup:

Check Chrome and Fixefox browser versions and install their drivers accordingly.
a) For Google Chrome Version 92.0.4515.107 (Official Build) (64-bit), user can install ChromeDriver 92.0.4515.43 from https://chromedriver.chromium.org/
b) For Firefox Version 90.0.2 (64-bit), user can install GeckoDriver 0.29.1 from https://github.com/mozilla/geckodriver/releases
Install JDK 8 and set path in the environment variables
Install Eclipse IDE
Once installed, open it and Install below plugins from Window> Eclipse Marketplace on Eclipse IDE
a) Natural Plugin
b) Maven Integration for Eclipse
On Eclipse IDE, import the project using below steps:
a) Go to File > Open Projects from File System
b) Go to the project directory and click on Finish button.
c) After importing, change the locations of the drivers in the config.properties file located under src/main/java path
#Execution Instructions

In order to execute the project, follow the below steps:
a) Change the geckodriver/ chromedriver path located in config.properies
a) Go to TestRunner.java file located under /src/test/java/TestRunner path
b) Right click on file and Run it as 'Run As' and choose 'Run Configurations' and click on 'Run' button