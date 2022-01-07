package com.testng.features;

import org.testng.annotations.Test;

public class Dependency {
@Test(groups = "loginpage")
private void browserlanuch() {
	System.out.println("getbrowser");
	
}
	
@Test(groups = "loginpage")
private void url(){
	System.out.println("amazon");
}
	
@Test(dependsOnGroups = "loginpage")
private void homePage() {
	System.out.println("Opened homepage");
}
@Test(dependsOnMethods = "homePage")
private void login() {
	System.out.println("user logged in");
}
	
}
