package com.testng.selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class ScrollUpandDown extends Base{
	@Test
	
	public void Scroll() throws InterruptedException
	{
		driver.manage().window().maximize();
		driver.get("http://seleniumhq.org/download ");
		
		//typecasting the driver object to the javascriptexecutor interface type
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		
		for(int i=1;i<10;i++)
		{
			//Scrolldown the page
			
			js.executeScript("window.scrollBy(0,1000)");
			Thread.sleep(1000);
		}
		
		for(int i=1;i<10;i++)
		{
			//Scroll up the page
			js.executeScript("window.scrollBy(0,-1000)");
			Thread.sleep(1000);
		
			
		}
		System.out.println("TestExecuted Sucessfully...!!");
		System.out.println("Signed-off");
		driver.close();
		
		
		
				
	}

}
