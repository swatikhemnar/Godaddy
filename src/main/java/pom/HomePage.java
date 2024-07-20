package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
    @FindBy(xpath="//a[@data-cy='nav-logo']") private WebElement logo;
	@FindBy(xpath="//li[@class='inverted pl-f11zqfa5']") private List<WebElement> menu;
	@FindBy(xpath="//a[@data-cy='optional-panel-list-anchor']") private List<WebElement> domainMenu;
	@FindBy(xpath="//a[@data-track-name='wh_website_builder2']") private WebElement websiteBuilder;
	@FindBy(xpath="//a[@data-track-name='in_ssl_certificates2']")private WebElement sslCertificate;
	@FindBy(xpath="//a[@data-track-name='email_digital_marketing_suite2']") private WebElement digitalMarketing;
	
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickOnMenu(int index)
	{
		menu.get(index).click();
	}
	
	public void clickOnFirstDomainMenu(int index)
	{
		domainMenu.get(index).click();
		
	}
	
	public void clickOnSslCertificate()
	{
		sslCertificate.click();
	}
	
	public void clickOnDigitalMarketing()
	{
		digitalMarketing.click();
	}
	public void clickOnLogo()
	{
		logo.click();
	}


	public void clickOnWebsitesBuilder() {
		websiteBuilder.click();

	}
	
	
}
