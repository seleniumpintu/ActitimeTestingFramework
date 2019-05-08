package com.actitime.objectrepositoryLib1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.actitime.ObjectrepositoryLib.Login;
@Test
public class POMTest1 {
	public void LoginTest() throws Throwable {
		WebDriver driver= new FirefoxDriver();
		driver.get("http://localhost/login.do");
		//create an object to login POM Page class
		Login Ipage=PageFactory.initElements(driver, Login.class);
		
		Ipage.loginToAPP();
	} 
		@Test
		public void loginWithoutPAsswordTest() {
			WebDriver driver=new FirefoxDriver();
			driver.get("http://localhost/login.do");
			/* create an object to POMpage class */
			Login Ipage=PageFactory.initElements(driver,Login.class);
			Ipage.getUsernameEdt().sendKeys("admin");
			Ipage.LoginButton().click();
		
}
}