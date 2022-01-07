package com.testng.features;

import org.testng.annotations.Test;

public class Time_Out {
@Test(timeOut=3000)
private void browser() throws InterruptedException {
	System.out.println("chrome");
	Thread.sleep(3000);
	}
@Test
private void Url() {
	System.out.println("Flipkat");
}
@Test(timeOut=3000)
private void login() throws InterruptedException {
	System.out.println("Click login button");
	Thread.sleep(1000);
}
	
	
	
	
	
	
	
	
	
	
	
}
