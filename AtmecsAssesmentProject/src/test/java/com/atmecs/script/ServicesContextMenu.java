package com.atmecs.script;

import org.apache.log4j.Logger;




import org.testng.annotations.Test;

import com.atmecs.constant.FindLocator;
import com.atmecs.dataprovider.DataProviderData;
import com.atmecs.driver.DriverClass;
import com.atmecs.pages.HomeFooterValidateMethod;
import com.atmecs.pages.ServiceContextpages;

public class ServicesContextMenu extends DriverClass  {
	
	FindLocator loc = new  FindLocator();
@Test(priority =17)	
public void hoverOnServices()
{Logger log = Logger.getLogger(ServicesContextMenu.class);
log.info("hover on the services  and digital life");
	ServiceContextpages.mouseHover(driver, loc);	
}
@Test(priority = 18, dataProvider = "testdata2", dataProviderClass = DataProviderData.class)
public void validateSubmenu(String subserviecs)
{
	HomeFooterValidateMethod.validatesubserviecs(subserviecs, loc, driver);
	Logger log = Logger.getLogger(ServicesContextMenu.class);
	log.info("validated the submenu didgitallife ");
	
}

@Test(priority = 19)
public void infrastructureservice()
{Logger log = Logger.getLogger(ServicesContextMenu.class);
log.info("HoverOnInfra ");
	ServiceContextpages.mouseHoverOnInfra(driver, loc);
}

@Test(priority = 20, dataProvider = "testdata3", dataProviderClass = DataProviderData.class)

	public void validateInfraServices(String subserviecs)
	{	
		HomeFooterValidateMethod.validatesubserviecs(subserviecs, loc, driver);
		Logger log = Logger.getLogger(ServicesContextMenu.class);
		log.info("validated the submenu infra Services ");
	}
}








