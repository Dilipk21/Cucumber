package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.stepDefinition.JvmReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources", glue = "org.stepDefinition", monochrome = true, dryRun = false, strict = true, tags = "@invaliduid", plugin = {
		"html:C:\\Users\\PC 721\\eclipse-workspace\\Cucumber\\AllReports\\htmlReport",
		"junit:C:\\Users\\PC 721\\eclipse-workspace\\Cucumber\\AllReports\\junitReport\\fbook.xml",
		"json:C:\\Users\\PC 721\\eclipse-workspace\\Cucumber\\AllReports\\jsonReport\\fb.json","rerun:C:\\Users\\PC 721\\eclipse-workspace\\Cucumber\\Rerun\\failures.txt" })

public class TestRunner {
	@AfterClass
	public static void report() {
		JvmReport.generateJvmReport("C:\\Users\\PC 721\\eclipse-workspace\\Cucumber\\AllReports\\jsonReport\\fb.json");
		
	}

}
