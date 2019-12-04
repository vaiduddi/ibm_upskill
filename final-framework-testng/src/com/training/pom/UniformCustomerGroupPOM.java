package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UniformCustomerGroupPOM {
	private WebDriver driver; 
	private Actions action;
	
	public UniformCustomerGroupPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	    //Dashboard User Icon
		@FindBy(xpath="//li[@id='customer']")
		private WebElement dashboardUserIcon; 
		
		//Dashboard Customer Group 
		@FindBy(xpath="//a[contains(text(),'Customer Groups')]")
		private WebElement dashboardCustomerGroup;
		
		// Customer groups Add new button
		@FindBy(xpath="//a[@data-original-title='Add New']")
		private WebElement addNewButton;
		
		//customer group name
		@FindBy(xpath="//input[@placeholder='Customer Group Name']")
		private WebElement customerGroupName;
		
		//description
		@FindBy(xpath="//textarea[@id='input-description1']")
		private WebElement description;
		
		//Approve new customer radio button
		@FindBy(xpath="//div[@class='col-sm-10']//label[1]")
		private WebElement yesRadioButton;
		
		// Save button
		@FindBy(xpath="//button[@data-original-title='Save']")
		private WebElement saveButton;
		
		
				
		//===================================================================================
	
	
		//Dashboard User Icon
		public void clickDashboardUserIcon() {
			this.dashboardUserIcon.click();	
		}
		
		//Dashboard Customer Group 
		public void clickDashboardCustomerGroup() {
			this.dashboardCustomerGroup.click();	
		}
		
		// Customer groups Add new button
		public void clickAddNewButton() {
			this.addNewButton.click();	
		}
		
		//customer group name
		public void sendCustomerGroupName(String customergroupname) {
			this.customerGroupName.clear();
			this.customerGroupName.sendKeys(customergroupname);
		}
		
		//description
		public void sendDescription(String descriptiontext) {
			this.description.clear();
			this.description.sendKeys(descriptiontext);
		}
		
		//Approve new customer radio button
		public void clickYesRadioButton() {
			this.yesRadioButton.click();	
		}
		
		// Save button
		public void clickSaveButton() {
			this.saveButton.click();
		}
		
		
		
		
}
