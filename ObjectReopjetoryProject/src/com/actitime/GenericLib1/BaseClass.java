package com.actitime.GenericLib1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.actitime.ObjectrepositoryLib.Login;
import com.actitime.objectrepositoryLib1.Home;

public class BaseClass {
	public static WebDriver driver;
	public FileLib fLib = new FileLib();

	@BeforeSuite
	public void configBeforeSuite()  {
		System.out.println("connect to data base");
	}
	@BeforeClass
	public void configBC() throws Throwable{
		System.out.println("===========launch browser==========");
		String BROWSER = fLib.getPropertyKeyValue("browser");
		if (BROWSER.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (BROWSER.equals("chrome")) {
			driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
	}

	@BeforeMethod
	public void configBM() throws Throwable {
		System.out.println("Login");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(fLib.getPropertyKeyValue("url"));
		
		Login lp=PageFactory.initElements(driver, Login.class);
		lp.loginToAPP();
		Thread.sleep(3000);
	}

	@AfterMethod
	public void configAM() {
		System.out.println("Logout");
		Home hp=PageFactory.initElements(driver, Home.class);
		hp.logout();

	}

	@AfterClass
	public void configAC() {
		System.out.println(".....Close the browser........");
		driver.close();
	}
}
