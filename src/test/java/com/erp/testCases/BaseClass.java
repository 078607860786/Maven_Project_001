package com.erp.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	public String baseurl="https://demo.guru99.com/V4/";
	public String username="mngr417562";
	public String password="dEzuveq";
    public static WebDriver driver;
	
	@BeforeClass
	public void step() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Usman Sher\\eclipse-workspace\\SeleniumProject\\Maven_Project_001\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	@AfterClass
	public void tearDown() {
	
	}

}
