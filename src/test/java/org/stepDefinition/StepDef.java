package org.stepDefinition;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef  {
	WebDriver driver;
	@Given("User have to enter the Demoq Webpage through Chrome Browsers")
	public void user_have_to_enter_the_Demoq_Webpage_through_Chrome_Browsers() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC 721\\eclipse-workspace\\SeleniumFT\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.toolsqa.com/selenium-training/#enroll-form");
		driver.manage().window().maximize();
	}

	@When("User have to pass{string},{string},{string},{string},{string},{string},{string},{string} the value to all the textboxes")
	public void user_have_to_pass_the_value_to_all_the_textboxes(String string, String string2, String string3,
			String string4, String string5, String string6, String string7, String string8) {
		WebElement fname = driver.findElement(By.xpath("//input[@name='firstName']"));
		fname.sendKeys("Dilip");
		WebElement lname= driver.findElement(By.xpath("//input[@name='lastName']"));
		lname.sendKeys("Kumar");
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("selenium123@gmail.com");
		WebElement mob = driver.findElement(By.xpath("//input[@id='mobile']"));
		mob.sendKeys("8428378276");
		WebElement country = driver.findElement(By.xpath("//select[@name='country']"));
		country.sendKeys("India");
		WebElement city = driver.findElement(By.xpath("//input[@id='city']"));
		city.sendKeys("Chennai");
		WebElement msg = driver.findElement(By.xpath("//textarea[@class='upcoming__registration--input']"));
		msg.sendKeys("allDone");
		WebElement code = driver.findElement(By.xpath("//input[@id='code']"));
		code.sendKeys("kdK");
		
	}

	@Then("User have to click Send button")
	public void user_have_to_click_Search_button() {
		WebElement send = driver.findElement(By.xpath("//button[text()='Send']"));
		send.click();

	}

}
/*
 * ForgottenPojo f;
 * 
 * 
 * @Given("User have to enter the Demoq Webpage through Chrome Browser") public
 * void user_have_to_enter_the_Demoq_Webpage_through_Chrome_Browser() throws
 * InterruptedException { launchBrowser();
 * loadUrl("https://www.toolsqa.com/selenium-training/#enroll-form");
 * maxBrowser(); Thread.sleep(2000); f = new ForgottenPojo();
 * 
 * }
 * 
 * @When("User have to pass the value to all the textboxes") public void
 * user_have_to_pass_the_value_to_all_the_textboxes() { btnclick(f.getFname());
 * fill(f.getFname(), "Dilip Kumar"); fill(f.getLname(), "P"); fill(f.getMail(),
 * "selenium123@gmail.com"); fill(f.getCountry(), "India"); fill(f.getCity(),
 * "Chennai"); fill(f.getMsg(),
 * "Hi, I am Dilip this is the Worst Webpage I ever seen"); fill(f.getCode(),
 * "DqBn");
 * 
 * }
 * 
 * @Then("User have click Search button") public void
 * user_have_click_Search_button() { btnclick(f.getBtn()); }
 */
