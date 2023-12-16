package MainPagePackage;

import static UtilityPackage.ElementUtil.ElementClick;
import static UtilityPackage.ElementUtil.Element_highlight;

import static UtilityPackage.ElementUtil.ScrollToView;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import ElementPage.WebTablePage;


public class ElementPageElements {

	WebDriver driver;

	// 1. Defining Page Element --> OR Object Repository
	static final By webtable = By.xpath("//span[text()='Web Tables']");
	static final By button = By.xpath("//span[text()='Buttons']");
	static final By links = By.xpath("//span[text()='Links']");
	static final By brokenlinks = By.xpath("//span[text()='Broken Links - Images']");
	static final By updownload = By.xpath("//span[text()='Upload and Download']");
	static final By dynamicprop = By.xpath("//span[text()='Dynamic Properties']");

	// 2. Initializing Page Object
	public ElementPageElements(WebDriver driver) {
		this.driver = driver;

	}

	// 3. Actions
	public WebTablePage WebTableClick() {

		try {
			Element_highlight(driver, webtable);
			ScrollToView(driver, webtable); //Actions is not working in Toolsqa so used javaScript
			

			ElementClick(driver, webtable);
		} catch (Exception e) {
			System.out.println(e);
		}

		return new WebTablePage(driver);
	}
}
