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
/*
	@BeforeMethod
	public void uniformLoginTest() throws InterruptedException {
		
		Thread.sleep(3000);
		
		uniformLoginPOM.sendUserName("admin");
		uniformLoginPOM.sendPasswordAdmin("admin@123");
		uniformLoginPOM.clickLoginButtonAdmin();
					
	}
*/
	/*
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
	*/
	
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
		uniformPremiumSchoolPOM.sendFirstName("Vishwa1205");
		uniformPremiumSchoolPOM.sendLastName("Vishwa1205");
		uniformPremiumSchoolPOM.sendEmail("Vishwa1205@gmail.com");
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
		uniformPremiumSchoolPOM.clickTermsAndCondition();
		uniformPremiumSchoolPOM.clickContinueButtonPayment();
		//uniformPremiumSchoolPOM.clickConfirmOrderButton();
		
		screenShot.captureScreenShot("UNF_074 ");
		
	}

	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
}
