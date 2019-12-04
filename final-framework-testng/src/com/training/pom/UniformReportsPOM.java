package com.training.pom;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UniformReportsPOM {
	private WebDriver driver; 
	private Actions action;
	
	public UniformReportsPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	    //Dashboard Reports Link
		@FindBy(xpath="//li[@id='reports']")
		private WebElement dashboardReportslink; 
		
	    //Dashboard Reports Sales
		@FindBy(xpath="//li[@id='reports']/ul/li[1]//a")
		private WebElement dashboardReportsSaleslink;
		
	    //Dashboard Reports Products
		@FindBy(xpath="//a[@class='parent'][contains(text(),'Products')]")
		private WebElement dashboardReportsProductslink;
		
	    //Dashboard Reports Customers
		@FindBy(xpath="//a[@class='parent'][contains(text(),'Customers')]")
		private WebElement dashboardReportsCustomerslink;
		
	    //Dashboard Reports Marketing
		@FindBy(xpath="//a[@class='parent'][contains(text(),'Marketing')]")
		private WebElement dashboardReportsMarketinglink;
		
	    //Dashboard Reports Customers Customers Online link
		@FindBy(xpath="//ul[@class='collapse in']//a[contains(text(),'Customers Online')]")
		private WebElement dashboardReportsCustomersCustomersOnlinelink;
		
	    //Dashboard Reports Customers Customers Activity link
		@FindBy(xpath="//a[contains(text(),'Customer Activity')]")
		private WebElement dashboardReportsCustomersCustomersActivitylink;
		
	    //Dashboard Reports Customers Orders link
		@FindBy(xpath="//ul[@class='collapse in']//a[contains(text(),'Orders')]")
		private WebElement dashboardReportsCustomersOrderslink;
		
	    //Dashboard Reports Customers Reward Points link
		@FindBy(xpath="//ul[@class='collapse in']//a[contains(text(),'Reward Points')]")
		private WebElement dashboardReportsCustomersRewardPointslink;
		
	    //Dashboard Reports Customers Credits link
		@FindBy(xpath="//a[contains(text(),'Credit')]")
		private WebElement dashboardReportsCustomersCreditlink;
		
	    //Rewards Customer Name
		@FindBy(xpath="//table[@class='table table-bordered']//tbody//tr[3]//td[1]")
		private WebElement customerName;
		
	    //Rewards Customer Reward Points
		@FindBy(xpath="//table[@class='table table-bordered']//tbody//tr[3]//td[5]")
		private WebElement customerRewardPoints;
		
		
		//===================================================================================
	
	
		//Dashboard Reports Link
		public void clickDashboardReportsLink() {
			this.dashboardReportslink.click();
		}
		
		//Dashboard Reports Sales
		public void verifyDashboardReportsSalesLink() {
			this.dashboardReportsSaleslink.isDisplayed();
			String actual = dashboardReportsSaleslink.getText();
			String expected = "Sales";
			assertEquals(actual, expected);
			System.out.println("Sales Link is Present");
			
		}
		
		//Dashboard Reports Products
		public void verifyDashboardReportsProductsLink() {
			this.dashboardReportsProductslink.isDisplayed();
			String actual = dashboardReportsProductslink.getText();
			String expected = "Products";
			assertEquals(actual, expected);
			System.out.println("Products Link is Present");
			
		}
		
		//Dashboard Reports Customers
		public void verifyDashboardReportsCustomersLink() {
			this.dashboardReportsCustomerslink.isDisplayed();
			String actual = dashboardReportsCustomerslink.getText();
			String expected = "Customers";
			assertEquals(actual, expected);
			System.out.println("Customers Link is Present");
			
		}
		
		//Dashboard Reports Customers
		public void clickDashboardReportsCustomersLink() {
			this.dashboardReportsCustomerslink.click();
		}
		
		//Dashboard Reports Marketing
		public void verifyDashboardReportsMarketingLink() {
			this.dashboardReportsMarketinglink.isDisplayed();
			String actual = dashboardReportsMarketinglink.getText();
			String expected = "Marketing";
			assertEquals(actual, expected);
			System.out.println("Marketing Link is Present");
			
		}
		
	    //Dashboard Reports Customers Customers Online link
		public void verifyDashboardReportsCustomersCustomersOnlinelink() {
			this.dashboardReportsCustomersCustomersOnlinelink.isDisplayed();
			String actual = dashboardReportsCustomersCustomersOnlinelink.getText();
			String expected = "Customers Online";
			assertEquals(actual, expected);
			System.out.println("Customers Online Link is Present");
			
		}
		
	    //Dashboard Reports Customers Customers Activity link
		public void verifyDashboardReportsCustomersCustomersActivitylink() {
			this.dashboardReportsCustomersCustomersActivitylink.isDisplayed();
			String actual = dashboardReportsCustomersCustomersActivitylink.getText();
			String expected = "Customer Activity";
			assertEquals(actual, expected);
			System.out.println("Customer Activity Link is Present");
			
		}
		
	    //Dashboard Reports Customers Orders link
		public void verifyDashboardReportsCustomersOrderslink() {
			this.dashboardReportsCustomersOrderslink.isDisplayed();
			String actual = dashboardReportsCustomersOrderslink.getText();
			String expected = "Orders";
			assertEquals(actual, expected);
			System.out.println("Orders Link is Present");
			
		}
		
	    //Dashboard Reports Customers Reward Points link
		public void verifyDashboardReportsCustomersRewardPointslink() {
			this.dashboardReportsCustomersRewardPointslink.isDisplayed();
			String actual = dashboardReportsCustomersRewardPointslink.getText();
			String expected = "Reward Points";
			assertEquals(actual, expected);
			System.out.println("Reward Points Link is Present");
			
		}
		
	    //Dashboard Reports Customers Reward Points link
		public void clickDashboardReportsCustomersRewardPointslink() {
			this.dashboardReportsCustomersRewardPointslink.click();
		}
		
	    //Dashboard Reports Customers Credits link
		public void verifyDashboardReportsCustomersCreditslink() {
			this.dashboardReportsCustomersCreditlink.isDisplayed();
			String actual = dashboardReportsCustomersCreditlink.getText();
			String expected = "Credit";
			assertEquals(actual, expected);
			System.out.println("Credit Link is Present");
			
		}
		
	    //Rewards Customer Name
		public void verifyCustomersName() {
			this.customerName.isDisplayed();
			String actual = customerName.getText();
			String expected = "Vish aidu";
			assertEquals(actual, expected);
			System.out.println("Vish aidu Text is Present");
			
		}
		
	    //Rewards Customer Reward Points
		public void verifyCustomersRewardPoints() {
			this.customerRewardPoints.isDisplayed();
			String actual = customerRewardPoints.getText();
			String expected = "240";
			assertEquals(actual, expected);
			System.out.println("240 Points is Present");
			
		}
		
		
}
