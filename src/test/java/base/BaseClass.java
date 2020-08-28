package base;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass {

	protected WebDriver driver;
	public WebDriverWait wait;

	@BeforeTest
	public void setup() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjan\\eclipse-workspace\\Interview\\src\\test\\resources\\chromedriver.exe"); 		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://blazedemo.com/");

	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

	public void enterText(WebElement element, String value) {
		try {
			element.clear();
			element.sendKeys(value);
		} catch (NoSuchElementException e) {

		}
	}

	public void click(WebElement element) {
		if (!(element == null)) {
			element.click();

		}
	}

}
