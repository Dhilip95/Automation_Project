package com.testng.features;

import org.testng.annotations.Test;

public class Priority_Concept {

	
	@Test(priority=-3)
	private void dress() {
		System.out.println("shirts");
	}
	@Test(priority=1) 
	private void gender() {
		System.out.println("Men");
	}
	@Test
	private void books() {
		
	System.out.println("books");
	}
	@Test(priority=-2) 
	private void women() {
		System.out.println("women");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
