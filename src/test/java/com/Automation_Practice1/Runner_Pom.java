package com.Automation_Practice1;

import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;

import com.Automation_Practice1.Mini_Project1;
import com.Pom1.Simplification_Pom;
import com.config.project.FileReader_Manager;

public class Runner_Pom extends Mini_Project1 {
public static WebDriver driver= Mini_Project1.getBrowser("Chrome");
public static Simplification_Pom Final=new Simplification_Pom(driver);
//public static First_Page fp= new First_Page(driver);
//public static Second_Page Sp= new Second_Page(driver);
//public static Last_Page Lp= new Last_Page(driver);
public static void main(String[] args) throws Throwable {
	
driver.get(FileReader_Manager.getInstanceFRM().getInstanceCR().getUrl());
driver.manage().timeouts().implicitlyWait(1,TimeUnit.MINUTES);
ClickElement(Final.getFp().getSignIn());
InputValueElements(Final.getFp().getEmail(),FileReader_Manager.getInstanceFRM().getInstanceCR().getUsername());
InputValueElements(Final.getFp().getPass(), FileReader_Manager.getInstanceFRM().getInstanceCR().getPassword());
ClickElement(Final.getFp().getSignbt());
action(Final.getSp().getWomenClick(), "move");
action(Final.getSp().getCasualDress(), "click");
action(Final.getSp().getImg(), "click");
driver.switchTo().frame(0);
action(Final.getSp().getAddtocard(),"click");
driver.switchTo().defaultContent();
Thread.sleep(3000);
ClickElement(Final.getLp().getPrcBtn());
ClickElement(Final.getLp().getPrcBtn1());
ClickElement(Final.getLp().getPrcBtn2());
ClickElement(Final.getLp().getCheckBox());
Thread.sleep(2000);
ClickElement(Final.getLp().getPrcBtn3());
ClickElement(Final.getLp().getPay());
ClickElement(Final.getLp().getConfirm());
}
}
