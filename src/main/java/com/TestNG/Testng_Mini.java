package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class Testng_Mini {
@BeforeMethod
	public void lanuchbrowser() {
	System.setProperty("webdriver.chrome.driver", "\\Driver\\chromedriver.exe");	
	WebDriver driver=new ChromeDriver();
	driver.get("http://automationpractice.com/index.php");
	WebElement SignIn = driver.findElement(By.xpath("//a[@class='login']"));
	SignIn.click();
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
