package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class First_Page {
@FindBy(xpath="//a[@class='login']")
private WebElement SignIn;
@FindBy(id="email")
private WebElement email;
@FindBy(id="passwd")
private WebElement	pass;
@FindBy(xpath="//*[@id=\"SubmitLogin\"]/span")
private WebElement Signbt;

public WebDriver driver;

public First_Page(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver2, this);
}
public WebElement getSignIn() {
	return SignIn;
}
public WebElement getEmail() {
	return email;
}
public WebElement getPass() {
	return pass;
}
public WebElement getSignbt() {
	return Signbt;
}










}
