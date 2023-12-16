package MainPagePackage;

import static UtilityPackage.ElementUtil.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
	WebDriver driver;

	// 1. Defining Page Element --> OR Object Repository
	static final By elements = By.xpath("//div[@class='card-body']//h5[contains(text(),'Elements')]");
	static final By cross = By.xpath("//div[@id='cbb']");

	// 2. Initializing Page Object
	public MainPage(WebDriver driver) {
		this.driver = driver;
	}

	// 3. Actions
	public ElementPageElements ElementPageClick() {
		try {
			Element_highlight(driver, elements);
			ScrollToView(driver, elements);
			ElementClick(driver, elements);
			
		} catch (Exception e) {
			System.out.println(e);
		}
		// ElementClick(driver, elements);

		return new ElementPageElements(driver);

	}

}
