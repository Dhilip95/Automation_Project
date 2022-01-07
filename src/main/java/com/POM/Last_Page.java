package com.POM;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Last_Page {
@FindBy(xpath="//a[@class='btn btn-default button button-medium']")
private WebElement PrcBtn;
@FindBy (xpath ="//span[text()='Proceed to checkout']")
private WebElement PrcBtn1;
@FindBy(xpath="//button[@class='button btn btn-default button-medium']")
private WebElement PrcBtn2;
@FindBy(id="cgv")
private WebElement checkBox;
@FindBy(xpath="//button[@class='button btn btn-default standard-checkout button-medium']")
private WebElement PrcBtn3;
@FindBy(xpath="//a[@class='cheque']")
private WebElement Pay;
@FindBy(xpath="//span[text()='I confirm my order']")
private WebElement confirm;


public  WebDriver driver;





public Last_Page(WebDriver driver2) {
this.driver=driver2;
PageFactory.initElements(driver2, this);
}


public WebElement getPrcBtn() {
	return PrcBtn;
}


public WebElement getPrcBtn1() {
	return PrcBtn1;
}


public WebElement getPrcBtn2() {
	return PrcBtn2;
}


public WebElement getCheckBox() {
	return checkBox;
}


public WebElement getPrcBtn3() {
	return PrcBtn3;
}


public WebElement getPay() {
	return Pay;
}


public WebElement getConfirm() {
	return confirm;
}














}

