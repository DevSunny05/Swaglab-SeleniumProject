package com.swaglab.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	
	public WebDriver ldriver;
	
	public CartPage(WebDriver rdriver) {
		this.ldriver=rdriver;
		
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//*[@id=\"checkout\"]")
	WebElement clickCheckout;
	
	@FindBy(xpath="//*[@id=\"remove-sauce-labs-backpack\"]")
	WebElement clickRemove;
	
	@FindBy(xpath="//*[@id='item_4_title_link']/div")
	WebElement validateProduct;
	
	
	public void ClickCheckout() {
		clickCheckout.click();
	}
	
	
	

}
