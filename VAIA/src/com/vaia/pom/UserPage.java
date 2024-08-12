package com.vaia.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserPage {

	@FindBy(xpath="//span[text()='Users']/../../../a[5]")
	private WebElement userBtn;

	@FindBy(xpath="//span[text()='Add User']/../../button[1]")
	private WebElement addUserBtn;

	@FindBy(id="user-name")
	private WebElement userNameTf;

	@FindBy(id="user-email")
	private WebElement emailTf;

	@FindBy(id="first-name")
	private WebElement firstNameTf;

	@FindBy(id="last-name")
	private WebElement lastNameTf;

	@FindBy(id="contact-number")
	private WebElement contactnoTf;

	@FindBy(xpath="(//span[@class='ng-arrow-wrapper'])[1]")
	private WebElement positionDd;

	@FindBy(xpath="//div[text()='Corporate']")
	private WebElement corporateOption;

	@FindBy(id="Password")
	private WebElement passwordTf ;

	@FindBy(id="confirm-password")
	private WebElement confirmPwdTf ;

	@FindBy(xpath="(//span[@class='ng-arrow-wrapper'])[2]")
	private WebElement roleDd;

	@FindBy(xpath="//div[text()='ADMIN']")
	private WebElement adminOp;

	@FindBy(xpath="(//span[@class='ng-arrow-wrapper'])[3]")
	private WebElement statusDd;

	@FindBy(xpath="//div[text()='Active']")
	private WebElement activeOp;

	@FindBy(xpath="(//span[@class='ng-arrow-wrapper'])[4]")
	private WebElement notificationDd;

	@FindBy(xpath="//div[@class='ng-dropdown-panel-items scroll-host']/div[2]/div[1]")
	private WebElement allOp;

	@FindBy(xpath="(//span[@class='ng-arrow-wrapper'])[4]")
	private WebElement closeDd;

	@FindBy(xpath="(//span[@class='ng-arrow-wrapper'])[5]")
	private WebElement schoolDd;

	@FindBy(xpath="//div[@class='ng-dropdown-panel-items scroll-host']/div/div[1]")
	private WebElement allOption;

	@FindBy(xpath="(//span[@class='ng-arrow-wrapper'])[6]")
	private WebElement primaryDd;

	@FindBy(xpath="//div[@class='ng-dropdown-panel-items scroll-host']/div/div[1]")
	private WebElement adelsonOption;

	@FindBy(xpath="//button[@class='close ng-tns-c56-4 ng-star-inserted']/../button")
	private WebElement close;

	public UserPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void setUser1(String username, String email, String firstname, String lastname, String contactno,
			String password, String confirmpd) throws InterruptedException {
		userBtn.click();
		Thread.sleep(10000);
		addUserBtn.click();
		userNameTf.sendKeys(username);
		emailTf.sendKeys(email);
		firstNameTf.sendKeys(firstname);
		lastNameTf.sendKeys(lastname);
		contactnoTf.sendKeys(contactno);
		positionDd.click();
		corporateOption.click();
		passwordTf.sendKeys(password);
		confirmPwdTf.sendKeys(confirmpd);
		roleDd.click();
		adminOp.click();
		statusDd.click();
		activeOp.click();
		notificationDd.click();
		allOp.click();
		closeDd.click();
		schoolDd.click();
		allOption.click();
		primaryDd.click();
		adelsonOption.click();
		Thread.sleep(2000);
		close.click();		
	}
}




