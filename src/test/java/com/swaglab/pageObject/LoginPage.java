package com.swaglab.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver) {
		this.ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//*[@id=\"user-name\"]")
	WebElement textUsername;
	
	@FindBy(xpath="//*[@id=\"password\"]")
	WebElement textPassword;
	
	
	@FindBy(xpath="//*[@id=\"login-button\"]")
	WebElement clickLogin;
	
	
	public void setUserName(String uname) {
		textUsername.sendKeys(uname);
	}
	
	public void setPassword(String uname) {
		textPassword.sendKeys(uname);
	}
	
	public void clickLogin() {
		clickLogin.click();
	}
	
	
}
