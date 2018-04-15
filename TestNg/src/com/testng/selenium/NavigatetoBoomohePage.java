package com.testng.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class NavigatetoBoomohePage extends Base {
	
	@Test
	
	public void Navigate() throws InterruptedException
	{
		driver.get("http://seleniumhq.org/download");
		
		//close the yellow background 
		
		driver.findElement(By.id("close")).click();
		
		//select an element which is present at the boom of the page
		
		WebElement element = driver.findElement(By.id("footerLogo"));
		
		int x = element.getLocation().getX();
		
		int y = element.getLocation().getY();
		
		System.out.println("X Co-ordinate is :"+x+"and Y Co-ordinate is:"+y);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
		Thread.sleep(1000);
		element.click();
		
		driver.close();
	}

}
