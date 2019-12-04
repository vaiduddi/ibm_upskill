package com.training.pom;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class UniformCustomerPOM {
	private WebDriver driver; 
	private Actions action;
	
	
	public UniformCustomerPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	    //Dashboard User Icon
		@FindBy(xpath="//li[@id='customer']")
		private WebElement dashboardUserIcon; 
		
		// Customer groups Add new button
		@FindBy(xpath="//a[@data-original-title='Add New']")
		private WebElement addNewButton;
		
		//Dashboard Customer
		@FindBy(xpath="//li[@id='customer']//ul//li//a[contains(text(),'Customers')]")
		private WebElement dashboardCustomer;
		
		//Customer Group dropdown
		@FindBy(xpath="//select[@id='input-customer-group']")
		private WebElement customerGroupDropdown;
		
		//Customer Group dropdown Premium Member
		@FindBy(xpath="//option[contains(text(),'Premium Member')]")
		private WebElement customerPremiumMember;
		
		//Customers FirstName
		@FindBy(xpath="//input[@id='input-firstname']")
		private WebElement firstName;
		
		//Customers LastName
		@FindBy(xpath="//input[@id='input-lastname']")
		private WebElement lastName;
		
		//Customers Email
		@FindBy(xpath="//input[@id='input-email']")
		private WebElement email;
		
		//Customers Telephone
		@FindBy(xpath="//input[@id='input-telephone']")
		private WebElement telephone;
		
		//Customers Password
		@FindBy(xpath="//input[@id='input-password']")
		private WebElement password;
		
		//Customers Confirm Password
		@FindBy(xpath="//input[@id='input-confirm']")
		private WebElement confirmPassword;
		
		//Customers Add Address Button
		@FindBy(xpath="//a[contains(text(),'Add Address')]")
		private WebElement addAddress;
		
		//Customers FirstName1
		@FindBy(xpath="//input[@id='input-firstname1']")
		private WebElement firstName1;
		
		//Customers LastName1
		@FindBy(xpath="//input[@id='input-lastname1']")
		private WebElement lastName1;
		
		//Customers Address1
		@FindBy(xpath="//input[@id='input-address-11']")
		private WebElement address1;
		
		//Customers Address2
		@FindBy(xpath="//input[@id='input-address-21']")
		private WebElement address2;
		
		//Customers City
		@FindBy(xpath="//input[@id='input-city1']")
		private WebElement city;
		
		//Customers Postcode
		@FindBy(xpath="//input[@id='input-postcode1']")
		private WebElement postcode;
		
		//Customers Country dropdown
		@FindBy(xpath="//select[@id='input-country1']")
		private WebElement countrydropdown;
		
		//Customers Country India
		@FindBy(xpath="//body//option[107]")
		private WebElement countryindia;
		
		//Customers State dropdown
		@FindBy(xpath="//select[@id='input-zone1']")
		private WebElement statedropdown;
		
		//Customers State Karnataka
		@FindBy(xpath="//option[contains(text(),'Karnataka')]")
		private WebElement statekarnataka;
		
		// Save button
		@FindBy(xpath="//button[@data-original-title='Save']")
		private WebElement saveButton;
		
		// Success Message
		@FindBy(xpath="//div[@class='alert alert-success']")
		private WebElement successmessage;
				
		//===================================================================================
	
	
		//Dashboard User Icon
		public void clickDashboardUserIcon() {
			this.dashboardUserIcon.click();	
		}
		
		// Customer groups Add new button
		public void clickAddNewButton() {
			this.addNewButton.click();	
		}
		
		//Dashboard Customer
		public void clickdashboardCustomer() {
			this.dashboardCustomer.click();
		}
		
		//Customer Group dropdown
		public void clickCustomerGroupdropdown() {
			this.customerGroupDropdown.click();
			
		}
		
		//Customer Group dropdown Premium Member
		public void clickcustomerPremiumMember(String customergroup) {
			//this.customerPremiumMember.click();
			Select sCustomerGroup = new Select(customerGroupDropdown);
			sCustomerGroup.selectByVisibleText(customergroup);
		}
		
		//Customers First name
		public void sendCustomersFirstName(String firstname) {
			this.firstName.sendKeys(firstname);
		}
		
		//Customers Last name
		public void sendCustomersLastName(String lastname) {
			this.lastName.sendKeys(lastname);
		}
		
		//Customers Email
		public void sendEmail(String email) {
			this.email.sendKeys(email);
		}
		
		//Customers Telephone
		public void sendTelephone(String telephone) {
			this.telephone.sendKeys(telephone);
		}
		
		//Customers Password
		public void sendPassword(String password) {
			this.password.sendKeys(password);
		}
		
		//Customers confirm Password
		public void sendConfirmPassword(String confirmpassword) {
			this.confirmPassword.sendKeys(confirmpassword);
		}
		
		//Customers Add Address
		public void clickAddAddress() {
			this.addAddress.click();
		}
		
		//Customers First name1
		public void sendCustomersFirstName1(String firstname1) {
			this.firstName1.sendKeys(firstname1);
		}
		
		//Customers Last name1
		public void sendCustomersLastName1(String lastname1) {
			this.lastName1.sendKeys(lastname1);
		}
		
		//Customers Address1
		public void sendAddress1(String address1) {
			this.address1.sendKeys(address1);
		}
		
		//Customers Address2
		public void sendAddress2(String address2) {
			this.address2.sendKeys(address2);
		}
		
		//Customers city
		public void sendCity(String city) {
			this.city.sendKeys(city);
		}
		
		//Customers Postcode
		public void sendPostcode(String postcode) {
			this.postcode.sendKeys(postcode);
		}
		
		//Customers Country dropdown
		public void clickCountryDropdown() {
			this.countrydropdown.click();
		}
		
		//Customers Country India
		public void clickCountryIndia(String country) {
			//this.countryindia.click();
			Select sCountry = new Select(countrydropdown);
			sCountry.selectByVisibleText(country);
		}
		
		//Customers State Dropdown
		public void clickStateDropdown() {
			this.statedropdown.click();
		}
		
		//Customers State Karnataka
		public void clickStateKarnataka(String state) {
			//this.statekarnataka.click();
			Select sState = new Select(statedropdown);
			sState.selectByVisibleText(state);
		}
		
		// Save button
		public void clickSaveButton() {
			this.saveButton.click();
		}
		
		// Success Mesage Verification
		public void verifySuccessMessage() {
			this.successmessage.isDisplayed();
			String actual = successmessage.getText();
			String expected = " Success: You have modified customers!      ";
			assertEquals(actual, expected);
			System.out.println("pass");
		}
		
}
