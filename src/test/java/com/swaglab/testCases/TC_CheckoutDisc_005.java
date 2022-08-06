package com.swaglab.testCases;

import org.testng.annotations.Test;

import com.swaglab.pageObject.CartPage;
import com.swaglab.pageObject.CheckoutDiscPage;
import com.swaglab.pageObject.CheckoutInfoPage;
import com.swaglab.pageObject.HomePage;
import com.swaglab.pageObject.LoginPage;

public class TC_CheckoutDisc_005 extends BaseClass {
	
	@Test
	public void TC_COD_001() {
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
//		hp.clickAddToCart();
//		logger.info("click on add to cark");
		hp.clickShoppingcart();
		logger.info("click on shopping cart");
		
		
		CartPage cp=new CartPage(driver);
		cp.ClickCheckout();
		logger.info("click on checkout");
		
		
		CheckoutInfoPage coi=new CheckoutInfoPage(driver);
		coi.EnterFirstName("sarang");
		logger.info("first name added");
		coi.EnterLastName("patil");
		logger.info("last name addes");
		coi.EnterZip("411052");
		logger.info("zip added");
		coi.ClickContinue();
		logger.info("click on continue");
		
		CheckoutDiscPage cod =new CheckoutDiscPage(driver);
		cod.clickFinish();
		logger.info("click on finish");
	}

}
