package com.qa.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
     features = "//C:\\NewWorkSpace\\TPoint\\MakeMyTripBDDFramework\\src\\main\\java\\com\\qa\\features\\searchhotels.feature", //The path of the feature file
     glue = {"com.qa.stepDefinations"}, //The path of the step definition file
     format= {"pretty","html:test-output","json:json_output/cucumber.json", "junit:junit_xml/cucumer.xml"}, //To generate different type of reporting
     monochrome = true, //display the console output in proper readable format
     strict = true, // it will check if any step is not defined in step definition file
     dryRun = false // to check the mapping is proper between feature file and step definition file 
     
     //tags = {"@SmokeTest"}
		)

public class TestRunner {

}