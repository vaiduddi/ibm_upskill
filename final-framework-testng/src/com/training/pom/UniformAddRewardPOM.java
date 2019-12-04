package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UniformAddRewardPOM {
	private WebDriver driver; 
	private Actions action;
	
	public UniformAddRewardPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	    //Customer Name
		@FindBy(xpath="//input[@id='input-name']")
		private WebElement customerName; 
		
		//Filter Button
		@FindBy(xpath="//button[@id='button-filter']")
		private WebElement filterButton; 
		
		//Customer Edit link 
		@FindBy(xpath="//a[@data-original-title='Edit']")
		private WebElement editButton; 
		
		//First Name
		@FindBy(xpath="//input[@id='input-firstname']")
		private WebElement firstName;
		
		//Address1 link
		@FindBy(xpath="//a[contains(text(),'Address 1')]")
		private WebElement address1;
		
		//Post Code
		@FindBy(xpath="//input[@id='input-postcode1']")
		private WebElement postcode;
		
		// Reward Points Link
		@FindBy(xpath="//ul[@class='nav nav-tabs']//a[contains(text(),'Reward Points')]")
		private WebElement rewardPointslink;
		
		// Reward Description
		@FindBy(xpath="//input[@id='input-reward-description']")
		private WebElement rewardDescription;
		
		// Reward Points
		@FindBy(xpath="//input[@id='input-points']")
		private WebElement rewardPoints;
		
		// Add Reward Points Button 
		@FindBy(xpath="//button[@id='button-reward']")
		private WebElement addRewardPointsButton;
		
		// Save button
		@FindBy(xpath="//button[@data-original-title='Save']")
		private WebElement saveButton;
		
		
		//===================================================================================
	
	
		//Customer Name
		public void sendCustomerName(String custname) {
			this.customerName.sendKeys(custname);
		}
		
		//Filter Button
		public void clickFilterButton() {
			this.filterButton.click();
		}
		
		//Customer Edit Link 
		public void clickEditButton() {
			this.editButton.click();
		}
		
		//First Name
		public void sendFirstName(String firstname) {
			this.firstName.clear();
			this.firstName.sendKeys(firstname);
		}
		
		//Address1 link 
		public void clickAddress1() {
			this.address1.click();
		}
		
		//Post code 
		public void sendPostCode(String postcode) {
			this.postcode.clear();
			this.postcode.sendKeys(postcode);
		}
		
		//Reward Points Link
		public void clickRewardPoints() {
			this.rewardPointslink.click();
		}
		
		//Reward Description 
		public void sendRewardDescription(String rewarddescription) {
			this.rewardDescription.clear();
			this.rewardDescription.sendKeys(rewarddescription);
		}
		
		//Reward Points 
		public void sendRewardPoints(String rewardpoints) {
			this.rewardPoints.clear();
			this.rewardPoints.sendKeys(rewardpoints);
		}
		
		//Add Reward Points Button
		public void clickAddRewardPointsButton() {
			this.addRewardPointsButton.click();
		}
		
		// Save button
		public void clickSaveButton() {
			this.saveButton.click();
		}
		
}
