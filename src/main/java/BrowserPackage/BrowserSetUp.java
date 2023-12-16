package BrowserPackage;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrowserSetUp {
	public static WebDriver driver;

	
	public void SetUp() {
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

	}

	
	public void CloseDown() {
		driver.close();
		driver.quit();

	}

}
