package com.atmecs.scenerios.script;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.atmecs.constant.FindLocator;
import com.atmecs.dataprovider.ValidatingData;
import com.atmecs.driver.DriverClass;
import com.atmecs.scenerios.pages.MoreInfoOne;
import com.atmecs.scenerios.pages.MoreinfoTwo;

public class MoreInfoScripTwo extends DriverClass {
	
	/**
	 * click on second moreinfo and validate breadcrumb
	 * 
	 */
	FindLocator loc = new FindLocator();
	ValidatingData data = new ValidatingData();
	@Test(priority = 5)
public void clickOnInfomore2()

{
		Logger log = Logger.getLogger(MoreInfoScripTwo.class);
	MoreinfoTwo.clickOninfo2(loc, driver);
	log.info("click on moreinfo");
	MoreinfoTwo.validatePageUrl(driver, loc);
	log.info("valiadte the url");
	
}
	@Test(priority = 6)
	
	public void valiadeinfoTwoBrud()
	{
		Logger log = Logger.getLogger(MoreInfoScripTwo.class);
		log.info("validating the title and breadcrumb");
		MoreinfoTwo.validateTitle(loc, driver);
		MoreInfoOne.validateBrund1(driver, loc);
		MoreInfoOne.validatebrud2(driver, loc);
		MoreInfoOne.validbrud3(driver, loc);
		MoreinfoTwo.validateVirtual(loc, driver);
		MoreInfoOne.clickAgainHome(loc, driver);
		log.info("validated the breadcrumb ");
		
	}
	
	
	
}
