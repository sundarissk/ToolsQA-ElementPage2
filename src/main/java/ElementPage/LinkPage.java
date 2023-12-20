package ElementPage;

import static UtilityPackage.ElementUtil.ElementClick;
import static UtilityPackage.ElementUtil.Element_highlight;
import static UtilityPackage.ElementUtil.ScrollToView;
import static UtilityPackage.FunctionsUtil.ToGetText;
import static UtilityPackage.WaitsUtil.explicitWait;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LinkPage {

	WebDriver driver;
	// 1. Defining Page Element --> OR Object Repository
	static final By homeL = By.xpath("//a[@id = 'simpleLink']");
	static final By homeC = By.xpath("//a[@id = 'dynamicLink']");
	static final By createL = By.xpath("//a[@id = 'created']");
	static final By noContent = By.xpath("//a[@id = 'no-content']");
	static final By moved = By.xpath("//a[@id = 'moved']");
	static final By badRequest = By.xpath("//a[@id = 'bad-request']");
	static final By unauthorized = By.xpath("//a[@id = 'unauthorized']");
	static final By forbitten = By.xpath("//a[@id = 'forbidden']");
	static final By notFound = By.xpath("//a[@id = 'invalid-url']");
	static final By messageCheck = By.xpath("//div[@id = 'linkWrapper']//p[10]");
	static final By messageCode = By.xpath("//div[@id = 'linkWrapper']//p[10]//b[1]");
	static final By messageStatus = By.xpath("//div[@id = 'linkWrapper']//p[10]//b[2]");

	// 2. Initializing Page Object
	public LinkPage(WebDriver driver) {
		this.driver = driver;
	}

	// 3. Actions
	public void createdClick() {

		try {
			Element_highlight(driver, createL);
			ScrollToView(driver, createL);
			ElementClick(driver, createL);

			// explicitWait(driver, 20, messageCheck);
			Thread.sleep(1000);

			String statusM = "Created";
			String createdMess = "Link has responded with staus 201 and status text Created";

			String mess = ToGetText(driver, messageCheck);
			String mCode = ToGetText(driver, messageCode);
			String mStatus = ToGetText(driver, messageStatus);

			int codeM = Integer.parseInt(mCode);
			boolean code = false;
			if ((codeM == 201) && (mStatus.equals(statusM)) && (mess.equals(createdMess))) {
				System.out.println(codeM);
				System.out.println(mStatus);
				System.out.println(mess);
				code = true;
			}
			assertTrue(code, "Created-Click Failed");
			System.out.println("*******************************************************");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public void noContentClick() {

		try {
			Element_highlight(driver, noContent);
			ScrollToView(driver, noContent);
			ElementClick(driver, noContent);

			// explicitWait(driver, 30, messageCheck);
			Thread.sleep(1000);

			String noCMess = "Link has responded with staus 204 and status text No Content";
			String statusnc = "No Content";

			String noContMess = ToGetText(driver, messageCheck);
			String nccode = ToGetText(driver, messageCode);
			String ncstatus = ToGetText(driver, messageStatus);

			int codenc = Integer.parseInt(nccode);
			boolean code = false;
			if ((codenc == 204) && (ncstatus.equals(statusnc)) && (noContMess.equals(noCMess))) {

				System.out.println(codenc);
				System.out.println(ncstatus);
				System.out.println(noCMess);
				code = true;
			}
			assertTrue(code, "NoContent-Click Failed");
			System.out.println("*******************************************************");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public void movedClick() {
		try {
			Element_highlight(driver, moved);
			ScrollToView(driver, moved);
			ElementClick(driver, moved);

			// explicitWait(driver, 20, messageCheck);
			Thread.sleep(1000);

			String mMess = "Link has responded with staus 301 and status text Moved Permanently";
			String mStatus = "Moved Permanently";

			String mMoved = ToGetText(driver, messageCheck);
			String cMoved = ToGetText(driver, messageCode);
			String sMoved = ToGetText(driver, messageStatus);

			int movedC = Integer.parseInt(cMoved);
			boolean status = false;
			if ((mMoved.equals(mMess)) && (movedC == 301) && (sMoved.equals(mStatus))) {

				System.out.println(cMoved);
				System.out.println(sMoved);
				System.out.println(mMoved);
				status = true;
			}
			assertTrue(status, "Moved-Click: Failed");
			System.out.println("*******************************************************");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public void badRequestClick() {

		try {
			Element_highlight(driver, badRequest);
			ScrollToView(driver, badRequest);
			ElementClick(driver, badRequest);

			// explicitWait(driver, 20, messageCheck);
			Thread.sleep(1000);

			String badReqM = "Link has responded with staus 400 and status text Bad Request";
			String Statusm = "Bad Request";

			String mBadReq = ToGetText(driver, messageCheck);
			String cBadReq = ToGetText(driver, messageCode);
			String sBadReq = ToGetText(driver, messageStatus);

			int badReqC = Integer.parseInt(cBadReq);
			boolean status = false;
			if ((mBadReq.equals(badReqM)) && (badReqC == 400) && (sBadReq.equals(Statusm))) {

				System.out.println(badReqC);
				System.out.println(sBadReq);
				System.out.println(mBadReq);
				status = true;
			}
			assertTrue(status, "BadRequest -Click: Failed");
			System.out.println("*******************************************************");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public void unAuthorizedclick() {
		try {
			Element_highlight(driver, unauthorized);
			ScrollToView(driver, unauthorized);
			ElementClick(driver, unauthorized);

			// explicitWait(driver, 20, messageCheck);
			Thread.sleep(1000);

			String unAuthorM = "Link has responded with staus 401 and status text Unauthorized";
			String unAuthorS = "Unauthorized";

			String mUnAuthor = ToGetText(driver, messageCheck);
			String cUnAuthor = ToGetText(driver, messageCode);
			String sUnAuthor = ToGetText(driver, messageStatus);

			int unAuthrC = Integer.parseInt(cUnAuthor);
			boolean status = false;

			if ((mUnAuthor.equals(unAuthorM)) && (unAuthrC == 401) && (sUnAuthor.equals(unAuthorS))) {
				System.out.println(unAuthrC);
				System.out.println(sUnAuthor);
				System.out.println(mUnAuthor);
				status = true;

			}
			assertTrue(status, "UnAuthorized - Click: Failed");
			System.out.println("*******************************************************");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public void forBiddenClick() {
		try {
			Element_highlight(driver, forbitten);
			ScrollToView(driver, forbitten);
			ElementClick(driver, forbitten);

			// explicitWait(driver, 20, messageCheck);
			Thread.sleep(1000);

			String forbiddenM = "Link has responded with staus 403 and status text Forbidden";
			String forbiddenS = "Forbidden";

			String mForbidden = ToGetText(driver, messageCheck);
			String cForbidden = ToGetText(driver, messageCode);
			String sForbidden = ToGetText(driver, messageStatus);

			int forbiddenC = Integer.parseInt(cForbidden);
			boolean status = false;

			if ((mForbidden.equals(forbiddenM)) && (forbiddenC == 403) && (sForbidden.equals(forbiddenS))) {
				System.out.println(forbiddenC);
				System.out.println(sForbidden);
				System.out.println(mForbidden);
				status = true;

			}
			assertTrue(status, "Forbidden - Click: Failed");
			System.out.println("*******************************************************");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public void notFoundClick() {
		try {
			Element_highlight(driver, notFound);
			ScrollToView(driver, notFound);
			ElementClick(driver, notFound);

			// explicitWait(driver, 20, messageCheck);
			Thread.sleep(1000);

			String notFoundM = "Link has responded with staus 404 and status text Not Found";
			String notFoundS = "Not Found";

			String mNotFound = ToGetText(driver, messageCheck);
			String cNotFound = ToGetText(driver, messageCode);
			String sNotFound = ToGetText(driver, messageStatus);

			int notFoundC = Integer.parseInt(cNotFound);
			boolean status = false;

			if ((mNotFound.equals(notFoundM)) && (notFoundC == 404) && (sNotFound.equals(notFoundS))) {
				System.out.println(notFoundC);
				System.out.println(sNotFound);
				System.out.println(mNotFound);
				status = true;

			}
			assertTrue(status, "NotFoundClick - Click: Failed");
			System.out.println("*******************************************************");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
