package ElementPageTestCases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BrowserPackage.BrowserSetUp;
import ElementPage.WebTablePage;
import MainPagePackage.ElementPageElements;
import MainPagePackage.MainPage;

public class WebTableTC extends BrowserSetUp {

	MainPage mp;
	ElementPageElements epe;
	WebTablePage wtp;

	@BeforeTest
	public void SetUpPage() {

		SetUp();
		mp = new MainPage(driver);
		epe = new ElementPageElements(driver);
		wtp = new WebTablePage(driver);
	}

	@Test
	public void WebTableTestCases() {

		mp.ElementPageClick();
		epe.WebTableClick();
		wtp.SortingFnamecellData();
		wtp.AgeHighestRecords();
		wtp.FetchRecordsHighestage();

	}

	@AfterTest
	public void Closing() {
		CloseDown();
	}

}
