 package com.erp.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.erp.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {
	
	
	@Test
	public void loginTest() {
		driver.get(baseurl);
		LoginPage login=new LoginPage(driver);
		login.setUserName(username);
		login.setUserPassword(password);
		login.clickSubmit();
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			Assert.assertTrue(true);
		}else {
			Assert.assertTrue(false);
		}
	}

}
