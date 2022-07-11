package org.stepDefinition;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.base.BaseClass;
import org.pojo.PojoAmazon;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AmazonDef extends BaseClass

{
	PojoAmazon p;

	@Given("User have to Enter Amazon Website throughh Chrome Browser")
	public void user_have_to_Enter_Amazon_Website_throughh_Chrome_Browser() {
		launchBrowser();
		loadUrl("https://www.amazon.in/");
		maxBrowser();
		p = new PojoAmazon();
	}

	@Given("User have to click signin button")
	public void user_have_to_click_signin_button() {
		btnclick(p.getsignin());

	}

	@Given("User have to pass {string}")
	public void user_have_to_pass(String string) {
		fill(p.getmblenumber(), "8428378276");

	}

	@Given("click Continue button")
	public void click_Continue_button() {
		btnclick(p.getcont());

	}

	@Given("User have to send {string}")
	public void user_have_to_send(String string) {
		fill(p.getpass(), "Dilip@2124");

	}

	@Given("click sigin button")
	public void click_sigin_button() throws InterruptedException {
		btnclick(p.getsubmitbtn());
		Thread.sleep(3000);

	}

	@Given("User have to click in Search tab")
	public void user_have_to_click_in_Search_tab() {
		btnclick(p.getSrchbox());

	}

	@Given("In search tab Enter Mobiles")
	public void in_search_tab_Enter_Mobiles() {
		fill(p.getSrchbox(), "Samsung");
	}

	@Given("Click Search button")
	public void click_Search_button() throws InterruptedException {

		btnclick(p.getClick());
		Thread.sleep(3000);

	}

	@Given("Click any product in new page")
	public void click_any_product_in_new_page() {
		btnclick(p.getFix());
		String p1 = driver.getWindowHandle();
		System.out.println(p1);
		Set<String> allwindows = driver.getWindowHandles();
		System.out.println(allwindows);
		List<String> all = new ArrayList<String>();
		all.addAll(allwindows);
		driver.switchTo().window(all.get(1));

	}

	@Then("Click add to cart button")
	public void click_add_to_cart_button() {
		btnclick(p.getCart());

	}

}
