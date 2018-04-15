package com.testng.selenium;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class checklisthasDUPLICATEvalues_HashSet extends Base {
	
	@Test
	
	public void listDuplicates()
	{
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Chowd/Desktop/Browsers/HTML%20web%20apps/CityMenu.Html");
		
		WebElement list = driver.findElement(By.name("Places in India"));
		Select s = new Select(list);
		
		List<WebElement> options = s.getOptions();
		int count = options.size();
		System.out.println(count);
		HashSet<String> allElements = new HashSet<String>();
		for(int i=0;i<count;i++)
		{
			String text = options.get(i).getText();
			System.out.println(text);
			allElements.add(text);
		}
		
		int count1 = allElements.size();
		System.out.println(count1);
		
		if(count==count1)
		{
			System.out.println("listbox does not have a duplicate elemenets");
		}
		else
		{
			System.out.println("List box contains duplicate elements");
		}
		
		System.out.println(allElements);
		driver.close();

	}

}
