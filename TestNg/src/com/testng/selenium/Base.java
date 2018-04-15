package com.testng.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	
	static
	{
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", ".\\TestNg\\Driver\\geckodriver.exe");
	}
	
	static WebDriver driver = new ChromeDriver();
	//static WebDriver driver = new FirefoxDriver();

}
