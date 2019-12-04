package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UniformLoginPOM {
	private WebDriver driver; 
	
	public UniformLoginPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	    //Home Page User ICON Arrow
		@FindBy(xpath="//span[@class='caret']")
		private WebElement userIconArrow; 
		
		//Home Page user ICON Login Dropdown
		@FindBy(xpath="//a[contains(text(),'Login')]")
		private WebElement login;
		
		//Login Page Email text box
		@FindBy(xpath="//input[@id='input-email']")
		private WebElement inputEmail; 
		
		//Login Page Password text box
		@FindBy(xpath="//input[@id='input-password']")
		private WebElement inputPassword; 
		
		//Login Page Login Button
		@FindBy(xpath="//input[@class='btn btn-primary']")
		private WebElement loginButton; 
		
		//===================================================================================
		
		//Uniform Login Admin
		
		// Login UserName Admin
		@FindBy(xpath="//input[@id='input-username']")
		private WebElement userNameAdmin; 
		
		// Login Password Admin
		@FindBy(xpath="//input[@id='input-password']")
		private WebElement passwordAdmin; 
		
		// Login Button Admin
		@FindBy(xpath="//button[@class='btn btn-primary']")
		private WebElement loginButtonAdmin; 
		
		
		//===================================================================================
	
	
		//Home Page User ICON Arrow
		public void clickuserIconArrow() {
			this.userIconArrow.click();
		}
		
		//Home Page user ICON Login Dropdown
		public void clickLoginbtn() {
			this.login.click(); 
		}
		
		//Login Page Email text box
		public void sendEmail(String email) {
			this.inputEmail.clear(); 
			this.inputEmail.sendKeys(email); 
		}
		
		//Login Page Password text box
		public void sendPassword(String password) {
			this.inputPassword.clear(); 
			this.inputPassword.sendKeys(password); 
		}
		
		//Login Page Login Button
		public void clickLoginButton() { 
			this.loginButton.click();
		}
		
		
		//=============================================================================
		
		//Uniform Login Admin
		
	    // Login UserName Admin
		public void sendUserName(String usernameadmin) { 
			this.userNameAdmin.sendKeys(usernameadmin); 
		}
		
		// Login Password Admin
		public void sendPasswordAdmin(String  passwordadmin) { 
			this.passwordAdmin.sendKeys(passwordadmin); 
		}
		
		// Login Button Admin
		public void clickLoginButtonAdmin() { 
			this.loginButtonAdmin.click();
		}
		
}
