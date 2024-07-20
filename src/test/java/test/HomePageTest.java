package test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pojo.Browser;
import pom.HomePage;

public class HomePageTest extends BaseTest {

	@BeforeTest
	public void openApplication() {
		driver = Browser.launchApplication();
	}

	@Test(priority = 1)
	public void checkIfUserIsAbleToClickOnFirstSubTypeOfDomain() {
		HomePage homePage = new HomePage(driver);
		homePage.clickOnMenu(0);
		homePage.clickOnFirstDomainMenu(0);
		SoftAssert softAssert=new SoftAssert();
		softAssert.assertTrue(driver.getTitle().contains("Domains"));
		homePage.clickOnLogo();
		softAssert.assertAll();

	}

	@Test(priority = 2)
	public void checkIfUserIsAbleToClickOnFirstSubTypeOfWebsitesAndHosting() {
		homePage = new HomePage(driver);
		homePage.clickOnMenu(1);
		homePage.clickOnWebsitesBuilder();
		Assert.assertTrue(driver.getTitle().contains("Website Builder"));
		homePage.clickOnLogo();

	}
	
	@Test(priority=3)
	public void checkIfUserIsAbleToClickOnFirstSubTypeOfSecuritySslCertificate()
	{
		
		homePage=new HomePage(driver);
		homePage.clickOnMenu(3);
		homePage.clickOnSslCertificate();
		SoftAssert softAssert=new SoftAssert();
		softAssert.assertTrue(driver.getTitle().contains("SSL Certificate"));
		homePage.clickOnLogo();
		softAssert.assertAll();
	}

	@Test (priority=4)
	public void checkIfUserIsAbleToClickOnFirstSubTypeOfMarketingDigitalMarketing()
	{
		homePage=new HomePage(driver);
		homePage.clickOnMenu(4);
		homePage.clickOnDigitalMarketing();
		Assert.assertTrue(driver.getTitle().contains("Digital Marketing"));
	}
	

}