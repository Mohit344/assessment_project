package com.atmecs.scenerios.script;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.atmecs.constant.FindLocator;
import com.atmecs.dataprovider.ValidatingData;
import com.atmecs.driver.DriverClass;
import com.atmecs.scenerios.pages.ExploreMore;
import com.atmecs.scenerios.pages.MoreInfoOne;
import com.atmecs.script.FinalBlogScript;

public class HomePageExploreScriptScenrio extends DriverClass {
FindLocator loc = new FindLocator();
ValidatingData data = new ValidatingData();
/**
 * click on explore and validate the breadcrumb
 */
	
	@Test(priority = 1)
	public void ClickOnExplore()
	{
		Logger log = Logger.getLogger(HomePageExploreScriptScenrio.class);
	 ExploreMore.clickOnExplore(loc, driver); 
	 log.info("entered into explore ");
	 
	}
  @Test(priority = 2)
	  public void validateLandRight() {
	  Logger log = Logger.getLogger(HomePageExploreScriptScenrio.class);
	  log.info("validating  url and breadcrumb ");
	  ExploreMore.validateExplorePageUrl(driver, loc);
	  ExploreMore.validateExploreInside(driver, loc);
	  ExploreMore.validateExploreBreadcrumbHome(driver, loc);
	  ExploreMore.validateExploreBreadcrumbServices(driver, loc);
	  MoreInfoOne.clickAgainHome(loc, driver);
	  log.info("validated url and breadcrumb ");
	  
	  
  }

}
