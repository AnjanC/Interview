package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import base.BaseClass;

public class TravelTheWorldPage extends BaseClass{
	
	protected WebDriver driver;
	BaseClass baseclass;

	public TravelTheWorldPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath = "//tbody/tr[1]/td")
	private WebElement chooseThisFlightFirstButton;
	
	public void clickOnChooseBtn() {
		click(chooseThisFlightFirstButton);
	}

}
