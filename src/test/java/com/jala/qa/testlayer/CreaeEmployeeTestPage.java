package com.jala.qa.testlayer;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.jala.qa.pagelayer.EmployeePage;
import com.jala.qa.pagelayer.HomePage;
import com.jala.qa.pagelayer.loginPage;
import com.jala.qa.testbase.testBase;

public class CreaeEmployeeTestPage extends testBase {

	EmployeePage emp;
	public CreaeEmployeeTestPage() throws IOException {
		super();
		
	}

	@BeforeMethod
	public void setUp() throws IOException {
		intilization();
		loginPage login = new loginPage();
		login.usename(prop.getProperty("Uername"));
		login.PassWord(prop.getProperty("Password"));
		login.clickOnLoginBtn();
		HomePage home = new HomePage();
		home.clickOnEmployeeTab();
		 emp = new EmployeePage();
	}
	
	@DataProvider
	public Object[][] addData() {
		Object[][] data = {{"mayur","xyz"},
							{"saleem","pqr"}};
		return data;
	}
	
	@Test(dataProvider = "addData")
	public void validateEmployeePage(String fname, String lname) {
	emp.enterFirstName(fname);
	emp.enterlastname(lname);
	emp.enterEmailId("dipak@gmail.com");
	emp.enterMobileNumber("9787378732");
	emp.enterDOB("15/10/2024");
	emp.clickOnMaleBtn();
	emp.enterAddrss("Pune");
	emp.selectCountryId();
	emp.selectCityId();
	emp.slectSkills();
	emp.clickOnSaveBtn();
		
	}
}
