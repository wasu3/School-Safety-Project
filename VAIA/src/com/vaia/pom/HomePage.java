package com.vaia.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(xpath="//button[@class='nav-icon dropdown-toggle']")
	private WebElement profilebtn;
	@FindBy(xpath="//span[.='Log out']")
	private WebElement lgoutbtn;
	@FindBy(xpath="//button[.='OK']")
	private WebElement okbtn;

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void setLogout() {
		profilebtn.click();
		lgoutbtn.click();
		okbtn.click();
	}


}
