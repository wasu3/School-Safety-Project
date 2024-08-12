package com.vaia.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(id="userName")
	private WebElement untbx;

	@FindBy(id="password")
	private WebElement pdtbx;

	@FindBy(xpath="//button[text()=' Login ']")
	private WebElement lgbtn;
	
	@FindBy(xpath="//span[text()='Adelson QA Test']")
	private WebElement adelsonCusBtn;
	
	@FindBy(xpath="//button[text()=' OK ']")
	private WebElement okBtn;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void setLogin(String un, String pd) throws InterruptedException {
		untbx.sendKeys(un);
		pdtbx.sendKeys(pd);
		lgbtn.click();
		Thread.sleep(3000);
		adelsonCusBtn.click();
		okBtn.click();
		Thread.sleep(3000);
	}


}
