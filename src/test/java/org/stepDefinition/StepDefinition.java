package org.stepDefinition;

import java.util.List;
import java.util.Map;

import org.base.BaseClass;
import org.junit.Assert;
//import org.pojo.ForgottenPojo;
import org.pojo.LoginPojo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {
	LoginPojo l;

	@Given("User have to enter facebook application through chrome browser")
	public void user_have_to_enter_facebook_Application_through_chrome_browser() {
		launchBrowser();
		loadUrl("https://www.facebook.com/");
		maxBrowser();

		l = new LoginPojo();

	}

	@When("User have to enter invalid username and valid password")
	public void user_have_to_enter_invalid_username_and_valid_password(io.cucumber.datatable.DataTable d) {
		Map<String, String> asMap = d.asMap(String.class,String.class);
		String email = asMap.get("email");
		String pass = asMap.get("pswd");
		fill(l.getTxtEmail(), email);
		fill(l.getTxtPass(), pass);
	}

	@When("User have to click the login button")
	public void user_have_to_click_the_login_button() throws InterruptedException {
		btnclick(l.getBtnLogin());
		Thread.sleep(2000);
	}

	@Then("User should be in a invalid credential page")
	public void user_should_be_in_a_invalid_credential_page() {
		String url = driver.getCurrentUrl();
		Assert.assertTrue("Check Url of WebPage", url.contains("www.facebook.com"));
		System.out.println(url);
	}

	@When("User have to enter valid username and invalid password")
	public void user_have_to_enter_valid_username_and_invalid_password(io.cucumber.datatable.DataTable d) {
		List<Map<String, String>> asMaps = d.asMaps();
		String email = asMaps.get(1).get("email");
		String pass = asMaps.get(0).get("pswd");
		fill(l.getTxtEmail(), email);
		fill(l.getTxtPass(), pass);
		
		
	}

	@Given("User have to click the forgotten password")
	public void user_have_to_click_the_forgotten_password() throws InterruptedException {
		btnclick(l.getForgottenpass());
		Thread.sleep(2000);
	}

	@When("User have to enter emailId or mobileno")
	public void user_have_to_enter_emailId_or_mobileno() {
		fill(l.getTxtsrchbox(), "8428378276");

	}

	@Then("User have to click search button")
	public void user_have_to_click_search_button() {
		btnclick(l.getBtnsrch());

	}

}