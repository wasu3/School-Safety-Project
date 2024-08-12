package com.vaia.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlarmManagementPage {

	@FindBy(xpath="//span[text()='Alarm Management']/../../../a[8]")
	private WebElement alarmMngBtn;

	@FindBy(xpath="//button[text()=' Add / Remove Alerts ']/../button")
	private WebElement addAlertBtn;

	@FindBy(xpath="//button[text()='Add']")
	private WebElement addBtn;

	@FindBy(xpath="(//span[@class='ng-arrow-wrapper'])[2]")
	private WebElement schoolDd ;

	@FindBy(xpath="//div[text()='school test A']")
	private WebElement sclOpt ;

	@FindBy(xpath="(//span[@class='ng-arrow-wrapper'])[3]")
	private WebElement userPositionDd ;

	@FindBy(xpath="//div[@class='ng-option ng-star-inserted']/../div[4]")
	private WebElement positonOpt ;

	@FindBy(xpath="(//span[@class='ng-arrow-wrapper'])[3]")
	private WebElement closeDd ;

	@FindBy(xpath="(//span[@class='ng-arrow-wrapper'])[4]")
	private WebElement notificationDd ;

	@FindBy(xpath="//span[text()='WHATSAPP']")
	private WebElement whatsappOpt ;

	@FindBy(xpath="(//span[@class='ng-arrow-wrapper'])[4]")
	private WebElement notificationClose ;

	@FindBy(xpath="(//span[@class='ng-arrow-wrapper'])[5]")
	private WebElement alertConfigBtn ;

	@FindBy(xpath="//div[text()='OVERCROWDING']")
	private WebElement optSelect ;

	@FindBy(xpath="//div[text()='QUEUE']")
	private WebElement secondOpt ;

	@FindBy(xpath="(//span[@class='ng-arrow-wrapper'])[6]")
	private WebElement notificationTypeDd ;

	@FindBy(xpath="//div[text()='Store Overcrowding']")
	private WebElement storeOpt ;

	@FindBy(xpath="(//span[@class='ng-arrow-wrapper'])[7]")
	private WebElement cameraDd ;

	@FindBy(xpath="//div[text()=' ALL ']/../div[1]")
	private WebElement allOpt ;

	@FindBy(xpath="(//span[@class='ng-arrow-wrapper'])[7]")
	private WebElement cameraClose ;

	@FindBy(xpath="//button[text()=' Cancel ']")
	private WebElement cancelBtn ;

	@FindBy(xpath="//button[text()=' Save ']")
	private WebElement saveBtn ;
	
	@FindBy(xpath="//button[@class='close ng-tns-c56-4 ng-star-inserted']")
	private WebElement closeBtn ;

	public AlarmManagementPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void setAlarmManagement() throws InterruptedException {
		alarmMngBtn.click();
		Thread.sleep(7000);
		addAlertBtn.click();
		Thread.sleep(2000);
		addBtn.click();
		schoolDd.click();
		sclOpt.click();
		userPositionDd.click();
		positonOpt.click();
		closeDd.click();
		notificationDd.click();
		whatsappOpt.click();
		notificationClose.click();
		alertConfigBtn.click();
		optSelect.click();
		notificationTypeDd.click();
		storeOpt.click();
		cameraDd.click();
		allOpt.click();
		cameraClose.click();
		Thread.sleep(2000);
		cancelBtn.click();
		Thread.sleep(2000);
		closeBtn.click();
	}

}
