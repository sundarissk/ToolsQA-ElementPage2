package ElementPageTestCases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BrowserPackage.BrowserSetUp;
import ElementPage.ButtonPage;
import MainPagePackage.ElementPageElements;
import MainPagePackage.MainPage;

public class ButtonPageTC extends BrowserSetUp {

	MainPage mp;
	ElementPageElements epe;
	ButtonPage bp;

	@BeforeTest
	public void setUpPage() {

		SetUp();

		mp = new MainPage(driver);
		epe = new ElementPageElements(driver);
		bp = new ButtonPage(driver);
	}

	@Test(priority = 1)
	public void ButtonClickInAnyOrder() {

		mp.ElementPageClick();
		epe.ButtonTabClick();

		bp.clickMeButton();
		bp.rightClickButton();
		bp.doubleClickButton();

	}

	@AfterTest
	public void Closing() {
		CloseDown();
	}

}
