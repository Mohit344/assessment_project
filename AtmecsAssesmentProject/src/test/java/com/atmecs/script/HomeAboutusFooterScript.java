package com.atmecs.script;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.atmecs.constant.FindLocator;
import com.atmecs.dataprovider.DataProviderOne;
import com.atmecs.driver.Driver_Class;
import com.atmecs.helper.CommonUtility;
import com.atmecs.pages.HomeFooterValidateMethod;

public class HomeAboutusFooterScript extends Driver_Class {
	FindLocator loc = new FindLocator();
@Test(priority = 1)
	public void clickHome()
{		
	Logger log = Logger.getLogger(HomeAboutusFooterScript.class);
	log.info("enter into homePage");
		CommonUtility.clickElement(driver, loc.getlocator("home"));
		CommonUtility.scrollDownPage(driver, 30000);	
	}
	@Test(priority = 2, dataProvider = "testdata1", dataProviderClass = DataProviderOne.class)
	public void homefooterValidate(String footer) {
		HomeFooterValidateMethod.isFooterPresent(footer, loc, driver);
		Logger log = Logger.getLogger(HomeAboutusFooterScript.class);
		log.info(" homepage footer validated");
	}
	
	@Test(priority = 3)
	public void clickOnAbout()
	
	{
		Logger log = Logger.getLogger(HomeAboutusFooterScript.class);
         log.info("enter into about  us ");
		CommonUtility.clickElement(driver, loc.getlocator("aboutus"));
		CommonUtility.scrollDownPage(driver, 30000);
	}

	@Test(priority = 4, dataProvider = "testdata1", dataProviderClass = DataProviderOne.class)
	public void aboutUsFooter(String footer)
	{
		HomeFooterValidateMethod.isFooterPresent(footer, loc, driver);
		Logger log = Logger.getLogger(HomeAboutusFooterScript.class);
        log.info("Validated the footer of Aboutus ");
		
	}
	
}
