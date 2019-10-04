package com.atmecs.script;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import com.atmecs.constant.FindLocator;
import com.atmecs.dataprovider.DataProviderData;
import com.atmecs.driver.DriverClass;
import com.atmecs.helper.CommonUtility;
import com.atmecs.pages.CommonMethods;

public class AtmecsScript extends DriverClass{
	FindLocator loc = new FindLocator();

	
		/**
		 * @param title
		 * @param breadcrumb
		 */
		@Test(priority = 1, dataProvider = "exploretestdata", dataProviderClass = DataProviderData.class)
		public void clickOnExploreNow(String title, String breadcrumb) {
			Logger log = Logger.getLogger(AtmecsScript.class);
			CommonUtility.clickElement(driver, loc.getlocator("exploremore"));

			log.info("clicked on exploremore");
			String exploreactualtitle = driver.getTitle();// get the title of the pages.
			System.out.println(exploreactualtitle); // title
			CommonMethods.pageTitleValidation(title, driver);
			log.info("validated title");
			CommonMethods.validateBreadCrumb(breadcrumb, loc, driver);
			log.info("valited the breadcrumb");
			driver.navigate().back();// navigate back to home page
			log.info("back to home page");
		}

		int countdata = 0;// data counter

		@Test(priority = 2, dataProvider = "moreinfotestdata", dataProviderClass = DataProviderData.class)
		public void clickOnMoreInfo(String title, String breadcrumb) {
			Logger log = Logger.getLogger(AtmecsScript.class);
			countdata++;
			CommonUtility.scrollToElement(driver, loc.getlocator("commonxpathinfomore").replace("xxx", "" + countdata));// dynamic
																														// xpath
																														// for
																														// reusability 
			log.info("clicked on moreinfo");
			CommonUtility.clickElement(driver, loc.getlocator("commonxpathinfomore").replace("xxx", "" + countdata));// dynamic
																														// xpath
																														// for
																														// clicking
																														// each
																														// moreinfo																								// info
			String titleinfo = driver.getTitle();// get title of the pages
			System.out.println(titleinfo);
			CommonMethods.pageTitleValidation(title, driver);
			log.info("validated title");
			CommonMethods.validateBreadCrumb(breadcrumb, loc, driver);
			log.info("valited the breadcrumb");
			driver.navigate().back();// navigate back to home page
			log.info("back to home page");
   
		}
	}

