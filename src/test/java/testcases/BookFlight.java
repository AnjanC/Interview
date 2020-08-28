package testcases;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.HomePage;
import pages.SubmitDetailsPage;
import pages.TravelTheWorldPage;
import utils.ReadExcelData;

public class BookFlight extends BaseClass {
	
	HomePage home = new HomePage(driver);
	SubmitDetailsPage sub = new SubmitDetailsPage(driver);
	TravelTheWorldPage travel = new TravelTheWorldPage(driver);
	Select select;
	
	
	@Test
	public void bookFlightTest(String firstName,String address,String city,String state,String zipCode,String nameOnCard,String cc,String month,String year) {
		
		home.selectFromPort();
		home.selectTomPort();
		travel.clickOnChooseBtn();
		sub.enterDetails(firstName, address, city, state, zipCode, nameOnCard, cc, month, year);
		
		
	}
	
	@DataProvider(name = "TestData")
	public Object[][] getData() throws IOException{
		
		Object[][] testObj = ReadExcelData.getTableArray("TestData");
		return(testObj);
		
	}

}
