 package com.testng.features;

import org.testng.annotations.Test;

public class Grouping_Test {
	@Test(groups = "Onlineshopping")
	private void amazon() {
	System.out.println("amazon");	
	}
	@Test(groups = "Onlineshopping")
	private void flipkart() {
		System.out.println("flipkart");
	}
	
	@Test(groups = "Onlineshopping")
	private void myntra() {
		System.out.println("myntra");
	}
	@Test(groups = "e-payment")
	private void phonePe() {
		System.out.println("phonePe");
	}
	@Test(groups = "e-payment")
	private void goolgePay() {
		System.out.println("goolgePay");
	}
	
	@Test(groups ="Sports")
	private void cricket() {
		System.out.println("cricket");
	}
	@Test(groups = "Media")
	private void tvChannel() {
		System.out.println("News channel");
	}
	
	
	
	
	
	
}
