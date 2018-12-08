package com.syntax.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.syntax.utils.Base;

public class AssignmentTestMaven extends Base {

	WebDriver driver;

	@BeforeMethod
	public void launchTest() {
		String url = "https://www.google.com/";
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);

	}

	@AfterMethod
	public void finish() {
		driver.close();
	}

}
