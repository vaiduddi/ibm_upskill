package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UniformChangePasswordPOM {
	private WebDriver driver; 
	
	public UniformChangePasswordPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	//Change your password link
		@FindBy(xpath="//a[contains(text(),'Change your password')]")
		private WebElement clickChangeyourpasswordlink; 
		
		//Change Password page Password field
		@FindBy(xpath="//input[@id='input-password']")
		private WebElement sendPassword;
		
		//Change Password Page Password Confirm field
		@FindBy(xpath="//input[@id='input-confirm']")
		private WebElement sendPasswordConfirm; 
		
		//Change Password Page Continue Button
		@FindBy(xpath="//input[@class='btn btn-primary']")
		private WebElement clickContinueButton; 
		
		//===================================================================================
	
	
		//Change your password
		public void clickChangeyourpasswordlink() {
			this.clickChangeyourpasswordlink.click();
		}
		
		//Change Password page Password field
		public void sendPassword(String password) {
			this.sendPassword.clear(); 
			this.sendPassword.sendKeys(password);; 
		}
		
		//Change Password Page Password Confirm field
		public void sendPasswordConfirm(String passwordconfirm) {
			this.sendPasswordConfirm.clear(); 
			this.sendPasswordConfirm.sendKeys(passwordconfirm); 
		}
	
		//Change Password Page Continue Button
		public void clickContinueButton() { 
			this.clickContinueButton.click();
		}
		
		
}
