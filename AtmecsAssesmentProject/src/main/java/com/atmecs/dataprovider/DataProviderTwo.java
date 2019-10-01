package com.atmecs.dataprovider;

import org.testng.annotations.DataProvider;

import com.atmecs.constant.FileConstant;
import com.atmecs.util.ProviderData;

public class DataProviderTwo {


	/**
	 * Data provider to bookcartwo
	 * @return
	 */
		@DataProvider(name = "testdata2")
		public Object[][] getData() {
			ProviderData provideData = new ProviderData(FileConstant.testdata2);
			Object[][] getData = provideData.provideData();
			return getData;
		}
	
	
}
