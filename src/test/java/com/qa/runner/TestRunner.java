package com.qa.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * 
 * 
 * Runner Class defines to run individual testcases 
 * or to run parallel test cases
 * 
 * 
 *
 */

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\main\\java\\com\\qa\\features\\SearchHotels.feature", // The path of the feature file
		glue = { "com.qa.stepDefinations" }, // The path of the step definition file
		format = { "pretty", "html:test-output", "json:json_output/cucumber.json", "junit:junit_xml/cucumer.xml" }, // To
																													// generate
																													// different
																													// type
																													// of
																													// reporting
		monochrome = true, // display the console output in proper readable format
		strict = true, // it will check if any step is not defined in step definition file
		dryRun = false // to check the mapping is proper between feature file and step definition file

)

public class TestRunner {

}
