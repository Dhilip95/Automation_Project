package com.testng.features;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_Annotations {
	@BeforeSuite
	private void setProperty() {
		System.out.println("Before suite");
		
	}
	@BeforeTest
	private void url() {
		System.out.println("Url");
	}
	@BeforeClass
	private void SignInBtn() {
		System.out.println("Button click");
	}
	@BeforeMethod
	private void signIn() {
		System.out.println("sigIn");
	}
	@Test
	private void women() {
		System.out.println("Casual dresses");
	}
	@Test
	private void dress() {
		System.out.println("Evening dress");
	}
	@Test
	private void tshirt() {
		System.out.println("Tshirt");
	}
	
	@AfterMethod
	private void signOut() {
	System.out.println("Sigout");
	}
	
	@AfterClass
	private void Homepage() {
		System.out.println("after class");
	}
	@AfterTest
	private void CloseBrowser() {
		System.out.println("after test");
	}
	@AfterSuite
	private void deletecookies() {
		System.out.println("after suite");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
