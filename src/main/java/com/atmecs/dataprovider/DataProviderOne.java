package com.atmecs.dataprovider;



import org.testng.annotations.DataProvider;

import com.atmecs.constant.FileConstant;
import com.atmecs.util.ProviderData;

public class DataProviderOne {

	
	/**
	 * Data provider to bookcartwo
	 * @return
	 */
		@DataProvider(name = "testdata1")
		public Object[][] getData() {
			ProviderData provideData = new ProviderData(FileConstant.testdata1);
			Object[][] getData = provideData.provideData();
			return getData;
		}
	
	
	
}
