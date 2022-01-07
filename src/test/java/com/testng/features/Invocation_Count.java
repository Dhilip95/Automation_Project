package com.testng.features;

import org.testng.annotations.Test;

public class Invocation_Count {

@Test(priority = 1)
private void browser_lanuch() {
	System.out.println("browser");
}
@Test
private void url() {
	System.out.println("url");
}
@Test(priority = -1)
private void chrome() {
	System.out.println("webbrowser");
}
@Test (invocationCount=2, priority=-2 )
private void reload() {
	System.out.println("loading");
}
@Test(priority = 2)
private void refresh() {
	System.out.println("refresh");
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
