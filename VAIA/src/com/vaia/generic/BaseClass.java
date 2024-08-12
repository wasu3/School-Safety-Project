package com.vaia.generic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.vaia.pom.HomePage;
import com.vaia.pom.LoginPage;


public class BaseClass {

	public WebDriver driver;

	@BeforeTest
	public void openBrowser() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--force-device-scale-factor=1.5");
		Reporter.log("openBrowser", true);
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}

	@AfterTest
	public void closeBrowser() {
		Reporter.log("close browser",true);
		driver.close();
	}

	@BeforeMethod
	public void login() throws Exception {
		Reporter.log("login",true);
		FileLib f = new FileLib();
		String url = f.getProperty("url");
		String un = f.getProperty("username");
		String pd = f.getProperty("password");
		driver.get(url);
		LoginPage l = new LoginPage(driver);
		l.setLogin(un, pd);
	}

	@AfterMethod
	public void logout() {
		Reporter.log("logout",true);
		HomePage h=new HomePage(driver);
		h.setLogout();
	}
}
