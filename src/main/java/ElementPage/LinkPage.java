package ElementPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import UtilityPackage.ElementUtil;
import UtilityPackage.FunctionsUtil;

public class LinkPage {

	WebDriver driver;
	// 1. Defining Page Element --> OR Object Repository
	static final By homeL  = By.xpath("//a[@id = 'simpleLink']");
	static final By homeC = By.xpath("//a[@id = 'dynamicLink']");
	static final By createL = By.xpath("//a[@id = 'created']");
	static final By  noContent = By.xpath("//a[@id = 'no-content']");
	static final By moved = By.xpath("//a[@id = 'moved']");
	static final By  badRequest = By.xpath("//a[@id = 'bad-request']");
	static final By unauthorized = By.xpath("//a[@id = 'unauthorized']");
	static final By  forbitten = By.xpath("//a[@id = 'forbidden']");
	static final By notFound = By.xpath("//a[@id = 'invalid-url']");
	static final By messageCheck = By.xpath("//div[@id = 'linkWrapper']//p[10]");
	
	

	// 2. Initializing Page Object
	public LinkPage(WebDriver driver) {
		this.driver = driver;
	}

	// 3. Actions
	public void createdClick() {
		ElementUtil.ElementClick(driver, createL);
		String mess = FunctionsUtil.ToGetText(driver, messageCheck);
		System.out.println(mess);
	}
	

}
