package ElementPage;

import static UtilityPackage.ElementUtil.LocatorToElement;
import static UtilityPackage.FunctionsUtil.ToGetText;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ButtonPage {
	WebDriver driver;
	// 1. Defining Page Element --> OR Object Repository
	static final By doubleClickMe = By.xpath("//button[@id = 'doubleClickBtn']");
	static final By rightClickMe = By.xpath("//div[@class='mt-4']//button[@id ='rightClickBtn']");
	static final By clickMe = By.xpath("//div[@class='mt-4'][2]//button[@class='btn btn-primary']");

	static final By clickMes1 = By.xpath("//div[@class='col-12 mt-4 col-md-6']//p[1]");
	static final By clickMes2 = By.xpath("//div[@class='col-12 mt-4 col-md-6']//p[2]");
	static final By clickMes3 = By.xpath("//div[@class='col-12 mt-4 col-md-6']//p[3]");

	// 2. Initializing Page Object
	public ButtonPage(WebDriver driver) {
		this.driver = driver;
	}

	// 3. Actions

	public void doubleClickButton() {

		Actions action = new Actions(driver);
		WebElement dclick = LocatorToElement(driver, doubleClickMe);
		action.doubleClick(dclick).perform();

		String expDClick = "You have done a double click";
		String dclickm = ToGetText(driver, clickMes1);

		boolean status = false;
		if (dclickm.equals(expDClick)) {
			System.out.println(expDClick);
			System.out.println("Doubleclick done : Received Expected Message");
			System.out.println("**************************************************");
			status = true;
			assertTrue(status, "DoubleClickMe Message: Failed");

		} else if (!dclickm.equals(expDClick)) {
			String dclickm2 = ToGetText(driver, clickMes1);
			if (dclickm2.equals(expDClick)) {
				System.out.println(expDClick);
				System.out.println("Doubleclick done : Received Expected Message");
				System.out.println("**************************************************");
				status = true;
				assertTrue(status, "DoubleClickMe Message: Failed");
			}
		}

	}

	public void rightClickButton() {

		Actions action = new Actions(driver);
		WebElement rclick = LocatorToElement(driver, rightClickMe);
		action.contextClick(rclick).perform();

		String exprclick = "You have done a right click";
		String rclickm = ToGetText(driver, clickMes1);

		boolean status = false;
		if (rclickm.equals(exprclick)) {
			System.out.println(exprclick);
			System.out.println("Rightclick done : Received Expected Message");
			System.out.println("**********************************************");
			status = true;
			assertTrue(status, "RightClickMe Message: Failed");
		}

		else if (!rclickm.equals(exprclick)) {
			String rclickm2 = ToGetText(driver, clickMes2);
			if (rclickm2.equals(exprclick)) {
				System.out.println(exprclick);
				System.out.println("Rightclick done : Received Expected Message");
				System.out.println("**********************************************");
				status = true;
				assertTrue(status, "RightClickMe Message: Failed");
			}
		}

	}

	public void clickMeButton() {

		Actions action = new Actions(driver);
		WebElement cele = LocatorToElement(driver, clickMe);
		action.click(cele).perform();

		String expcMe = "You have done a dynamic click";
		String cMeM = ToGetText(driver, clickMes1);
		

		boolean status = false;
		if (cMeM.equals(expcMe)) {
			System.out.println(cMeM);
			System.out.println("Clickdone : Received Expected Message");
			System.out.println("**********************************************");
			status = true;
			assertTrue(status, "ClickMe Message: Failed");
		} else if (!cMeM.equals(expcMe)) {

			String cMeM2 = ToGetText(driver, clickMes2);

			if (cMeM2.equals(expcMe)) {
				System.out.println(cMeM2);
				System.out.println("clickdone : Received Expected Message");
				System.out.println("**********************************************");
				status = true;
				assertTrue(status, "ClickMe Message: Failed");
			}

			else if ((!cMeM.equals(expcMe)) && (!cMeM2.equals(expcMe))) {

				String cMeM3 = ToGetText(driver, clickMes3);

				if (cMeM3.equals(expcMe)) {

					System.out.println(cMeM3);
					System.out.println("clickdone : Received Expected Message");
					System.out.println("**********************************************");

					status = true;
					assertTrue(status, "ClickMe Message: Failed");
				}
			}

		}
	}

}
