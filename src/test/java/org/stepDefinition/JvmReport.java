package org.stepDefinition;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {
	public static void generateJvmReport(String jsonPath) {

		// 1.Mention the target folder Location
		File f = new File("C:\\Users\\PC 721\\eclipse-workspace\\Cucumber\\AllReports\\jvmReport");
		// 2.We need to create to object for Configuration class
		Configuration c = new Configuration(f, "FacebookApplication");
		c.addClassifications("platform", "Windows10");
		c.addClassifications("Jdk-Version", "1.8");
		// 3.To add the json file path into the List
		List<String> li = new ArrayList<String>();
		li.add(jsonPath);
		// 4.ReportBuilder Class
		ReportBuilder r = new ReportBuilder(li, c);
		r.generateReports();
	}

}
