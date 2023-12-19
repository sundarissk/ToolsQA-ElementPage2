package UtilityPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FunctionsUtil {

	public static String ToGetText(WebDriver driver, By locator) {

		String textele = driver.findElement(locator).getText();
		return textele;

	}

	public static String ToGetTitle(WebDriver driver) {

		return driver.getTitle();

	}

	public static String ToGetCurrentUrl(WebDriver driver) {
		return driver.getCurrentUrl();

	}

	public static int ToGetCount(WebDriver driver, By locator) {

		int count = driver.findElements(locator).size();
		return count;
	}

	public static String ElementToText(WebDriver driver, WebElement ele) {

		return ele.getText();

	}

	public static void PageRefresh(WebDriver driver) {
		driver.navigate().refresh();

	}

}
