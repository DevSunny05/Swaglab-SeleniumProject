package com.swaglab.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutDiscPage {
	
	public WebDriver ldriver;
	
	public CheckoutDiscPage(WebDriver rdriver) {
		this.ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//*[@id='finish']")
	WebElement clickFinish;
	
	
	public void clickFinish() {
		clickFinish.click();
	}

}
