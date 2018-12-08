package com.syntax.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public static Properties initialProperty (String filePath) {
		
		try {
			FileInputStream fis = new FileInputStream(filePath);
			prop.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return prop;
		
		
	}
	public static void setup() {
		initialProperty(Constance.configFilePath);
		
		String browser = prop.getProperty("browser");
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver = new ChromeDriver();
		} else {
			System.out.println("Please provide valid browser");
		}

		driver.get("url");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	public void tearDown() {
		driver.close();
		
	}
}
