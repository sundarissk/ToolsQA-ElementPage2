package ElementPage;

import static UtilityPackage.ElementUtil.LocatorToElements;
import static UtilityPackage.FunctionsUtil.ElementToText;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import UtilityPackage.ElementUtil;

public class WebTablePage {

	WebDriver driver;

	// 1. Defining Page Element --> OR Object Repository
	static final By add = By.xpath("//button[@id='addNewRecordButton']");
	static final By searchtxt = By.xpath("//input[@id='searchBox']");
	static final By searchbut = By.xpath("//span[@id='basic-addon2']");
	static final By edit = By.xpath("//span[@title='Edit']");
	static final By delete = By.xpath("//span[@title='Delete']");
	static final By wholetable = By.xpath("//div[@class='web-tables-wrapper']");

	// individual header cell value
	static final By header = By.xpath("//div[@role='columnheader']");// get column count
	static final By headervalue = By.xpath("//div[@class='rt-resizable-header-content']");

	// total row count
	static final By rowsinpage = By.xpath("//div[@class='rt-tr-group']");

	static final By rowsentry = By.xpath("//div[@class='rt-tr -even' or @class = 'rt-tr -odd']");

	// Even row entry
	static final By evenrow = By.xpath("//div[@class='rt-tr -even' ]");

	// Odd row entry
	static final By oddrow = By.xpath("//div[@class='rt-tr -odd' ]");

	// row value reading //div[@role='rowgroup'][3], No of rows in a page display
	static final By rowvalue = By.xpath("//div[@role='rowgroup']");

	// column value reading & add [1] ,[2] to access particular column
	// By.xpath("//div[@class='rt-tr-group'][3] (data)//div[@class='rt-td'][3]
	// (column)
	static final By colvalue = By.xpath("//div[@class='rt-td']");

	// Age colume
	static final By age = By.xpath("//div[@class='rt-tr -even' or @class = 'rt-tr -odd']//div[@class='rt-td'][3]");

	static final By cage = By.xpath("//div[@class='rt-tr -even' or @class = 'rt-tr -odd']//div[@class='rt-td']");

	// First Name Column Data
	static final By fname = By.xpath("//div[@class='rt-tr -even' or @class = 'rt-tr -odd']//div[@class='rt-td'][1]");

	// Last name colume
	static final By lname = By.xpath("//div[@class='rt-tr -even' or @class = 'rt-tr -odd']//div[@class='rt-td'][2]");

	// salary colume
	static final By salary = By.xpath("//div[@class='rt-tr -even' or @class = 'rt-tr -odd']//div[@class='rt-td'][5]");

	// Department Column
	static final By dept = By.xpath("//div[@class='rt-tr -even' or @class = 'rt-tr -odd']//div[@class='rt-td'][6]");

	// cellData
	static final By celldatainpage = By.xpath("//div[@class='rt-tr -odd' ]//div[@class='rt-td']");

	static final By celldataentry = By
			.xpath("//div[@class='rt-tr -even' or @class = 'rt-tr -odd']//div[@class='rt-td'][3]");
	static final By tdata = By.xpath("//div[@role='rowgroup']//div[@class='rt-td']");

	// nth cellvalue by row and cloumn number
	static final By cellvalue = By.xpath("//div[@class='rt-tr-group'][1]//div[@class='rt-td'][1]");

	// Pagination
	// 1. Total no of page according to no of rows
	static final By totalnoofpage = By.xpath("//span[@class='-totalPages']");

	// 2. Rows per page
	static final By rowsperpage = By.xpath("//select[@aria-label]");

	// 3. Previous Button
	static final By previousbtn = By.xpath("//div[@class='-previous']");

	// 4. Next Button
	static final By nextbtn = By.xpath("//div[@class='-next']");

	// static final By = By.xpath("");

	// 2. Initializing Page Object
	public WebTablePage(WebDriver driver) {
		this.driver = driver;

	}

	// 3. Actions

	// 1. Traverse forward direction depending on particular value
	public void TraverseForward() {

	}

	// 2. Traverse reverse direction depending on particular value
	public void TraverseReverse() {

	}

	// 3. Print Last/first/nth row data of the table
	public void PrintRowValue() {

	}

	// 4. Print even row data in table
	public void PrintEvenRowData() {

	}

	// 5. Print Odd row data in table
	public void PrintOddRowData() {

	}

	// 6. Printing First name in Alpahabetic order and assert
	public void SortingFnamecellData() {

		ArrayList<String> listfn = new ArrayList<String>();

		List<WebElement> lele = driver.findElements(fname);
		int c = lele.size();
		System.out.println("No of records: " + c);

		for (WebElement ele : lele) {
			String firstn = ElementToText(driver, ele);
			listfn.add(firstn);

		}

		System.out.println("Before Sorting Fname: " + listfn.toString());
		Collections.sort(listfn);

		System.out.println("After Sorting Fname:  " + listfn.toString());

	}

	// 7. Finding highest in age records
	public void AgeHighestRecords() {

		ArrayList<String> agearr = new ArrayList<String>();

		List<WebElement> agea = LocatorToElements(driver, age);

		for (WebElement eage : agea) {
			String a = eage.getText();
			agearr.add(a);

		}
		Collections.sort(agearr);

		System.out.println("Highest Age: " + Collections.max(agearr));
		System.out.println("Lowest Age: " + Collections.min(agearr));

	}

	//8. Fetching Records based on Highest Age
	public void FetchRecordsHighestage() {
		// Age is in the third column of each row
		int ageIndex = 0;
		int highestAge = 0;
		WebElement recordWithHighAge = null;

		// Find all rows in the web table
		List<WebElement> rows = LocatorToElements(driver, rowsentry);
		System.out.println("No of Records entered: " + rows.size());

		// Initialize variables to store the highest age and corresponding record
		for (WebElement row : rows) {
			System.out.println(row.getText());
			System.out.println("*********");

			String agestr = row.findElements(age).get(ageIndex).getText();
			int a = Integer.parseInt(agestr);

			if (a > highestAge) {
				highestAge = a;
				recordWithHighAge = row;

			}
			ageIndex++;
		}
		System.out.println("Highest Age Record: ");
		System.out.println(recordWithHighAge.getText());
	}
}
