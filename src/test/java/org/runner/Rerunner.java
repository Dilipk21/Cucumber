package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.stepDefinition.JvmReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "@Rerun\\failures.txt", glue = "org.stepDefinition", monochrome = true, dryRun = false, strict = true, tags = "@invaliduid", plugin = {
		"rerun:C:\\Users\\PC 721\\eclipse-workspace\\Cucumber\\Rerun\\failures.txt" })

public class Rerunner {
	@AfterClass
	public static void report() {
		JvmReport.generateJvmReport("C:\\Users\\PC 721\\eclipse-workspace\\Cucumber\\AllReports\\jsonReport\\fb.json");

}
}