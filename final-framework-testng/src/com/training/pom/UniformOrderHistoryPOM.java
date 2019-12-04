package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UniformOrderHistoryPOM {
	private WebDriver driver; 
	
	public UniformOrderHistoryPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	//Order History Link
	@FindBy(xpath="//a[@class='list-group-item'][contains(text(),'Order History')]")
	private WebElement orderHistoryLink;
	
	//Order History Order ID
	@FindBy(xpath="//tbody//tr//td[1]")
	private WebElement verifyorderHistoryOrderIdIsPresent;
		
	//Order History Customer
	@FindBy(xpath="//tbody//tr//td[2]")
	private WebElement verifyorderHistoryCustomerIsPresent;
	
	//Order History No. of Products
	@FindBy(xpath="//tbody//tr//td[3]")
	private WebElement verifyorderHistoryNoOfProductsIsPresent;
	
	//Order History status
	@FindBy(xpath="//tbody//tr//td[4]")
	private WebElement verifyorderHistoryStatusIsPresent;
	
	//Order History Total
	@FindBy(xpath="//tbody//tr//td[5]")
	private WebElement verifyorderHistoryTotalIsPresent;
	
	//Order History Date Added
	@FindBy(xpath="//tbody//tr//td[6]")
	private WebElement verifyorderHistoryDateAddedIsPresent;
	
	//Order History View Button
	@FindBy(xpath="//a[@class='btn btn-info']")
	private WebElement 	orderHistoryViewButton;
	
	//Order History Blazer Girls(7-8) Text
	@FindBy(xpath="//td[contains(text(),'Blazer Girls(7-8)')]")
	private WebElement 	verifyBlazerGirlsText;
	
	//Order History REGULAR T-SHIRTS (Rust) Size 30
	@FindBy(xpath="//div[@class='table-responsive']//tbody//tr[2]//td[1]")
	private WebElement verifyRegularTShirtSize30;
	
	//Order History REGULAR T-SHIRTS (Rust) Size 32
	@FindBy(xpath="//tbody//tr[3]//td[1]")
	private WebElement verifyRegularTShirtSize32;
	
	
	//=======================================================================================
	
	//Order History Link
	public void clickorderHistoryLink() { 
		this.orderHistoryLink.click();
	}
	
	//Order History Order ID
	public void verifyorderHistoryOrderIdIsPresent() { 
		this.verifyorderHistoryOrderIdIsPresent.isDisplayed();
		this.verifyorderHistoryOrderIdIsPresent.equals("#185");
	}
	
	//Order History Customer
	public void verifyorderHistoryCustomer() { 
		this.verifyorderHistoryCustomerIsPresent.isDisplayed();
		this.verifyorderHistoryCustomerIsPresent.equals("Vish aidu");
	}
	
	//Order History No. of Products
	public void verifyorderHistoryNoOfProductsIsPresent() { 
		this.verifyorderHistoryNoOfProductsIsPresent.isDisplayed();
		this.verifyorderHistoryNoOfProductsIsPresent.equals("3");
	}

	//Order History Status
	public void verifyorderHistoryStatusIsPresent() { 
		this.verifyorderHistoryStatusIsPresent.isDisplayed();
		this.verifyorderHistoryStatusIsPresent.equals("Pending");
	}
	
	//Order History Total
	public void verifyorderHistoryTotalIsPresent() { 
		this.verifyorderHistoryTotalIsPresent.isDisplayed();
		this.verifyorderHistoryTotalIsPresent.equals("525");
	}
	
	//Order History Date Added 
	public void verifyorderHistoryDateAddedIsPresent() { 
		this.verifyorderHistoryDateAddedIsPresent.isDisplayed();
		this.verifyorderHistoryDateAddedIsPresent.equals("22/11/2019");
	}
	
	
	//Order History View Button 
		public void clickorderHistoryViewButton() {  
			this.orderHistoryViewButton.click();
		}
	
		//Order History Blazer Girls(7-8) Text
		public void verifyBlazerGirlsText() { 
			this.verifyBlazerGirlsText.isDisplayed();
			this.verifyBlazerGirlsText.equals("Blazer Girls(7-8)");
		}
		
		//Order History REGULAR T-SHIRTS (Rust) Size 30
		public void verifyRegularTShirtSize30() {
			this.verifyRegularTShirtSize30.isDisplayed();
			this.verifyRegularTShirtSize30.equals("REGULAR T-SHIRTS (Rust)                                ");
			this.verifyRegularTShirtSize30.equals(" - Chest Size: 30");
		}
	
		//Order History REGULAR T-SHIRTS (Rust) Size 32
		public void verifyRegularTShirtSize32() { 
			this.verifyRegularTShirtSize32.isDisplayed();
			this.verifyRegularTShirtSize32.equals("REGULAR T-SHIRTS (Rust)                                ");
			this.verifyRegularTShirtSize32.equals(" - Chest Size: 32");
		}
	
	
	
}
