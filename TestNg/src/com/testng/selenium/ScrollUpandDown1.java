package com.testng.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ScrollUpandDown1 extends Base {
	
	@Test
	
	public void scroll1() throws InterruptedException
	{
		driver.manage().window().maximize();
		driver.get("http://seleniumhq.org/download");
		
		//click on the close icon  of the yellow color background pop up 
		driver.findElement(By.id("close")).click();
		
		//find the applitool
		
		WebElement applitool = driver.findElement(By.xpath("//img[@src= '/sponsors/applitools.png']"));
		
		//Get the X-Coordinates to store in a variable
		int x = applitool.getLocation().getX();
		
		//Get the X-Coordinates to store in a variable
		
		int y = applitool.getLocation().getY();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//scroll to Applitools elements x and y co-ordinates
		
		js.executeScript("window.scrollBy("+x+", "+y+")");
		System.out.println(js.hashCode());
		Thread.sleep(1000);
		
		driver.close();
		
	}
	
	

}
