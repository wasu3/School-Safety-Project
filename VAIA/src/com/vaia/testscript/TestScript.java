package com.vaia.testscript;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;

import com.vaia.generic.BaseClass;
import com.vaia.generic.FileLib;
import com.vaia.pom.AlarmManagementPage;
import com.vaia.pom.CustomerPage;
import com.vaia.pom.UserPage;

@Listeners(com.vaia.generic.Listener.class)
public class TestScript extends BaseClass{

	@Test
	public void testUserPage() throws InterruptedException, EncryptedDocumentException, IOException{
		Reporter.log("UserPage",true);
		FileLib f=new FileLib();
		String username = f.getExcelData("Userdetails", 1, 0);
		String email = f.getExcelData("Userdetails", 1, 1);
		String firstname = f.getExcelData("Userdetails", 1, 2);
		String lastname = f.getExcelData("Userdetails", 1, 3);
		String contactno = f.getExcelData("Userdetails", 1, 4);
		String password = f.getExcelData("Userdetails", 1, 5);
		String confirmpd = f.getExcelData("Userdetails", 1, 6);
		UserPage user = new UserPage(driver);
		user.setUser1(username, email, firstname, lastname, contactno, password, confirmpd);

	}

	@Test(enabled = false)
	public void testCustomerPage() throws InterruptedException, AWTException {
		Reporter.log("CustomerPage",true);
		CustomerPage c = new CustomerPage(driver);
		c.setCustomer();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test(enabled = false)
	public void testAlarmManagementPage() throws InterruptedException {
		Reporter.log("AlarmManagementPage",true);
		AlarmManagementPage alarm = new AlarmManagementPage(driver);
		alarm.setAlarmManagement();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}
}






























































































































































































