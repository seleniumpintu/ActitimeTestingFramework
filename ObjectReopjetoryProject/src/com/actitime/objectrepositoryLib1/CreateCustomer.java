package com.actitime.objectrepositoryLib1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateCustomer {

	@FindBy(id="customerLightBox_nameField")
	private WebElement customerNAme;
	
	@FindBy(id="customerLightBox_descriptionField")
	private WebElement CustomerDescEdt;
	
	@FindBy(xpath="//span[@class='buttonTitle' and text()='create customer']")
	private WebElement createCustomerBtn;
	
	public void createCustomer(String customerName) {
		customerNAme.sendKeys(customerName);
		createCustomerBtn.click();
	}
	public void createCustomer(String customerName,String customerDesc) {
		customerNAme.sendKeys(customerName);
		createCustomerBtn.click();
		CustomerDescEdt.sendKeys(customerDesc);
		createCustomerBtn.click();
	
}
}
