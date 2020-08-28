package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import base.BaseClass;

public class HomePage extends BaseClass {

	protected WebDriver driver;
	BaseClass baseclass;

	public HomePage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//select[@name='fromPort']")
	private WebElement fromPort;

	@FindBy(xpath = "//select[@name='toPort']")
	private WebElement toPort;
	
	public void selectFromPort() {
		Select sel = new Select(fromPort);
		sel.selectByValue("Paris");
	}
	
	public void selectTomPort() {
		Select sel = new Select(toPort);
		sel.selectByValue("London");
	}

	/*
	 * @FindBy(xpath = "//input[@name = 'login']") private WebElement Submit;
	 * 
	 * public void enterUserName(String username) { enterText(UserName, username); }
	 * 
	 * public void enterPassword(String password) { enterText(Password, password); }
	 * 
	 * public void clickOnSubmit() { click(Submit); }
	 * 
	 * public void login(String username, String password) {
	 * enterUserName(username); enterPassword(password);
	 * 
	 * }
	 */
}
