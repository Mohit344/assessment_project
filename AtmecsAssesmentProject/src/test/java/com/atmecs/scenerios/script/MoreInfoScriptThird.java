package com.atmecs.scenerios.script;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.atmecs.constant.FindLocator;
import com.atmecs.dataprovider.ValidatingData;
import com.atmecs.driver.DriverClass;
import com.atmecs.scenerios.pages.MoreInfoOne;
import com.atmecs.scenerios.pages.MoreInfoThird;

public class MoreInfoScriptThird extends DriverClass {
	/**
	 * 
	 * click on second moreinfo and validate breadcrumb
	 */
	
	FindLocator loc = new FindLocator();
	ValidatingData data = new ValidatingData();
	@Test(priority = 7)
	
	public void clickOnInfomorethird()
	{
		Logger log = Logger.getLogger(MoreInfoScriptThird.class);
	MoreInfoThird.clickOninfo3(driver, loc);
	log.info("click on the moreinfo3");
	MoreInfoThird.validatePageUrl(driver, loc);
	log.info("validated the url ");
	
	}

	@Test(priority = 8)
	
	public void validateInfothirdbread()
	{
		Logger log = Logger.getLogger(MoreInfoScriptThird.class);
		log.info("validating the breadcrumb");
		MoreInfoThird.validateTitle(driver, loc);
		MoreInfoOne.validateBrund1(driver, loc);
		MoreInfoOne.validatebrud2(driver, loc);
		MoreInfoOne.validbrud3(driver, loc);
		MoreInfoThird.validateIotBrud(driver, loc);
		MoreInfoOne.clickAgainHome(loc, driver);
		
		log.info("validated the btreadcrumb");
	}
	
	
	
	

}
