package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class SubmitDetailsPage extends BaseClass{

	
	protected WebDriver driver;
	BaseClass baseclass;

	public SubmitDetailsPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath = "//input[@id='inputName']")
	private WebElement nameTextBox;
	
	@FindBy(xpath = "//input[@id='address']")
	private WebElement addressTextBox;
	
	@FindBy(xpath = "//input[@id='city']")
	private WebElement cityTextBox;
	
	@FindBy(xpath = "//input[@id='state']")
	private WebElement stateTextBox;
	
	@FindBy(xpath = "//input[@id='zipCode']")
	private WebElement zipCodeTextBox;
	
	@FindBy(xpath = "//input[@id='creditCardNumber']")
	private WebElement creditCardNumberTextBox;
	
	@FindBy(xpath = "//input[@id='creditCardMonth']")
	private WebElement creditCardMonthTextBox;
	
	@FindBy(xpath = "//input[@id='creditCardYear']")
	private WebElement creditCardYearTextBox;
	
	@FindBy(xpath = "//input[@id='nameOnCard']")
	private WebElement nameOnCardTextBox;
	
	@FindBy(xpath = "//Select[@id='cardType']")
	private WebElement cardTypeDrpDwn;
	
	public void enterFirstName(String firstName) {
		enterText(nameTextBox,firstName);
	}
	
	public void enterAddress(String address) {
		enterText(addressTextBox,address);
	}
	
	public void enterCity(String city) {
		enterText(addressTextBox,city);
	}
	
	public void enterState(String state) {
		enterText(addressTextBox,state);
	}
	
	public void enterzipCode(String zipCode) {
		enterText(addressTextBox,zipCode);
	}
	
	public void enterCcNum(String ccNum) {
		enterText(addressTextBox,ccNum);
	}
	
	public void enterMonth(String month) {
		enterText(addressTextBox,month);
	}
	
	public void enterYear(String year) {
		enterText(addressTextBox,year);
	}
	
	public void enterNameOnCard(String nameOnCard) {
		enterText(addressTextBox,nameOnCard);
	}
	
	
	public void enterDetails(String firstName,String address,String city,String state,String zipCode,String nameOnCard,String cc,String month,String year) {
		enterFirstName(firstName);
		enterFirstName(address);
		enterFirstName(city);
		enterFirstName(state);
		enterFirstName(zipCode);
		enterFirstName(nameOnCard);
		enterFirstName(cc);
		enterFirstName(month);
		enterFirstName(year);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}