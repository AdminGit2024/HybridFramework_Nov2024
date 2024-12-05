package com.jala.qa.pagelayer;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jala.qa.testbase.testBase;

public class SearchPage extends testBase {

	

	@FindBy(id = "MobileNo")
	WebElement mobileNo;
	
	@FindBy(id = "btnSearch")
	WebElement clickOnsearchBtn;
	
	@FindBy(id = "tblEmployee")
	WebElement employeeTable;
	
	
	public SearchPage() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	public void enterMobileNo() {
		mobileNo.sendKeys("9999999999");
	}
	
	public void clickOnSearch() {
		clickOnsearchBtn.click();
	}
		
	public void getdataOfTable() {
		List<WebElement> tableVaue = employeeTable.findElements(By.tagName("tr"));
		for(int i=0; i<tableVaue.size(); i++) {
			System.out.println(tableVaue.get(i).getText());
			String actual = tableVaue.get(i).getText();
			 String expected ="lucky";
			 if(actual.contains(expected)) {
				 System.out.println("matched");
			 }
		}
	}
	
	
	
}
