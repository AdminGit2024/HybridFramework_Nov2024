package com.jala.qa.testlayer;

import java.io.IOException;

import org.jspecify.annotations.Nullable;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jala.qa.pagelayer.loginPage;
import com.jala.qa.testbase.testBase;

public class LoginTestPage extends testBase {
	loginPage login;
	public LoginTestPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@BeforeMethod
	public void setUp() throws IOException {
		intilization();
		 login = new loginPage();
		
	}
	
	@Test
	public void validateLoginPage() throws InterruptedException {
		login.usename(prop.getProperty("Uername"));
		login.PassWord(prop.getProperty("Password"));
		login.clickOnLoginBtn();
		holdTime();
		String actual = driver.getCurrentUrl();
		Assert.assertEquals(actual, "https://magnus.jalatechnologies.com/Home/Index", "TC failed");
		Reporter.log("Url matched.. TC passed", true);
	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException {
		holdTime();
		driver.close();
	}

}
