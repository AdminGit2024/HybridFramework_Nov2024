package com.jala.qa.testlayer;

import java.io.IOException;

import org.jspecify.annotations.Nullable;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jala.qa.pagelayer.HomePage;
import com.jala.qa.testbase.testBase;

public class HomeTestPage extends testBase{

	HomePage home;
	
	public HomeTestPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@BeforeMethod
	public void setUp() throws IOException {
		intilization();
		 home = new HomePage();
	}
	
	@Test
	public void validateHomepage() {
		home.clickOnLogOutBtn();
		
		String actual = driver.getTitle();
		Assert.assertEquals(actual, "Login");
		Reporter.log("Page Title matched", true);
	}
	
	
	@AfterMethod
	public void tearDown() throws InterruptedException {
		holdTime();
		driver.close();
	}

}
