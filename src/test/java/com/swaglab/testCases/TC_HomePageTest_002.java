package com.swaglab.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.swaglab.pageObject.HomePage;
import com.swaglab.pageObject.LoginPage;

public class TC_HomePageTest_002 extends BaseClass {
	
	@Test
	public void TC_HP_001() {
		
		driver.get(baseUrl);
		logger.info("driver launch");
		
		LoginPage lp=new LoginPage(driver);

		lp.setUserName(userName);
		logger.info("user name added");
		lp.setPassword(password);
		logger.info("password added");
		lp.clickLogin();
		logger.info("click on login");
		
		HomePage hp=new HomePage(driver);
		hp.clickAddToCart();
		logger.info("click on add to cark");
		hp.clickShoppingcart();
		logger.info("click on shopping cart");
		
		Assert.assertTrue(true);
		
		
	}

}
