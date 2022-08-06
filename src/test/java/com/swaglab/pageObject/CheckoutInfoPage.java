package com.swaglab.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutInfoPage {
	WebDriver ldriver;
	
	public CheckoutInfoPage(WebDriver rdriver) {
		this.ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//*[@id='first-name']")
	WebElement enterFirstName;
	
	@FindBy(xpath="//*[@id='last-name']")
	WebElement enterLastName;
	
	@FindBy(xpath="//*[@id='postal-code']")
	WebElement enterZip;
	
	@FindBy(xpath="//*[@id='continue']")
	WebElement clickContinue;
	
	public void EnterFirstName(String fname) {
		enterFirstName.sendKeys(fname);
	}
	
	public void EnterLastName(String lname) {
		enterLastName.sendKeys(lname);
	}
	
	public void EnterZip(String zip) {
		enterZip.sendKeys(zip);
	}
	
	public void ClickContinue() {
		clickContinue.click();
	}
	
	
	

}
