package com.atmecs.scenerios.script;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.atmecs.constant.FindLocator;
import com.atmecs.dataprovider.ValidatingData;
import com.atmecs.driver.DriverClass;
import com.atmecs.scenerios.pages.MoreInfoOne;
import com.atmecs.scenerios.pages.MorreInfoForth;

public class MoreInfoScriptForth extends DriverClass {
/**
 * click on second moreinfo and validate breadcrumb
 */
	
	FindLocator loc = new FindLocator();
	ValidatingData data = new ValidatingData();
		@Test(priority = 9)
		
		public void  clickOnInfoForth()
		{
			Logger log = Logger.getLogger(MoreInfoScriptForth.class);
			MorreInfoForth.clickOninfo4(driver, loc);
			log.info("clicked on moreinfo");
			MorreInfoForth.validatePageUrl(driver, loc);
	
		}
	
		@Test(priority=10)
		public void ValiadteBreadCrumb()
		{
			Logger log = Logger.getLogger(MoreInfoScriptForth.class);
			log.info("validating the brudcrumb ");
			MorreInfoForth.validateTitle(driver, loc);
			MoreInfoOne.validateBrund1(driver, loc);
			MoreInfoOne.validatebrud2(driver, loc);
			MoreInfoOne.validbrud3(driver, loc);
			MorreInfoForth.validateBreadRpa(driver, loc);
			MoreInfoOne.clickAgainHome(loc, driver);
			log.info("validated the breadcrumb");
		}
		
		
	
}
