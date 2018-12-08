package com.syntax.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.syntax.utils.Base;

import junit.framework.Assert;

public class AssignmentTestMaven extends Base {

	WebDriver driver;
	String url;

	@BeforeMethod
	
	public void launchTest() {
		url = "https://www.google.com/";
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	
	@Test
	public void testRun() {
		driver.get(url);
		String actual = driver.getTitle();
		String expected = "Google";
		assertEquals(actual, expected);
		System.out.println("Your test passed");
		
	}

	@AfterMethod
	public void finish() {
		driver.close();
	}

}
