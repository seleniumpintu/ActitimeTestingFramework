package com.actitime.objectrepositoryLib1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
/**
 * 
 * @author pintu
 *
 */
public class OpneTask {
	@FindBy(linkText="project & customer")
	private WebElement proAndCustLnk;

	public void clickONprojectAndCustomerLnk() {
		proAndCustLnk.click();
}
}
