package com.actitime.moduleTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.actitime.ObjectrepositoryLib.Login;
@Test
public class POMTest {
public void LoginTest() throws Throwable {
	WebDriver driver= new FirefoxDriver();
	driver.get("http://localhost/login.do");
	//create an object to login POM Page class
	Login Ipage=PageFactory.initElements(driver, Login.class);
	
	Ipage.loginToAPP();
	
/*	Ipage.getUsernameEdt().sendKeys("admin");
	Ipage.getPasswordEdt().sendKeys("manager");
	Ipage.initial().click();
	*/
	
}
}
