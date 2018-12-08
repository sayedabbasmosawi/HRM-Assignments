package com.syntax.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntax.utils.Base;

public class Login extends Base {
	
	@FindBy (id ="txtUsername") 
	WebElement userName;
	
	@FindBy (id="txtPassword") 
	WebElement password;
	
	@FindBy (id="btnLogin") 
	WebElement loginButt;
	
	@FindBy (xpath="//img[contains(@src, 'logo')]") 
	WebElement logo;
	
	public Login() {
		PageFactory.initElements(driver, this);
	}
	
	public void enterUserName(String usnm) {
		userName.sendKeys(usnm);

	}

	public void enterPassword(String pwd) {
		password.sendKeys(pwd);
	}

	public void clickLogin() {
		loginButt.click();

	}

	public boolean verifyLogo() {
        return logo.isDisplayed();
    }
	
	
	public void doLogin(String usnm, String pwd) {
		
		userName.sendKeys(usnm);
		password.sendKeys(pwd);
		loginButt.click();


		
	}


}
