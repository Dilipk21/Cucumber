package org.base;

import java.io.IOException;

//import org.pojo.LoginPojo;
import org.pojo.LoginPojo1;

//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;

public class ChildClass extends BaseClass {
	public static void main(String[] args) throws IOException {
		launchBrowser();
		loadUrl("https://www.facebook.com/");
		maxBrowser();
		pageTitle();
		LoginPojo1 l = new LoginPojo1();
		fill(l.getTxtEmail(), "Dilipk21@gmail.com");
		fill(l.getTxtPass(), "123456");
		btnclick(l.getBtnLogin());

	}
}