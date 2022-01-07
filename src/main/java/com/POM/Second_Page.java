package com.POM;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Second_Page {
	@FindBy(xpath="//a[@title='Women']")
	private WebElement WomenClick;
	@FindBy(xpath="//a[@title='Casual Dresses']")
	private WebElement	CasualDress;
	@FindBy(xpath="//img[@title='Printed Dress']")
	private WebElement img;
	@FindBy(xpath="//span[text()='Add to cart']")
	private WebElement Addtocard;
	
	public WebDriver driver;
	
	public Second_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}
	public WebElement getWomenClick() {
		return WomenClick;
	}
	public WebElement getCasualDress() {
		return CasualDress;
	}
	public WebElement getImg() {
		return img;
	}
	public WebElement getAddtocard() {
		return Addtocard;
	}
	
	







}
