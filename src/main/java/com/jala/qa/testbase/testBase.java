package com.jala.qa.testbase;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class testBase {
public static Properties prop;
public static WebDriver driver;
	testBase() throws IOException{
		 prop = new Properties();
		 String baseLocation = System.getProperty("user.dir");
		FileInputStream file = new FileInputStream(baseLocation+"\\src\\main\\java\\com\\jala\\qa\\enviromentLayer\\config.properties");
		prop.load(file);
	}
	

	public void intilization() {
		String Browser = prop.getProperty("Browsername");
		if(Browser.equals("chrome")) {
			 driver = new ChromeDriver();
		}else if(Browser.equals("firefox")) {
			driver = new FirefoxDriver();
		}else if(Browser.equals("edge")) {
			driver = new EdgeDriver();
		}
		else {
			System.out.println("something went wrong... please check browsername");
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("Url"));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
	}
	
	public static void holdTime() throws InterruptedException {
		Thread.sleep(3000);
		
	}
	
}
