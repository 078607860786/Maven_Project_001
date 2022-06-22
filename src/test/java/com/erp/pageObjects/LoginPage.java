package com.erp.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
	WebDriver ldriver;
	public LoginPage(WebDriver driver){
		ldriver=driver;
		PageFactory.initElements(driver,this);
	}
   @FindBy(name="uid")
   @CacheLookup
   WebElement txtuser;
   
   @FindBy(name="password")
   @CacheLookup
   WebElement txtpassword;
   
   @FindBy(name="btnLogin")
   @CacheLookup
   WebElement btnLogin;

public void setUserName(String name) {
	txtuser.sendKeys(name);
}
public void setUserPassword(String pass) {
	txtpassword.sendKeys(pass);
}
public void clickSubmit() {
	btnLogin.click();
}
}
