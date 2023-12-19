package org.los;

import org.bas.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends BaseClass{
	public Login() {
		PageFactory.initElements(driver, this);
	}
	 @FindBy(xpath = "(//input[@type='text'])[2]")
	 private WebElement email;
	 
	// @FindBy(xpath = "//input[@aria-label='Password']")
//	 private WebElement password;
	 
	 @FindBy(xpath = "//button[text()='Request OTP']")
	 private WebElement login;

	public WebElement getEmail() {
		return email;
	}

//	public WebElement getPassword() {
	//	return password;
//	}

	public WebElement getLogin() {
		return login;
	}

}
