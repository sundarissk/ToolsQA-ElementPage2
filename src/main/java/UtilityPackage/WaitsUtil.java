package UtilityPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsUtil {

	public static void explicitWait(WebDriver dr, int sec, By locator) {
		WebDriverWait wait = new WebDriverWait(dr, Duration.ofSeconds(sec));
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

	}
	
	
}
