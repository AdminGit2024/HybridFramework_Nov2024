package com.jala.qa.testlayer;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;

import com.jala.qa.testbase.testBase;

public class SearchTestPage extends testBase {

	public SearchTestPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@BeforeMethod
	public void setUp() {
		intilization();
	}

}
