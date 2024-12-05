package com.jala.qa.pagelayer;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jala.qa.testbase.testBase;

public class HomePage extends testBase {
	// 1. page object factory/repository 2. constructor 3. action fuction
	

	@FindBy(linkText = "Employee")
	WebElement employeeTab;
	
	@FindBy(linkText = "Create")
	WebElement createTab;
	
	@FindBy(linkText = "Search")
	WebElement searchTab;
	
	@FindBy(xpath = "//span[text()='Logout']")
	WebElement logOutBtn;
	
	public HomePage() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnEmployeeTab() {
		employeeTab.click();
		createTab.click();
	}
	
	public void clickOnSearchtab() {
		searchTab.click();
	}
	
	public void clickOnLogOutBtn() {
		logOutBtn.click();
	}
	
	public void clickOnSearchTab() {
		searchTab.click();
	}
	
	
}
