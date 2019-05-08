package com.actitime.objectrepositoryLib1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home {
	
@FindBy(xpath="//div[text()='TASKS']")
private WebElement taskImg;	

@FindBy(xpath="//div[text()='USER']")
private WebElement userImg;

@FindBy(xpath="//a[text()='Logout']")
private WebElement Logoutlnk;

public void clickonTaskimage() {
	taskImg.click();	
}
public void clickonUSERimage() {
	userImg.click();
}
public void logout() {
	Logoutlnk.click();	
}
}