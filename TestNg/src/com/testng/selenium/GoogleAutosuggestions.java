package com.testng.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class GoogleAutosuggestions extends Base {
	
	@Test(priority = 0)
	
	public void Suggestions() throws InterruptedException
	{
		driver.manage().window().maximize();
		driver.navigate().to("http://www.google.com");
		
		driver.findElement(By.xpath("//input[@title ='Search']")).sendKeys("shoe");
		
		Thread.sleep(1000);
	}
	
	@Test(priority = 1)
	public void Printing()
	{
		
		List <WebElement> allOptions = driver.findElements(By.xpath("//*[contains(text(),'shoe')]"));
		
		int count = allOptions.size();
		System.out.println("Number of elements present in suggestions"+count);
		
		String expectedvalues = "shoe for boys";
		//Printing all the auto sugesstions 
		
		for(WebElement option : allOptions)
		{
			String text = option.getText();
			System.out.println(text);
			
			//click on selenium inyterview questions
			
			if(text.equalsIgnoreCase(expectedvalues))
			{
				option.click();
				break;
			}
			
			
			
		}
		
		driver.close();
		
		

}
}
