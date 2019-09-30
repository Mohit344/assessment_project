package com.atmecs.dataprovider;

import org.testng.annotations.DataProvider;

import com.atmecs.constant.FileConstant;
import com.atmecs.util.ProviderData;

public class DataProviderthird {

	
	/**
	 * Data provider to bookcartwo
	 * @return
	 */
		@DataProvider(name = "testdata3")
		public Object[][] getData() {
			ProviderData provideData = new ProviderData(FileConstant.testdata3);
			Object[][] getData = provideData.provideData();
			return getData;
		}
	
	
	
	
	
	
}
