	
package com.Pom1;

import org.openqa.selenium.WebDriver;

import com.POM.First_Page;
import com.POM.Last_Page;
import com.POM.Second_Page;

public class Simplification_Pom {
public static WebDriver driver;

private First_Page fp;
private Second_Page Sp;
private Last_Page Lp;

public Simplification_Pom(WebDriver driver2) {
	this.driver=driver2;
}

public static WebDriver getDriver() {
	return driver;
}

public First_Page getFp() {
	fp=new First_Page(driver);
	
	return fp;
}

public Second_Page getSp() {
	Sp=new Second_Page(driver);
	return Sp;
}

public Last_Page getLp() {
	Lp=new Last_Page(driver);
	return Lp;
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
