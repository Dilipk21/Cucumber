package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass {
	public LoginPojo() {
		PageFactory.initElements(driver, this);
	}

	@CacheLookup
	@FindBys({ @FindBy(xpath = "//input[@id='email']"), @FindBy(xpath = "//input[@name='email']") })
	private WebElement txtEmail;
	@CacheLookup
	@FindAll({ @FindBy(xpath = "//input[@id='pass']"), @FindBy(xpath = "//input[@name='password']") })

	private WebElement txtPass;
	@FindBy(name = "login")
	private WebElement btnLogin;

	public WebElement getTxtEmail() {
		return txtEmail;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	@FindBy(xpath = "//a[text()='Forgotten password?']")
	private WebElement forgottenpass;
	@FindBy(xpath = "//input[@placeholder='Email address or mobile number']")
	private WebElement txtsrchbox;
	@FindBy(xpath = "//button[text()='Search']")
	private WebElement btnsrch;

	public WebElement getForgottenpass() {
		return forgottenpass;
	}

	public WebElement getTxtsrchbox() {
		return txtsrchbox;
	}

	public WebElement getBtnsrch() {
		return btnsrch;

	}
}