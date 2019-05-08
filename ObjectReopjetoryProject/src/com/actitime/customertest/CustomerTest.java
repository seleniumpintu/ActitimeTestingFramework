package com.actitime.customertest;



import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.GenericLib1.BaseClass;
import com.actitime.objectrepositoryLib1.CreateCustomer;
import com.actitime.objectrepositoryLib1.Home;
import com.actitime.objectrepositoryLib1.OpneTask;
import com.actitime.objectrepositoryLib1.ProjectAndCustomer;
/**
 * 
 * @author pintu
 *
 */
@Listeners(com.actitime.GenericLib1.ListenerImpClass.class)
public class CustomerTest extends BaseClass {

	@Test
	public void createCustomerTest() throws Throwable {
		/* read data from excel */
		String customerNAme=fLib.getExcelData("sheetName", 1, 2);
		/* step:3 navigate to task page */
		Home hp=PageFactory.initElements(driver,Home.class);
		hp.clickonTaskimage();
		/* step:4 navigate to project And customer page */
		OpneTask op=PageFactory.initElements(driver, OpneTask.class);
		op.clickONprojectAndCustomerLnk();
		/*step:5 navigate create customer page */
		ProjectAndCustomer pac=PageFactory.initElements(driver,ProjectAndCustomer.class );
		pac.cliclonCreateCustomerBtn();
		/* step:6 create customer */
		CreateCustomer cp=PageFactory.initElements(driver,CreateCustomer.class);
		cp.createCustomer(customerNAme);
		/* step:7 verify */
		String  actsussMsg=pac.getsuccessMsg().getText();
		boolean status=actsussMsg.contains("sucessfully created");
		Assert.assertTrue(status);
}
	@Test
	public void createCustomerWithDescTest() throws Throwable{
		/* read data from excel */
		String customerNAme=fLib.getExcelData("sheetName", 4, 2);
		String customerDesc=fLib.getExcelData("sheetName", 4, 3);
		/* step:3 navigate to task page */
		Home hp=PageFactory.initElements(driver,Home.class);
		hp.clickonTaskimage();
		/* step:4 navigate to project And customer page */
		OpneTask op=PageFactory.initElements(driver, OpneTask.class);
		op.clickONprojectAndCustomerLnk();
		/*step:5 navigate create customer page */
		ProjectAndCustomer pac=PageFactory.initElements(driver,ProjectAndCustomer.class );
		pac.cliclonCreateCustomerBtn();
		/* step:6 create customer */
		CreateCustomer cp=PageFactory.initElements(driver,CreateCustomer.class);
		cp.createCustomer(customerNAme);
		/* step:7 verify */
		String  actsussMsg=pac.getsuccessMsg().getText();
		boolean status=actsussMsg.contains("sucessfully created");
		Assert.assertTrue(status);
}
}
