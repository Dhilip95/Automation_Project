package com.Automation_Practice1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;

public class Mini_Project1 extends Base_Class {
	public static void main(String[] args) throws Throwable {

	//	System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\eclipse-workspace\\eclipse-java-2019-12-R-win32-x86_64\\eclipse\\selenium_tutorial_2019\\Driver\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		driver = getBrowser("Chrome");
		driver.get("http://automationpractice.com/index.php");
		  driver.manage().timeouts().implicitlyWait(1,TimeUnit.MINUTES);
		WebElement SignIn = driver.findElement(By.xpath("//a[@class='login']"));
		//SignIn.click();
		ClickElement(SignIn);
		WebElement email = driver.findElement(By.id("email"));
		//email.sendKeys("dhilipan9724@gmail.com");
		InputValueElements(email, "dhilipan9724@gmail.com");
		WebElement pass = driver.findElement(By.id("passwd"));
		//pass.sendKeys("Yuvi@9724");
		InputValueElements(pass, "Yuvi@9724");
		WebElement Signbt = driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span"));
		//Signbt.click();
		ClickElement(Signbt);
		WebElement WomenClick = driver.findElement(By.xpath("//a[@title='Women']"));
	  //  Actions act = new Actions(driver);
	    action(WomenClick, "move");
		//act.moveToElement(WomenClick).build().perform();
	    WebElement CasualDress = driver.findElement(By.xpath("//a[@title='Casual Dresses']"));
	   // act.click(CasualDress).build().perform();
	    action(CasualDress, "click");
	    WebElement img = driver.findElement(By.xpath("//img[@title='Printed Dress']"));
	    
	    // act.click(img).build().perform();
	    action(img, "click");
	    driver.switchTo().frame(0);
	  
	    //Thread.sleep(5000);
	    WebElement Addtocard = driver.findElement(By.xpath("//span[text()='Add to cart']"));
		//act.click(Addtocard).build().perform();
		action(Addtocard,"click");
		//Thread.sleep(2000);
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		WebElement PrcBtn = driver.findElement(By.xpath("//a[@class='btn btn-default button button-medium']"));
		
		//PrcBtn.click();
	    ClickElement(PrcBtn);
		
	    //driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    
	    WebElement PrcBtn1 = driver.findElement(By.xpath("//span[text()='Proceed to checkout']"));
		//PrcBtn1.click();
		ClickElement(PrcBtn1);
	    WebElement PrcBtn2 = driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']"));
		//PrcBtn2.click();
		ClickElement(PrcBtn2);
	    WebElement checkBox = driver.findElement(By.id("cgv"));
		//checkBox.click();
		ClickElement(checkBox);
	    WebElement PrcBtn3 = driver.findElement(By.xpath("//button[@class='button btn btn-default standard-checkout button-medium']"));
		//PrcBtn3.click();
		ClickElement(PrcBtn3);
	    WebElement Pay = driver.findElement(By.xpath("//a[@class='cheque']"));
		//Pay.click();
		ClickElement(Pay);
	    WebElement confirm = driver.findElement(By.xpath("//span[text()='I confirm my order']"));
	    //confirm.click();
	    ClickElement(confirm);
}

}	
