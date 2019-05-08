package com.actitime.objectrepositoryLib1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProjectAndCustomer {

@FindBy(xpath="//span[text()='Create Customer']")
private WebElement createCustomerBtn;	

@FindBy(xpath="//span[@class='successmsg']")
private WebElement successMsg;

public void cliclonCreateCustomerBtn() {
	createCustomerBtn.click();	
}
public  WebElement getsuccessMsg() {
	return successMsg;
}
}