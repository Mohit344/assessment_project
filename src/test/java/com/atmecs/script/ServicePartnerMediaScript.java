package com.atmecs.script;

import org.testng.annotations.Test;

import com.atmecs.constant.FindLocator;
import com.atmecs.dataprovider.DataProviderOne;
import com.atmecs.driver.Driver_Class;
import com.atmecs.helper.CommonUtility;
import com.atmecs.pages.HomeFooterValidateMethod;
public class ServicePartnerMediaScript extends Driver_Class {
	FindLocator loc = new FindLocator();
	@Test(priority=11)
public void clickOnInsight()
{
	CommonUtility.clickElement(driver,loc.getlocator("Insight"));
	CommonUtility.scrollDownPage(driver, 3000);
}
@Test(priority = 12, dataProvider = "testdata1", dataProviderClass = DataProviderOne.class)	
	public void ValiadteInsightFooter(String footer)
	{		
		HomeFooterValidateMethod.isFooterPresent(footer, loc, driver);
	}

@Test(priority = 13)
public void clickOnCarrer()
{

	CommonUtility.clickElement(driver, loc.getlocator("carrer"));
	CommonUtility.scrollDownPage(driver, 3000);
}
@Test(priority = 14, dataProvider = "testdata1", dataProviderClass = DataProviderOne.class)	
	public void ValidateInsight(String footer ) {
	HomeFooterValidateMethod.isFooterPresent(footer, loc, driver);
	
}
@Test(priority = 15)
public void clickOnContactUs()
{
	CommonUtility.clickElement(driver, loc.getlocator("contactus"));
	
	
}
@Test(priority = 16, dataProvider = "testdata1", dataProviderClass = DataProviderOne.class)
public void validateContactus(String footer) {
	HomeFooterValidateMethod.isFooterPresent(footer, loc, driver);
	CommonUtility.scrollDownPage(driver, 3000);
}
}
