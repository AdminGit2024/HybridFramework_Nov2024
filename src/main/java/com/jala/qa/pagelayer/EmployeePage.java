package com.jala.qa.pagelayer;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.jala.qa.testbase.testBase;

public class EmployeePage extends testBase{

	
	@FindBy(id = "FirstName")
	WebElement firstName;
	@FindBy(id = "LastName")
	WebElement lastName;
	@FindBy(id = "EmailId")
	WebElement emailId;
	@FindBy(id = "MobileNo")
	WebElement mobileNo;
	@FindBy(id = "DOB")
	WebElement DOB;
	@FindBy(id = "rdbMale")
	WebElement maleBtn;
	@FindBy(id = "rdbFemale")
	WebElement femaleBtn;
	@FindBy(id = "Address")
	WebElement address;
	@FindBy(id = "CountryId")
	WebElement countryId;
	@FindBy(id = "CityId")
	WebElement cityId;
	@FindBy(id = "chkOtherCity")
	WebElement clickOtherCityId;
	@FindBy(id = "chkSkill_3")
	WebElement selectSkill;
	@FindBy(xpath = "//button[text()='Save']")
	WebElement saveBtn;
	
	public EmployeePage() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	public void enterFirstName(String fName) {
		firstName.sendKeys(fName);
	}
	
	public void enterlastname(String lname) {
		lastName.sendKeys(lname);
	}
	
	public void enterEmailId(String email) {
		emailId.sendKeys(email);
	}
	
	public void enterMobileNumber(String MoNo) {
		mobileNo.sendKeys(MoNo);
	}
	
	public void enterDOB(String dob) {
		DOB.sendKeys(dob);
	}
	
	public void clickOnMaleBtn() {
		maleBtn.click();
	}
	
	public void clckOnFemaleBtn() {
		femaleBtn.click();
	}
	
	public void enterAddrss(String add) {
		address.sendKeys(add);
	}
	
	public void selectCountryId() {
		Select select = new Select(countryId);
		select.selectByIndex(5);
	}
	
	public void selectCityId() {
		Select select = new Select(cityId);
		select.selectByVisibleText("Hyderabad");
	}
	
	public void slectSkills() {
		selectSkill.click();
	}
	
	public void clickOnSaveBtn() {
		saveBtn.click();
	}
	
}
