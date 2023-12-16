package UtilityPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ElementUtil {

	public static void Element_highlight(WebDriver driver, By locator) {

		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].style.border='2px solid red'", driver.findElement(locator));

	}

	public static WebElement LocatorToElement(WebDriver driver, By ele) {
		return driver.findElement(ele);
	}

	public static void ElementClick(WebDriver driver, By locator) {

		driver.findElement(locator).click();

	}

	public static void ScrolltoElement(WebDriver driver, By locator) {
		WebElement ele = driver.findElement(locator);

		Actions action = new Actions(driver);
		action.scrollToElement(ele).perform();

	}

	public static List<WebElement> LocatorToElements(WebDriver driver, By locator) {

		return driver.findElements(locator);

	}

	public static void MovetoElementClick(WebDriver driver, By locator) {
		WebElement ele = driver.findElement(locator);

		Actions action = new Actions(driver);
		action.moveToElement(ele).click().build().perform();

	}
	public static void ScrollToView(WebDriver driver, By locator) {

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(locator));
	}


}
