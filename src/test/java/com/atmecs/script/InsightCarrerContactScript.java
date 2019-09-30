package com.atmecs.script;

import org.testng.annotations.Test;

import com.atmecs.constant.FindLocator;
import com.atmecs.dataprovider.DataProviderOne;
import com.atmecs.driver.Driver_Class;
import com.atmecs.helper.CommonUtility;
import com.atmecs.pages.HomeFooterValidateMethod;
 
public class InsightCarrerContactScript extends Driver_Class {
	FindLocator  loc= new FindLocator();
@Test(priority =5)	
public void clickOnServices()
{
	CommonUtility.clickElement(driver,loc.getlocator("services"));
	CommonUtility.scrollDownPage(driver, 3000);
	
}
@Test(priority = 6, dataProvider = "testdata1", dataProviderClass = DataProviderOne.class)	
public void servicesFooterValidate(String footer)
{
	HomeFooterValidateMethod.isFooterPresent(footer, loc, driver);	
}

@Test(priority = 7)
public void  clickOnPartner() {
	CommonUtility.clickElement(driver, loc.getlocator("partner"));	
}
@Test(priority = 8, dataProvider = "testdata1", dataProviderClass = DataProviderOne.class)	

public void partnerValidate(String footer)
{
	HomeFooterValidateMethod.isFooterPresent(footer, loc, driver);
}
	
@Test(priority =9 )
public void clickOnMedia()
{
	CommonUtility.clickElement(driver, loc.getlocator("media"));
	
}
@Test(priority = 10, dataProvider = "testdata1", dataProviderClass = DataProviderOne.class)
public void mediaValidate(String footer)
{
	HomeFooterValidateMethod.isFooterPresent(footer, loc, driver);
}




}
