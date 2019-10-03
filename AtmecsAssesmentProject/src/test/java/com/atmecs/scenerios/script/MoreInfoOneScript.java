package com.atmecs.scenerios.script;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.atmecs.constant.FindLocator;
import com.atmecs.dataprovider.ValidatingData;
import com.atmecs.driver.DriverClass;
import com.atmecs.helper.CommonUtility;
import com.atmecs.scenerios.pages.MoreInfoOne;

public class MoreInfoOneScript extends DriverClass {
	/**
	 * click on moreinfo and validate the breadcrumb
	 */
	
FindLocator loc = new FindLocator();
ValidatingData data = new ValidatingData();
	@Test(priority = 3)
	
	public void  clickOnInfo()
	{
		Logger log = Logger.getLogger(MoreInfoOneScript.class);
		MoreInfoOne.clickOnInfoMore1(loc, driver);
		log.info("click on the moreinfo");
		MoreInfoOne.validatePageUrl(driver, loc);
		log.info("valiadted the urlpages");
		
	}  
	@Test(priority = 4)
	
		public void validateBrudInfo1()
		{
		Logger log = Logger.getLogger(MoreInfoOneScript.class);
		MoreInfoOne.validateBreadCrumbTitle(driver, loc);
		log.info("validate the breadcrumb");
		MoreInfoOne.validateBrund1(driver, loc);
		MoreInfoOne.validatebrud2(driver, loc);
		MoreInfoOne.validbrud3(driver, loc);
		MoreInfoOne.validbrud4(driver, loc);
		MoreInfoOne.clickAgainHome(loc, driver);
		log.info("validated the breadcrumb of moreinfo1");
		}
	}
	

	


