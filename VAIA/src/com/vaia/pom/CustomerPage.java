package com.vaia.pom;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerPage {
	
	@FindBy(xpath="//span[text()='Customers']/../../../a[4]")
	private WebElement customerBtn ;
	
	@FindBy(xpath="//span[text()='Add Customer']/../../button[1]")
	private WebElement addCustomerBtn ;
	
	@FindBy(id="companyName")
	private WebElement customerNameTf ;
	
	@FindBy(id="address")
	private WebElement addressTf ;
	
	@FindBy(id="selected-addr")
	private WebElement searchTf ;
	
	@FindBy(xpath=" //button[text()=' OK ']")
	private WebElement okBtn ;
	
	@FindBy(id="companyemail")
	private WebElement companyMailTf ;
	
	@FindBy(id="contactNumber")
	private WebElement contactnoTf ;
	
	@FindBy(xpath="//label[@class='clr-control-label']/../../div")
	private WebElement notificationCheckbox ;
	
	@FindBy(xpath="(//div[@class='form-footer']/div[1]/button[1]/span[1])[1]")
	private WebElement submitBtn ;
	
	public CustomerPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setCustomer() throws InterruptedException, AWTException {
		customerBtn.click();
		addCustomerBtn.click();
		customerNameTf.sendKeys("Waseem");
		addressTf.click();
		Robot r = new Robot();
		Thread.sleep(2000);
		searchTf.sendKeys("SparkCognition India");
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		okBtn.click();
		companyMailTf.sendKeys("sparkcognition@maildrop.cc");
		Thread.sleep(2000);
		contactnoTf.sendKeys("+917863578635");
		notificationCheckbox.click();
		Thread.sleep(2000);
		//submitBtn.click();
	}

}
