package com.training.sanity.tests;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.UniformAddRewardPOM;
import com.training.pom.UniformChangePasswordPOM;
import com.training.pom.UniformCustomerGroupPOM;
import com.training.pom.UniformCustomerPOM;
import com.training.pom.UniformDashboardPOM;
import com.training.pom.UniformEditAccountPOM;
import com.training.pom.UniformLoginPOM;
import com.training.pom.UniformOrderHistoryPOM;
import com.training.pom.UniformReportsPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;
import com.trianing.waits.WaitTypes;

public class Uniform_UNF_051_Tests {

	private WebDriver driver;
	private Actions action;
	private Select select;
	
	private String baseURLAdmin;
	private UniformLoginPOM uniformLoginPOM;
	private UniformCustomerGroupPOM uniformCustomerGroupPOM;
	private UniformCustomerPOM uniformCustomerPOM;
	private UniformAddRewardPOM uniformAddRewardPOM;
	private UniformReportsPOM uniformReportsPOM;
	private UniformDashboardPOM uniformDashboardPOM;
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
		uniformCustomerGroupPOM = new UniformCustomerGroupPOM(driver);
		uniformCustomerPOM = new UniformCustomerPOM(driver);
		uniformAddRewardPOM = new UniformAddRewardPOM(driver);
		uniformReportsPOM = new UniformReportsPOM(driver);
		uniformDashboardPOM = new UniformDashboardPOM(driver);
		
		baseURLAdmin = properties.getProperty("baseURLAdmin");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseURLAdmin);
	}

	@BeforeMethod
	public void uniformAdminLoginTest() throws InterruptedException {
		
		Thread.sleep(3000);
		
		uniformLoginPOM.sendUserName("admin");
		uniformLoginPOM.sendPasswordAdmin("admin@123");
		uniformLoginPOM.clickLoginButtonAdmin();
					
	}

	
	@Test (priority=1)
	public void uniformUNF051Test() throws InterruptedException {
		
		
		
		uniformCustomerGroupPOM.clickDashboardUserIcon();
		Thread.sleep(3000);
		uniformCustomerGroupPOM.clickDashboardCustomerGroup();
		
		uniformCustomerGroupPOM.clickAddNewButton();
		uniformCustomerGroupPOM.sendCustomerGroupName("Premium Member");
		uniformCustomerGroupPOM.sendDescription("Premium Member");
		uniformCustomerGroupPOM.clickYesRadioButton();
		uniformCustomerGroupPOM.clickSaveButton();
		
		
		uniformCustomerPOM.clickDashboardUserIcon();
		Thread.sleep(3000);
		uniformCustomerPOM.clickdashboardCustomer();
		uniformCustomerPOM.clickAddNewButton();
		
		uniformCustomerPOM.clickCustomerGroupdropdown();
		uniformCustomerPOM.clickcustomerPremiumMember("Premium Member");
		
		
		uniformCustomerPOM.sendCustomersFirstName("Vishwaab");
		uniformCustomerPOM.sendCustomersLastName("Aiduab");
		uniformCustomerPOM.sendEmail("vishwaaidu1202_2@gmail.com");
		uniformCustomerPOM.sendTelephone("9867738797");
		uniformCustomerPOM.sendPassword("Testing123");
		uniformCustomerPOM.sendConfirmPassword("Testing123");
		
		uniformCustomerPOM.clickAddAddress();
		
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(0,0)");
		Thread.sleep(2000);
		
		uniformCustomerPOM.sendCustomersFirstName1("Vishwaab");
		uniformCustomerPOM.sendCustomersLastName1("Aiduab");
		uniformCustomerPOM.sendAddress1("4th Block");
		uniformCustomerPOM.sendAddress2("Jayanagar");
		uniformCustomerPOM.sendCity("Bangalore");
		uniformCustomerPOM.sendPostcode("560014");
		
		uniformCustomerPOM.clickCountryDropdown();
		Thread.sleep(3000);
		uniformCustomerPOM.clickCountryIndia("India");
		
		uniformCustomerPOM.clickStateDropdown();
		uniformCustomerPOM.clickStateKarnataka("Karnataka");
		uniformCustomerPOM.clickSaveButton();
		uniformCustomerPOM.verifySuccessMessage();
		
		
		
		screenShot.captureScreenShot("UNF_051 ");
		
	}
	
	
	
	@Test (priority=2)
	public void uniformUNF052Test() throws InterruptedException {
	
		
		uniformCustomerPOM.clickDashboardUserIcon();
		Thread.sleep(3000);
		uniformCustomerPOM.clickdashboardCustomer();
		
		uniformAddRewardPOM.sendCustomerName("Vish Aidu");
		uniformAddRewardPOM.clickFilterButton();
		
		uniformAddRewardPOM.clickEditButton();
		
		uniformAddRewardPOM.sendFirstName("Visha Aidua");
		uniformAddRewardPOM.clickAddress1();
		uniformAddRewardPOM.sendPostCode("75064");
		
		uniformAddRewardPOM.clickRewardPoints();
		uniformAddRewardPOM.sendRewardDescription("Festival bonanza");
		uniformAddRewardPOM.sendRewardPoints("30");
		uniformAddRewardPOM.clickAddRewardPointsButton();
		//uniformAddRewardPOM.clickSaveButton();
		  
		
		
		uniformReportsPOM.clickDashboardReportsLink();
		Thread.sleep(1000);
		uniformReportsPOM.verifyDashboardReportsSalesLink();
		uniformReportsPOM.verifyDashboardReportsProductsLink();
		uniformReportsPOM.verifyDashboardReportsCustomersLink();
		uniformReportsPOM.verifyDashboardReportsMarketingLink();
		Thread.sleep(2000);
		uniformReportsPOM.clickDashboardReportsCustomersLink();
		uniformReportsPOM.verifyDashboardReportsCustomersCustomersOnlinelink();
		uniformReportsPOM.verifyDashboardReportsCustomersCustomersActivitylink();
		uniformReportsPOM.verifyDashboardReportsCustomersOrderslink();
		uniformReportsPOM.verifyDashboardReportsCustomersRewardPointslink();
		uniformReportsPOM.verifyDashboardReportsCustomersCreditslink();
		Thread.sleep(2000);
		uniformReportsPOM.clickDashboardReportsCustomersRewardPointslink();
		Thread.sleep(1000);
		uniformReportsPOM.verifyCustomersName();
		uniformReportsPOM.verifyCustomersRewardPoints();
		
		screenShot.captureScreenShot("UNF_052 ");
		
	}
	
	
	@Test (priority=3)
	public void uniformUNF053Test() throws InterruptedException {

		uniformDashboardPOM.clickViewButton();
		uniformDashboardPOM.clickInvoiceGenerateButton();
		uniformDashboardPOM.selectOrderStatusDropDown();
		uniformDashboardPOM.clickaddHistory();
		
		screenShot.captureScreenShot("UNF_053 ");
		
	}
	
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
}
