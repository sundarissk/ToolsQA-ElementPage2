package ElementPageTestCases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BrowserPackage.BrowserSetUp;
import ElementPage.LinkPage;
import MainPagePackage.ElementPageElements;
import MainPagePackage.MainPage;

public class LinkPageTC extends BrowserSetUp {
	MainPage mp;
	ElementPageElements epe;
	LinkPage lp;

	@BeforeTest
	public void setUpPage() {
		SetUp();
		mp = new MainPage(driver);
		epe = new ElementPageElements(driver);
		lp = new LinkPage(driver);

	}

	@Test
	public void LinkPageTestCases() {

		mp.ElementPageClick();
		epe.LinkPageClick();
		lp.createdClick();

	}

	@AfterTest
	public void Closing() {
		CloseDown();
	}
}