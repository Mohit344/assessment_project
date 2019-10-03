package com.atmecs.scenerios.script;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import com.atmecs.constant.FindLocator;
import com.atmecs.dataprovider.ValidatingData;
import com.atmecs.driver.DriverClass;
import com.atmecs.scenerios.pages.MoreInfoFifth;
import com.atmecs.scenerios.pages.MoreInfoOne;

public class MoreInfoScriptFive extends DriverClass {
	/**
	 * click on second moreinfo and validate breadcrumb
	 */
	
	
	FindLocator loc = new FindLocator();
	ValidatingData data = new ValidatingData();
	@Test(priority = 11)
	
	public void clickOnInfoFifth()
	{Logger log = Logger.getLogger(MoreInfoScriptFive.class);
		MoreInfoFifth.clickOninfo5(driver, loc);
		log.info("click on the moreinfo");
		MoreInfoFifth.validatePageUrl(driver, loc);
		log.info("validated the url");
	}
	
	
	@Test(priority = 12)
	public void ValiadteBreadCrumb()
	{
		
		Logger log = Logger.getLogger(MoreInfoScriptFive.class);
		log.info("validating the brudcrumb");
		MoreInfoFifth.valitateTitleFive(driver, loc);	
		MoreInfoOne.validateBrund1(driver, loc);
		MoreInfoOne.validatebrud2(driver, loc);
		MoreInfoOne.validatebrud2(driver, loc);
		MoreInfoOne.validbrud3(driver, loc);
		MoreInfoFifth.validatebreadblock(driver, loc);
		MoreInfoOne.clickAgainHome(loc, driver);
       log.info("validated the breadcrumb");	
		driver.quit();
		
		
	}
	
//	@AfterSuite
//	public void endReport(WebDriver driver) {
//		driver.quit();// quit the webdriver

}
