package com.jala.qa.pagelayer;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jala.qa.testbase.testBase;

public class loginPage extends testBase {

	// 1. page object factory/repository 2. constructor 3. action fuction

	@FindBy(id = "UserName")
	WebElement usenrame;

	@FindBy(id = "Password")
	WebElement password;

	@FindBy(id = "btnLogin")
	WebElement loginBtn;

	public loginPage() throws IOException {

		PageFactory.initElements(driver, this);
	}

	public void usename(String Uname) {
		usenrame.sendKeys(Uname);
	}

	public void PassWord(String Pass) {
		password.sendKeys(Pass);
	}

	public void clickOnLoginBtn() {
		loginBtn.click();
	}

}
