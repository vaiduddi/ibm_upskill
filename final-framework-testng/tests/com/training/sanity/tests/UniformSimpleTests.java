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
import com.training.pom.UniformChangePasswordPOM;
import com.training.pom.UniformEditAccountPOM;
import com.training.pom.UniformLoginPOM;
import com.training.pom.UniformOrderHistoryPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;
import com.trianing.waits.WaitTypes;

public class UniformSimpleTests {

	private WebDriver driver;
	private String baseUrl;
	private UniformLoginPOM uniformLoginPOM;
	private UniformOrderHistoryPOM uniformOrderHistoryPOM;
	private UniformEditAccountPOM uniformEditAccountPOM;
	private UniformChangePasswordPOM uniformChangePasswordPOM;
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
	    
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}

	
	@BeforeMethod
	public void uniformLoginTest() throws InterruptedException {
		
		Thread.sleep(3000);
		
		uniformLoginPOM.clickuserIconArrow();
		uniformLoginPOM.clickLoginbtn();
		
		uniformLoginPOM.sendEmail("vaiduddi1120@in.ibm.com");
		uniformLoginPOM.sendPassword("Testing1234");
		
		uniformLoginPOM.clickLoginButton();
					
	}

	@Test (priority=1)
	public void uniformOrderHistoryTest() throws InterruptedException {
		
		uniformOrderHistoryPOM.clickorderHistoryLink();
		Thread.sleep(3000);
		
		uniformOrderHistoryPOM.verifyorderHistoryOrderIdIsPresent();
		uniformOrderHistoryPOM.verifyorderHistoryCustomer();
		uniformOrderHistoryPOM.verifyorderHistoryNoOfProductsIsPresent();
		uniformOrderHistoryPOM.verifyorderHistoryStatusIsPresent();
		uniformOrderHistoryPOM.verifyorderHistoryTotalIsPresent();
		uniformOrderHistoryPOM.verifyorderHistoryDateAddedIsPresent();
		
		uniformOrderHistoryPOM.clickorderHistoryViewButton();
		
		uniformOrderHistoryPOM.verifyBlazerGirlsText();
		uniformOrderHistoryPOM.verifyRegularTShirtSize30();
		uniformOrderHistoryPOM.verifyRegularTShirtSize32();
		
		Thread.sleep(3000);
		
		screenShot.captureScreenShot("Uniform Order History ");
		
	}
	
	@Test (priority=2)
	public void uniformEditAccountTest() throws InterruptedException {
		
		uniformEditAccountPOM.clickEditAccountLink();
		
		Thread.sleep(3000);
		
		uniformEditAccountPOM.sendEditAccountFirstName("Neha");
		uniformEditAccountPOM.sendEditAccountLastName("B");
		uniformEditAccountPOM.sendEditAccountEmail("neha@gmail.com");
		uniformEditAccountPOM.sendEditAccountTelephone("9876543210");
		
		Thread.sleep(3000);
		
		//uniformEditAccountPOM.clickEditAccountContinueButton();
		
		screenShot.captureScreenShot("Uniform Edit Account ");
		
	}
	
	@Test (priority=3)
	public void uniformChangePasswordTest() throws InterruptedException {
		
		uniformChangePasswordPOM.clickChangeyourpasswordlink();
		uniformChangePasswordPOM.sendPassword("Testing1234");
		uniformChangePasswordPOM.sendPasswordConfirm("Testing1234");
		uniformChangePasswordPOM.clickContinueButton();
		
		screenShot.captureScreenShot("Change Password ");
		
	}

	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
}
