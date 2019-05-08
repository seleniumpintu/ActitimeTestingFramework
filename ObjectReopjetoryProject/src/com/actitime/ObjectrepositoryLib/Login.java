package com.actitime.ObjectrepositoryLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {// Rule:1 create every class for every page

	@FindBy(name = "username") // Rule:2 identify element using @Find Annotation
    private	WebElement usernameEdt;

	@FindBy(name = "pwd")
	private	WebElement passwordEdt;

	@FindBy(className= "LoginButton")
	private	WebElement LoginButton ;

	// rule:3 identify reusable bussiness liberaries, which can be used in login
	// class
	public  void loginToAPP() throws Throwable  {
		FileLib fLib=new FileLib();
		
		usernameEdt.sendKeys(fLib.getPropertyKeyValue("username"));
		passwordEdt.sendKeys(fLib.getPropertyKeyValue("password"));
		LoginButton .click();
	}
	public void loginToAPP(String username,String Password) throws Throwable {
		FileLib fLib = new FileLib();

		usernameEdt.sendKeys(fLib.getPropertyKeyValue("username"));
		passwordEdt.sendKeys(fLib.getPropertyKeyValue("password"));
		LoginButton.click();
	}
	//rule:4 provide getter method to give read access to the specific webelement
	public WebElement getUsernameEdt() {
		return usernameEdt;
	}
	public WebElement getPasswordEdt() {
		return passwordEdt;
	}
	public WebElement LoginButton() {
		return LoginButton;
		
		
	}
}
