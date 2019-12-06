package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class UniformCatalogPOM {
	private WebDriver driver; 
	
	public UniformCatalogPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	    //Catalog Icon
		@FindBy(xpath="//li[@id='catalog']/a[1]")
		private WebElement catalogIcon; 
		
		//Catalog Products Link
		@FindBy(xpath="//li[@id='catalog']//ul//li//a[contains(text(),'Products')]")
		private WebElement catalogProductsLink; 
		
		//Catalog Products Add New Link
		@FindBy(xpath="//a[contains(@data-original-title,'Add New')]")
		private WebElement catalogProductsAddNew;
		
		//Catalog Products Product Name
		@FindBy(xpath="//input[@id='input-name1']")
		private WebElement productName;
		
		//Catalog Products Meta Tag Title
		@FindBy(xpath="//input[@id='input-meta-title1']")
		private WebElement metaTagTitle;
		
		// Data tab Link 
		@FindBy(xpath="//a[contains(text(),'Data')]")
		private WebElement dataTablink;
		
		// Data tab Model
		@FindBy(xpath="//input[@id='input-model']")
		private WebElement dataTabModel;
		
		// Data tab Price
		@FindBy(xpath="//input[@id='input-price']")
		private WebElement dataTabPrice;
		
		// Data tab Quantity
		@FindBy(xpath="//input[@id='input-quantity']")
		private WebElement dataTabQuantity;
		
		// Links Tab 
		@FindBy(xpath="//a[contains(text(),'Links')]")
		private WebElement linksTab;
		
		// Links Categories 
		@FindBy(xpath="//input[@id='input-category']")
		private WebElement linksTabCategories;
		
		// Links Categories Blazer
		@FindBy(xpath="//div[@id='tab-links']//li[1]//a[1]")
		private WebElement linksTabCategoriesBlazer;
		
		// Save button
		@FindBy(xpath="//button[@data-original-title='Save']")
		private WebElement saveButton;
	

		//=============================================================================

		
		//Catalog Icon
		public void clickCatalogIcon() { 
			this.catalogIcon.click();
		}
		
		//Catalog Products Link
		public void clickCatalogProductsLink() { 
			this.catalogProductsLink.click();
		}
		
		//Catalog Products Add New Link
		public void clickCatalogProductsAddNewlink() { 
			this.catalogProductsAddNew.click();
		}
		
		//Catalog Products Product Name
		public void sendProductName(String productname) {
			this.productName.clear();
			this.productName.sendKeys(productname);
		}
		
		//Catalog Products Meta Tag Title
		public void sendMetaTagTitle(String metatagtitle) { 
			this.metaTagTitle.clear();
			this.metaTagTitle.sendKeys(metatagtitle);
		}
		
		//Data tab Link
		public void clickDataTablink() { 
			this.dataTablink.click();
		}
		
		// Data tab Model
		public void sendDataTabModel(String model) { 
			this.dataTabModel.clear();
			this.dataTabModel.sendKeys(model);
		}
		
		// Data tab Price
		public void sendDataTabPrice(String price) { 
			this.dataTabPrice.clear();
			this.dataTabPrice.sendKeys(price);
		}
		
		// Data tab Quantity
		public void sendDataTabQuantity(String quantity) { 
			this.dataTabQuantity.clear();
			this.dataTabQuantity.sendKeys(quantity);
		}
		
		//Links tab
		public void clickLinksTab() { 
			this.linksTab.click();
		}
		
		//Links Categories 
		public void clickLinksTabCategories() { 
			this.linksTabCategories.click();
		}
		
		//Links Categories Blazer 
		public void clickLinksTabCategoriesBlazer() { 
			this.linksTabCategoriesBlazer.click();
		}
		
		// Save button
		public void clickSaveButton() {
			this.saveButton.click();
		}
		
}
