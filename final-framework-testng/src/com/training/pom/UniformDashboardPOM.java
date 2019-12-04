package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class UniformDashboardPOM {
	private WebDriver driver; 
	
	public UniformDashboardPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	    //Dashboard View button
		@FindBy(xpath="//tr[1]//td[6]//a[1]")
		private WebElement viewButton; 
		
	    //Orders Invoice Generate Button
		@FindBy(xpath="//tr[1]//td[3]//button[1]")
		private WebElement invoiceGenerateButton;
		
		//Order Status 
		@FindBy(xpath="//select[@id='input-order-status']")
		private WebElement orderStatusDropDown;
		
		//Add History button
		@FindBy(xpath="//button[@id='button-history']")
		private WebElement addHistory;

		//=============================================================================

		
		//Dashboard View button
		public void clickViewButton() { 
			this.viewButton.click();
		}
		
		//Orders Invoice Generate Button
		public void clickInvoiceGenerateButton() { 
			this.invoiceGenerateButton.click();
		}
		
		//Order Status
		public void selectOrderStatusDropDown() { 
			this.invoiceGenerateButton.click();
			Select select=new Select(orderStatusDropDown);
			select.selectByVisibleText("Complete");
		}
		
		//Add History button
		public void clickaddHistory() { 
			this.addHistory.click();
		}
		
		
}
