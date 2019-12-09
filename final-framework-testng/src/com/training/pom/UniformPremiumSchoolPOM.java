package com.training.pom;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class UniformPremiumSchoolPOM {
	private WebDriver driver; 
	
	public UniformPremiumSchoolPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}

		//Uniform Premium School 
		@FindBy(xpath="//div[@id='banner0']//div//img[@class='img-responsive']")
		private WebElement uniformPremiumSchool; 
		
		// REGULAR T-SHIRTS (Rust) link
		@FindBy(xpath="//img[contains(@title,'REGULAR T-SHIRTS (Rust)')]")
		private WebElement regularTShirtRust;
		
		//Chest size drop down
		@FindBy(xpath="//select[@id='input-option376']")
		private WebElement chestSizeDropDown;
		
		//Chest size 32
		@FindBy(xpath="//option[5]")
		private WebElement chestSize32;
		
		//add to cart button
		@FindBy(xpath="//button[@id='button-cart']")
		private WebElement addToCart;
		
		//Carticon
		@FindBy(xpath="//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")
		private WebElement cartIcon;
		
		//View Cart button
		@FindBy(xpath="//div[@id='cart']//div//a[1]")
		private WebElement viewCartButton;
		
		//Checkout button
		@FindBy(xpath="//a[@class='btn btn-primary']")
		private WebElement checkoutButton;
		
		//Guest Checkout Radio button
		@FindBy(xpath="//input[contains(@value,'guest')]")
		private WebElement guestCheckoutRadioButton;
		
		//Continue button
		@FindBy(xpath="//input[@id='button-account']")
		private WebElement continueButton;
		
		//First Name 
		@FindBy(xpath="//input[@id='input-payment-firstname']")
		private WebElement firstName;
		
		//Last Name 
		@FindBy(xpath="//input[@id='input-payment-lastname']")
		private WebElement lastName;
		
		//Email
		@FindBy(xpath="//input[@id='input-payment-email']")
		private WebElement email;
		
		//Telephone
		@FindBy(xpath="//input[@id='input-payment-telephone']")
		private WebElement telephone;
		
		//Address1
		@FindBy(xpath="//input[@id='input-payment-address-1']")
		private WebElement address1;
		
		//City
		@FindBy(xpath="//input[@id='input-payment-city']")
		private WebElement city;
		
		//Post Code
		@FindBy(xpath="//input[@id='input-payment-postcode']")
		private WebElement postCode;
		
		//Country
		@FindBy(xpath="//select[@id='input-payment-country']")
		private WebElement countryField;
		
		//State
		@FindBy(xpath="//select[@id='input-payment-zone']")
		private WebElement stateField;
		
		//Guest Continue Button
		@FindBy(xpath="//input[@id='button-guest']")
		private WebElement guestContinueButton;
		
		//Checkbox
		@FindBy(xpath="//input[@name='shipping_address']")
		private WebElement checkBox;
		
		//Comment
		@FindBy(xpath="//textarea[@name='comment']")
		private WebElement comment;
		
		//Continue button Shipping 
		@FindBy(xpath="//input[@id='button-shipping-method']")
		private WebElement continueButtonShipping;
		
		//T & C
		@FindBy(xpath="//input[@name='agree']")
		private WebElement termsAndConditions;
		
		//Continue Button payment
		@FindBy(xpath="//input[@id='button-payment-method']")
		private WebElement continueButtonPayment;
		
		//Confirm Order
		@FindBy(xpath="//input[@id='button-confirm']")
		private WebElement confirmOrderButton;
		
		//order processed text message
		@FindBy(xpath="//p[contains(text(),'Your order has been successfully processed!')]")
		private WebElement orderProcessed;
		
		//Dashboard Sale icon
		@FindBy(xpath="//li[@id='sale']/a[1]")
		private WebElement dashboardSalesIcon;
		
		//Dashboard Sale Orders link
		@FindBy(xpath="//li[@id='sale']/ul/li[1]/a[1]")
		private WebElement dashboardSalesOrders;
		
		//View Icon
		@FindBy(xpath="//tr[1]//td[8]//a[1]")
		private WebElement view;
		
		//Order status
		@FindBy(xpath="//select[@id='input-order-status']")
		private WebElement orderStatus;
		
		//Add History
		@FindBy(xpath="//button[@id='button-history']")
		private WebElement addHistoryButton;
		
		//Edit order
		@FindBy(xpath="//tr[1]//td[8]//a[2]")
		private WebElement editOrder;
		
		//Edit order Continue Button
		@FindBy(xpath="//button[@id='button-customer']")
		private WebElement editOrderContinueButton;
		
		//=============================================================================

		
		//Uniform Premium School 
		public void clickUniformPremiumSchool() { 
			this.uniformPremiumSchool.click();
		}
		
		// REGULAR T-SHIRTS (Rust) link
		public void clickRegularTShirtRust() { 
			this.regularTShirtRust.click();
		}
		
		// Chest size drop down
		public void clickChestSizeDropDown() { 
			this.chestSizeDropDown.click();
		}
		
		// Chest size 32
		public void selectChestSize32() { 
			//this.chestSize32.click();
			
			Select se = new Select(chestSizeDropDown);
			se.selectByValue("969");
		}
		
		//add to cart button
		public void clickAddToCart() { 
			this.addToCart.click();
		}
		
		//Carticon
		public void clickCartIcon() { 
			this.cartIcon.click();
		}
		
		//View Cart button
		public void clickViewCartButton() { 
			this.viewCartButton.click();
		}
		
		//Checkout button
		public void clickCheckoutButton() { 
			this.checkoutButton.click();
		}
		
		//Guest Checkout Radio button
		public void clickGuestCheckoutRadioButton() { 
			this.guestCheckoutRadioButton.click();
		}
		
		//Continue button
		public void clickContinueButton() { 
			this.continueButton.click();
		}
		
		//First Name 
		public void sendFirstName(String firstname) { 
			this.firstName.sendKeys(firstname);
		}
		
		//Last Name 
		public void sendLastName(String lastname) { 
			this.lastName.sendKeys(lastname);
		}
		
		//Email
		public void sendEmail(String email) { 
			this.email.sendKeys(email);
		}
		
		//Telephone
		public void sendTelephone(String telephone) { 
			this.telephone.sendKeys(telephone);
		}
		
		//Address1
		public void sendAddress1(String address1) { 
			this.address1.sendKeys(address1);
		}
		
		//City
		public void sendCity(String city) { 
			this.city.sendKeys(city);
		}
		
		//Post Code
		public void sendPostCode(String postcode) { 
			this.postCode.sendKeys(postcode);
		}
		
		//Country
		public void selectCountry(String country) { 
			this.countryField.click();
			Select se = new Select(countryField);
			se.selectByVisibleText(country);
		}
		
		//State
		public void selectState(String state) { 
			this.stateField.click();
			Select se = new Select(stateField);
			se.selectByVisibleText(state);
			
			
		}
		
		//Guest Continue Button
		public void clickGuestContinueButton() { 
			this.guestContinueButton.click();
		}
		
		//Checkbox
		public void verifyCheckBox() { 
			boolean cb = this.checkBox.isSelected();
			
			if(cb==false)
			{
				this.checkBox.click();
			}	
		}
		
		//Comment
		public void sendComments(String comments) { 
			this.comment.sendKeys(comments);
		}
		
		//Continue Button Shipping
		public void clickContinueButtonShipping() { 
			this.continueButtonShipping.click();
		}
		
		//T&C
		public void clickTermsAndCondition() { 
			this.termsAndConditions.click();
		}
		
		//Continue Button payment
		public void clickContinueButtonPayment() { 
			this.continueButtonPayment.click();
		}
		
		//Confirmorder Button
		public void clickConfirmOrderButton() { 
			this.confirmOrderButton.click();
		}
		
		//Order Processed Button
		public void verifyOrderProcessedText() { 
			String actual = this.orderProcessed.getText();
			String expected = "Your order has been successfully processed!";
			
		    assertEquals(actual, expected);
		}
		
		//dashboard Sales icon
		public void clickSalesIcon() { 
			this.dashboardSalesIcon.click();
		}
		
		//Dashboard Sales orders Link
		public void clickSalesOrdersLink() { 
			this.dashboardSalesOrders.click();
		}
		
		//View icon
		public void clickViewLink() { 
			this.view.click();
		}
		
		//Order Status
		public void selectOrderStatus() { 
			this.orderStatus.click();
			
			Select se = new Select(orderStatus);
			se.selectByVisibleText("Complete");
		}
		
		//Add History
		public void clickAddHistory() { 
			this.addHistoryButton.click();
		}
		
		//Edit Order 
		public void clickEditOrder() { 
			this.editOrder.click();
		}
		
		//Edit Order Continue Button 
		public void clickEditOrderContinueButton() { 
			this.editOrderContinueButton.click();
		}
		
		
		
		
		
		
		
}
