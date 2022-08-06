package com.swaglab.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver ldriver;
	public HomePage(WebDriver rdriver) {
		this.ldriver=rdriver;
		PageFactory.initElements(rdriver,this );
	}
	
	
	@FindBy(xpath="//*[@id='add-to-cart-sauce-labs-backpack']")
	WebElement clickAddToCart;
	
	@FindBy(xpath="//*[@id='shopping_cart_container']")
	WebElement clickShoppingCart;
	
	
	public void clickAddToCart() {
		clickAddToCart.click();
	}
	
	public void clickShoppingcart() {
		clickShoppingCart.click();
	}
}
