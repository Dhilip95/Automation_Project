package com.testng.features;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider_Test {

	@Test(dataProvider = "test_Data")
	private void userdetails(String username,int password) {
		System.out.println("username :"+username);
		System.out.println("password :"+password);
		
	}
	
	@DataProvider
	private Object[][] test_Data() {
	return new Object[][]{
			{"abc",123},{"Hello123",26589565}
		};
	
	
	
	
	
}
}