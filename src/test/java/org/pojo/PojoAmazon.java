package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoAmazon extends BaseClass {
	public PojoAmazon() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[@id='nav-link-accountList']")
	private WebElement signin;
	@FindBy(xpath = "//input[@id='ap_email']")
	private WebElement mblenumber;
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement cont;
	@FindBy(xpath = "//input[@id='ap_password']")
	private WebElement pass;
	@FindBy(xpath = "//input[@id='signInSubmit']")
	private WebElement submitbtn;
	@FindBy(xpath = "//input[@type='text']")
	private WebElement srchbox;
	@FindBy(xpath = "//input[@id='nav-search-submit-button']")
	private WebElement click;
	@FindBy(xpath = "(//span[contains(text(),'Samsung Galaxy ')])[2]")
	private WebElement fix;
	@FindBy(xpath = "(//div[@class='a-accordion-inner accordion-row-content']//parent::div//following-sibling::div//div[@class='a-button-stack'])[4]")
	private WebElement cart;

	public WebElement getsignin() {
		return signin;
	}

	public WebElement getmblenumber() {
		return mblenumber;
	}

	public WebElement getcont() {
		return cont;
	}

	public WebElement getpass() {
		return pass;
	}

	public WebElement getsubmitbtn() {
		return submitbtn;
	}

	public WebElement getSrchbox() {
		return srchbox;
	}

	public WebElement getClick() {
		return click;
	}

	public WebElement getFix() {
		return fix;
	}

	public WebElement getCart() {
		return cart;
	}

}