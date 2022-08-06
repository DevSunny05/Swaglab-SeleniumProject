package com.swaglab.testCases;

import org.testng.annotations.Test;

import com.swaglab.pageObject.LoginPage;

public class TC_LoginTest_001 extends BaseClass {
	
	@Test
	public void TC_LF_001() {
		driver.get(baseUrl);
		logger.info("driver launch");
		
		LoginPage lp=new LoginPage(driver);
		
		lp.setUserName(userName);
		logger.info("user name added");
		lp.setPassword(password);
		logger.info("password added");
		lp.clickLogin();
		logger.info("click on login");
		
	}

}
