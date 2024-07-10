package com.tricentis.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
  @FindBy(id = "Email")
  private WebElement userNameTextField;
  
  @FindBy(id = "Password")
  private WebElement pswdTextField;
  
  @FindBy(xpath = "//input[@value='Log in']")
  private WebElement loginButton;

public WebElement getUserNameTextField() {
	return userNameTextField;
}

public WebElement getPswdTextField() {
	return pswdTextField;
}

public WebElement getLoginButton() {
	return loginButton;
}
}
