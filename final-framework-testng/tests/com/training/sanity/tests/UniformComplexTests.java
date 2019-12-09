package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.UniformCatalogPOM;
import com.training.pom.UniformChangePasswordPOM;
import com.training.pom.UniformEditAccountPOM;
import com.training.pom.UniformLoginPOM;
import com.training.pom.UniformOrderHistoryPOM;
import com.training.pom.UniformPremiumSchoolPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;
import com.trianing.waits.WaitTypes;

public class UniformComplexTests {

	private WebDriver driver;
	private String baseUrl;
	private UniformLoginPOM uniformLoginPOM;
	private UniformOrderHistoryPOM uniformOrderHistoryPOM;
	private UniformEditAccountPOM uniformEditAccountPOM;
	private UniformChangePasswordPOM uniformChangePasswordPOM;
	private UniformCatalogPOM uniformCatalogPOM;
	private UniformPremiumSchoolPOM uniformPremiumSchoolPOM;
	private static Properties properties;
	private ScreenShot screenShot;
	private WaitTypes waitTypes;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod 
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		
		uniformLoginPOM = new UniformLoginPOM(driver);
		uniformOrderHistoryPOM = new UniformOrderHistoryPOM(driver);
		uniformEditAccountPOM = new UniformEditAccountPOM(driver); 
	    uniformChangePasswordPOM = new UniformChangePasswordPOM(driver);
	    uniformCatalogPOM = new UniformCatalogPOM(driver);
	    uniformPremiumSchoolPOM = new UniformPremiumSchoolPOM(driver);
	    
		//baseUrl = properties.getProperty("baseURLAdmin");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		//driver.get(baseUrl);
	}

	
	@Test (priority=1)
	public void uniformUNF_073() throws InterruptedException {
		
		baseUrl = properties.getProperty("baseURLAdmin");
		driver.get(baseUrl);
        Thread.sleep(3000);
		
		uniformLoginPOM.sendUserName("admin");
		uniformLoginPOM.sendPasswordAdmin("admin@123");
		uniformLoginPOM.clickLoginButtonAdmin();
		
		uniformCatalogPOM.clickCatalogIcon();
		uniformCatalogPOM.clickCatalogProductsLink();
		uniformCatalogPOM.clickCatalogProductsAddNewlink();
		uniformCatalogPOM.sendProductName("Blazer");
		uniformCatalogPOM.sendMetaTagTitle("Blazer");
		uniformCatalogPOM.clickDataTablink();
		uniformCatalogPOM.sendDataTabModel("SCK-014");
		uniformCatalogPOM.sendDataTabPrice("200");
		uniformCatalogPOM.sendDataTabQuantity("20");
		uniformCatalogPOM.clickLinksTab();
		uniformCatalogPOM.clickLinksTabCategories();
		uniformCatalogPOM.clickLinksTabCategoriesBlazer();
		//uniformCatalogPOM.clickSaveButton();
		
		
		screenShot.captureScreenShot("UNF_073 ");
		
	}
	
	
	
	@Test (priority=2)
	public void uniformUNF_074() throws InterruptedException {
		baseUrl = properties.getProperty("baseURL");
		driver.get(baseUrl);
		
		Thread.sleep(3000);
		
		uniformPremiumSchoolPOM.clickUniformPremiumSchool();
		uniformPremiumSchoolPOM.clickRegularTShirtRust();
		uniformPremiumSchoolPOM.clickChestSizeDropDown();
		uniformPremiumSchoolPOM.selectChestSize32();
		uniformPremiumSchoolPOM.clickAddToCart();
		uniformPremiumSchoolPOM.clickCartIcon();
		uniformPremiumSchoolPOM.clickViewCartButton();
		uniformPremiumSchoolPOM.clickCheckoutButton();
		uniformPremiumSchoolPOM.clickGuestCheckoutRadioButton();
		uniformPremiumSchoolPOM.clickContinueButton();
		uniformPremiumSchoolPOM.sendFirstName("Vishwa1208");
		uniformPremiumSchoolPOM.sendLastName("Vishwa1208");
		uniformPremiumSchoolPOM.sendEmail("Vishwa1208@gmail.com");
		uniformPremiumSchoolPOM.sendTelephone("4041234567");
		uniformPremiumSchoolPOM.sendAddress1("3400 W Plano Pkwy");
		uniformPremiumSchoolPOM.sendCity("Plano");
		uniformPremiumSchoolPOM.sendPostCode("75075");
		uniformPremiumSchoolPOM.selectCountry("United States");
		uniformPremiumSchoolPOM.selectState("Texas");
		uniformPremiumSchoolPOM.clickGuestContinueButton();
		uniformPremiumSchoolPOM.verifyCheckBox();
		uniformPremiumSchoolPOM.sendComments("Testing");
		uniformPremiumSchoolPOM.clickContinueButtonShipping();
		Thread.sleep(2000);
		uniformPremiumSchoolPOM.clickTermsAndCondition();
		uniformPremiumSchoolPOM.clickContinueButtonPayment();
		uniformPremiumSchoolPOM.clickConfirmOrderButton();
		uniformPremiumSchoolPOM.verifyOrderProcessedText();
		
		screenShot.captureScreenShot("UNF_074 ");
		
	}
	
	@Test (priority=3)
	public void uniformUNF_074_Continue() throws InterruptedException {
		
		baseUrl = properties.getProperty("baseURLAdmin");
		driver.get(baseUrl);
        Thread.sleep(3000);
		
		uniformLoginPOM.sendUserName("admin");
		uniformLoginPOM.sendPasswordAdmin("admin@123");
		uniformLoginPOM.clickLoginButtonAdmin();
		
		uniformPremiumSchoolPOM.clickSalesIcon();
		uniformPremiumSchoolPOM.clickSalesOrdersLink();
		uniformPremiumSchoolPOM.clickViewLink();
		uniformPremiumSchoolPOM.selectOrderStatus();
		uniformPremiumSchoolPOM.clickAddHistory();
			
		
		screenShot.captureScreenShot("UNF_073 ");
		
	}
	
	
	@Test (priority=4)
	public void uniformUNF_075() throws InterruptedException {
		
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
		

		Thread.sleep(3000);
		
		uniformLoginPOM.clickuserIconArrow();
		uniformLoginPOM.clickLoginbtn();
		
		uniformLoginPOM.sendEmail("vaiduddi1120@in.ibm.com");
		uniformLoginPOM.sendPassword("Testing1234");
		
		uniformLoginPOM.clickLoginButton();
		
		uniformOrderHistoryPOM.clickorderHistoryLink();
		uniformOrderHistoryPOM.clickorderHistoryViewButton();
		
		uniformOrderHistoryPOM.clickOrderReturnIcon();
		uniformOrderHistoryPOM.clickReasonForReturnRadioButton();
		uniformOrderHistoryPOM.clickProductIsOpenedRadioButton();
		uniformOrderHistoryPOM.sendcomment("Faulty Test");
		uniformOrderHistoryPOM.clickTermsAndConditions();
		//uniformOrderHistoryPOM.clickSubmitButton();
		
		screenShot.captureScreenShot("UNF_075 ");
		
	}
	
	
	@Test (priority=5)
	public void uniformUNF_076() throws InterruptedException {
		
		baseUrl = properties.getProperty("baseURLAdmin");
		driver.get(baseUrl);
        Thread.sleep(3000);
		
		uniformLoginPOM.sendUserName("admin");
		uniformLoginPOM.sendPasswordAdmin("admin@123");
		uniformLoginPOM.clickLoginButtonAdmin();
		
		uniformPremiumSchoolPOM.clickSalesIcon();
		uniformPremiumSchoolPOM.clickSalesOrdersLink();
		
		uniformPremiumSchoolPOM.clickEditOrder();
		uniformPremiumSchoolPOM.clickEditOrderContinueButton();
			
		
		screenShot.captureScreenShot("UNF_073 ");
		
	}
	
	
	
	

	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
}
