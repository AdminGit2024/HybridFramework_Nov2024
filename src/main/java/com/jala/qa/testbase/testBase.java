package com.jala.qa.testbase;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class testBase {
public static Properties prop;
public static WebDriver driver;
public	testBase() throws IOException{
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
//		Implicit wait
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); // 2sec = relese 13 sec
//	explicit wait
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30)); // 5 sec = relse 25 sec
//		 WebElement username = driver.findElement(By.id("UserName"));
//		 wait.until(ExpectedConditions.visibilityOf(username));
		 
		 
	}
	
	public static void holdTime() throws InterruptedException {
		Thread.sleep(4000);   // 2 sec => wait for 3 sec = 1 sec hold
		
	}
	
}
