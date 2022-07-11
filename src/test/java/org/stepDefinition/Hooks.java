package org.stepDefinition;

import org.base.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass {
	@Before
	public void bef() {
		System.out.println("before scenario");
		launchBrowser();
		maxBrowser();
	}

	@Before(order=2)
	public void bef2() {
		System.out.println("before scenario2");
	}

	@Before(order=1)
	public void bef1() {
		System.out.println("before scenario1");
	}

	@Before(order=3)
	public void bef3() {
		System.out.println("before scenario3");
	}

	@After()
	public void aft(Scenario s) {
	if(s.isFailed()){
		TakesScreenshot tk=(TakesScreenshot)driver;
		byte[] scrn = tk.getScreenshotAs(OutputType.BYTES);
		s.embed(scrn, "image/png");
	}
		System.out.println("after scenario");
		

	}

	@After(order=2)
	public void aft2() {
		System.out.println("after scenario2");

	}

	@After(order=3)
	public void aft3() {
		System.out.println("after scenario3");
	}

	@After(order=1)
	public void aft1() {
		System.out.println("after scenario1");
	}
}