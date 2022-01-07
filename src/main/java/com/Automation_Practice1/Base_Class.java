package com.Automation_Practice1;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Base_Class {
	public static WebDriver driver;    //driver consider as empty its mentions webdriver which means chrome
	
	public static WebDriver getBrowser(String BrowerName){
		if(BrowerName.equalsIgnoreCase("Chrome"))
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 return driver;
	}
	
	public static void getUrl(String Url) {
		driver.get(Url);
		
	}
	//locators
	public static void getTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	public static void getcurrentUrl() {
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);
	}
	public static void navigateTo(String Url) {
	driver.navigate().to(Url);
	}
	public static void Back() {
		driver.navigate().back();	
	}
	
	public static void forward() {
		driver.navigate().forward();
	}
	
	public static void refresh() {
		driver.navigate().refresh();
	}
	public static void close () {
		driver.close();
	}
	
	public static void quite() {
		driver.quit();
	}
	//Actions
	public static void action(WebElement element, String options) {
	Actions act = new Actions(driver);
	if(options.equalsIgnoreCase("click")) {
		act.click(element).build().perform();
		}
	else if (options.equalsIgnoreCase("move")) {
		act.moveToElement(element).build().perform();
	}
	else if (options.equalsIgnoreCase("rightclick")) {
		act.contextClick(element).build().perform();
	}
	else if (options.equalsIgnoreCase("doubleclick")) {
		act.doubleClick(element).build().perform();
		
	}
	}
	public static void dragAndDrop(WebElement src,WebElement dest) {
		Actions act= new Actions(driver);
		act.dragAndDrop(src, dest).build().perform();
	}
	//Webelement Methods
	public static void InputValueElements(WebElement element, String Value) {
		element.sendKeys(Value);
	}
	public static void ClickElement(WebElement element) {
		element.click();
	}
	public static void getText(WebElement element) {
		String text = element.getText();
		System.out.println(text);
	}
	public static void IsDisplayed(WebElement element) {
	boolean displayed = element.isDisplayed();
	System.out.println(displayed);
	}
	public static void IsEnabled(WebElement element) {
		boolean enabled = element.isEnabled();
		System.out.println(enabled);
	}
	public static void clear(WebElement element){
		element.clear();
	}
	public static void IsSelected(WebElement element) {
		boolean selected = element.isSelected();
		System.out.println(selected);
	}
	
	//ROBOTS
	public static void robotMethods() {
	
			
	}
}
