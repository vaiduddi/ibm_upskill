package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UniformEditAccountPOM {
	private WebDriver driver; 
	
	public UniformEditAccountPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	//Edit Account
	@FindBy(xpath="//a[contains(text(),'Edit Account')]")
	private WebElement editAccountLink;
	
	//Edit Account FirstName
	@FindBy(xpath="//input[@id='input-firstname']")
	private WebElement 	editAccountFirstName;
	
	//Edit Account LastName
	@FindBy(xpath="//input[@id='input-lastname']")
	private WebElement 	editAccountLastName;
	
	//Edit Account Email
	@FindBy(xpath="//input[@id='input-email']")
	private WebElement 	editAccountEmail;
	
	//Edit Account Telephone
	@FindBy(xpath="//input[@id='input-telephone']")
	private WebElement 	editAccountTelephone;
	
	//Edit Account Continue button
	@FindBy(xpath="//input[@class='btn btn-primary']")
	private WebElement 	editAccountContinueButton;
		
	
	//=======================================================================================
	
	//Edit Account
	public void clickEditAccountLink() { 
		this.editAccountLink.click();
	}
	
	//Edit Account FirstName
		public void sendEditAccountFirstName(String FirstName) { 
			this.editAccountFirstName.clear(); 
			this.editAccountFirstName.sendKeys(FirstName);
		}
	
    //Edit Account LastName
		public void sendEditAccountLastName(String LastName) { 
			this.editAccountLastName.clear();
			this.editAccountLastName.sendKeys(LastName);
		}
		
	//Edit Account Email
		public void sendEditAccountEmail(String Email) {
			this.editAccountEmail.clear();
			this.editAccountEmail.sendKeys(Email);
		}
	
		//Edit Account Telephone
		public void sendEditAccountTelephone(String Telephone) { 
			this.editAccountTelephone.clear();
			this.editAccountTelephone.sendKeys(Telephone);
		}
	//Edit Account Continue button	
		public void clickEditAccountContinueButton() { 
			this.editAccountContinueButton.click();
		}
	
	
}
