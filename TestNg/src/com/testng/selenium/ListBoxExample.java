package com.testng.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ListBoxExample extends Base {
	
	@Test(priority=0)
	
	public void normalSelect() throws InterruptedException
	{
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/Chowd/Desktop/Browsers/HTML%20web%20apps/CityMenu.Html");
		
		WebElement list = driver.findElement(By.xpath("//option[@value ='Please select']/ancestor :: select"));
		Select s = new Select(list);
		
		List<WebElement> allOptions = s.getOptions();
		
		System.out.println("All the options in a list"+allOptions);
		
		int count = allOptions.size();
		
		System.out.println("The size of the list box"+count);
		
		for(WebElement options : allOptions)
		{
			String text = options.getText();
			System.out.println(text);
		}
		
		s.selectByIndex(0);
		
		Thread.sleep(1000);
		
		s.selectByValue("Bangalore");
		
		s.selectByVisibleText("Hyderabad");
		
		//Printing all the selected options 
		
		List <WebElement> allSelectedOptions  = s.getAllSelectedOptions();
		int size2 = allSelectedOptions.size();
		
		System.out.println(size2);
		
		for(WebElement options2 : allSelectedOptions)
		{
			System.out.println(options2.getText());
			
		}
		
		
        //Check if the 	dropdown is multiselect
		
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		
		if(multiple)
		{
			WebElement firstselectedoption = s.getFirstSelectedOption();
			
			System.out.println(firstselectedoption.getText());
			s.selectByIndex(0);
			
			WebElement firstselectedoption1 = s.getFirstSelectedOption();
			
			System.out.println(firstselectedoption1.getText());
			
			s.deselectByValue("Hyderabad");
			
			WebElement firstSelectedOption2 = s.getFirstSelectedOption();
			
			System.out.println(firstSelectedOption2.getText()+" is the first selected item"); 
			s.deselectByVisibleText("Hyderabad"); 
			} 
		}
		
		
	}
	
	


