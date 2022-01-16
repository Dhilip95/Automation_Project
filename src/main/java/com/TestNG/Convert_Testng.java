package com.TestNG;

import org.testng.annotations.BeforeTest;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Automation_Practice1.Mini_Project1;
import com.Pom1.Simplification_Pom;

//import com.config.project.FileReader_Manager;
public class Convert_Testng extends Mini_Project1 {
	public static WebDriver driver = Mini_Project1.getBrowser("Chrome");
	public static Simplification_Pom Final = new Simplification_Pom(driver);

	public class Covert {

		@BeforeTest
		private void SignIn() {
			System.out.println("Sign in the page");
			getUrl("http://automationpractice.com/index.php");
			ClickElement(Final.getFp().getSignIn());
			InputValueElements(Final.getFp().getEmail(), "dhilipan9724@gmail.com");
			InputValueElements(Final.getFp().getPass(), "Yuvi@9724");
			ClickElement(Final.getFp().getSignbt());
		}

		@BeforeMethod
		private void test_starting() {
			System.out.println("----------TestCase Starting----------");
		}

		@Test(priority = 0)
		private void Method() throws InterruptedException {
			System.out.println("Select casual dress");
			action(Final.getSp().getWomenClick(), "move");
			action(Final.getSp().getCasualDress(), "click");
			action(Final.getSp().getImg(), "click");

		}

		@Test(priority = 1)
		private void frame() throws InterruptedException {

			System.out.println("Seleted dress to be ADDED IN Add to card");
			driver.switchTo().frame(0);
			Thread.sleep(2000);
			action(Final.getSp().getAddtocard(), "click");
			driver.switchTo().defaultContent();
			Thread.sleep(3000);
		}

		@Test(priority = 2)
		private void Confirmation() throws InterruptedException {
			System.out.println("Complete the order");
			ClickElement(Final.getLp().getPrcBtn());
			ClickElement(Final.getLp().getPrcBtn1());
			ClickElement(Final.getLp().getPrcBtn2());
			ClickElement(Final.getLp().getCheckBox());
			Thread.sleep(2000);
			ClickElement(Final.getLp().getPrcBtn3());
			ClickElement(Final.getLp().getPay());
			ClickElement(Final.getLp().getConfirm());

		}

		@AfterMethod
		private void test_ending() {
			System.out.println("----------TestCase Ending----------");
		}

		@AfterTest
		private void Close() {
			driver.quit();
		}

	}
}
