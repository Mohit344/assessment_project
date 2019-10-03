package com.atmecs.dataprovider;



import org.testng.annotations.DataProvider;

import com.atmecs.constant.FileConstant;
import com.atmecs.util.ProviderData;

public class DataProviderData {

	
	/**
	 * Data provider 1
	 * @return
	 */
		@DataProvider(name = "testdata1")
		public Object[][] getDataOne() {
			ProviderData provideData = new ProviderData(FileConstant.testdata1);
			Object[][] getData = provideData.provideData();
			return getData;
		}
	
		
		/**
		 * data provider 2
		 * @return
		 */
		@DataProvider(name = "testdata2")
		public Object[][] getDataSecond() {
			ProviderData provideData = new ProviderData(FileConstant.testdata2);
			Object[][] getData = provideData.provideData();
			return getData;
		}
		
		/**
		 * Data provider 3
		 * @return
		 */
			@DataProvider(name = "testdata3")
			public Object[][] getDataThird() {
				ProviderData provideData = new ProviderData(FileConstant.testdata3);
				Object[][] getData = provideData.provideData();
				return getData;
			}
		
			/**
			 * Data provider 4
			 * @return
			 */
				@DataProvider(name = "testdata4")
				public Object[][] getDataForth() {
					ProviderData provideData = new ProviderData(FileConstant.testdata4);
					Object[][] getData = provideData.provideData();
					return getData;
				}
		
		
		
		
}
