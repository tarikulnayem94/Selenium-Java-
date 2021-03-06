package com.TestRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions( 
		// the path of the feature files
		features = "src/test/java/com/Feature/LogIn.Feature",
	
		// the path of the step definition files
		glue = {"com.StepDefinition"},

		// to generate different types of reporting
		format= {"pretty","html:test-outout"}
		)

public class TestRunner {
	
}


