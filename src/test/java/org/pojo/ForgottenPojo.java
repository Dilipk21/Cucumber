package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgottenPojo extends BaseClass {
	public ForgottenPojo() {
	PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//input[@name='firstName']")
	private WebElement fname;
	@FindBy(xpath="//input[@name='lastName']")
	private WebElement lname;
	@FindBy(xpath="//input[@id='email']")
	private WebElement mail;
	@FindBy(xpath="//label[text()='Country (required)']")
	private WebElement country;
	@FindBy(xpath="//input[@id='city']")
	private WebElement city;
	@FindBy(xpath="//textarea[@id='message']")
	private WebElement msg;
	@FindBy(xpath="//input[@name='code']")
	private WebElement code;
	@FindBy(xpath="//button[text()='Send']")
	private WebElement btn;
	public WebElement getFname() {
		return fname;
	}
	public WebElement getLname() {
		return lname;
	}
	public WebElement getMail() {
		return mail;
	}
	public WebElement getCountry() {
		return country;
	}
	public WebElement getCity() {
		return city;
	}
	public WebElement getMsg() {
		return msg;
	}
	public WebElement getCode() {
		return code;
	}
	public WebElement getBtn() {
		return btn;
	}

}
