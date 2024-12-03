package com.jala.qa.testlayer;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.jala.qa.pagelayer.EmployeePage;
import com.jala.qa.pagelayer.HomePage;
import com.jala.qa.pagelayer.loginPage;
import com.jala.qa.testbase.testBase;
import com.jala.qa.utilityLayer.dataProvider;

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
	
//	@DataProvider
//	public Object[][] addData() {
//		Object[][] data = {{"mayur","xyz","mayur@gmail.com"},
//							{"saleem","pqr", "saleem@gmail.com"},
//							{"satish","jfld", "satish@gmail.com"}};
//		return data;
//	}
	@DataProvider
	public Object[][] getdataFromExcelSheet() throws IOException {
		dataProvider dataP = new dataProvider();
		Object[][] data = dataP.getDataFromExcel("Sheet1");
		return data;
	}
	
	
	@Test(dataProvider = "getdataFromExcelSheet")
	public void validateEmployeePage(String fname, String lname, String mail, String mobileNo, String dob, String address) {
	emp.enterFirstName(fname);
	emp.enterlastname(lname);
	emp.enterEmailId(mail);
	emp.enterMobileNumber(mobileNo);
	emp.enterDOB(dob);
	emp.clickOnMaleBtn();
	emp.enterAddrss(address);
	emp.selectCountryId();
	emp.selectCityId();
	emp.slectSkills();
	emp.clickOnSaveBtn();
		
	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException {
		holdTime();
		driver.close();
		driver.quit();
	}
}
