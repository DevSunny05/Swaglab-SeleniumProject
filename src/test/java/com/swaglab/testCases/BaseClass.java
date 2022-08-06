package com.swaglab.testCases;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.swaglab.utilities.ReadConfig;

public class BaseClass {
	
	ReadConfig readconfig=new ReadConfig();
	
	
	public static WebDriver driver;
	public static Logger logger;
	public String baseUrl="https://www.saucedemo.com/";
	public String userName="standard_user";
	public String password="secret_sauce";
	
	@BeforeTest
	public void setup() {
		
		logger=Logger.getLogger("SwaglabAutomation");
		PropertyConfigurator.configure("Log4j.properties");
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\Hp\\eclipse-workspace\\TutorialsNinja\\Driver\\msedgedriver.exe");
		driver=new EdgeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
