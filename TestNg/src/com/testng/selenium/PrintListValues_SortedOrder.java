package com.testng.selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class PrintListValues_SortedOrder extends Base {
	
	@Test
	
	public void Sortedorder()
	{
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Chowd/Desktop/Browsers/HTML%20web%20apps/CityMenu.Html");
		
		WebElement List1 = driver.findElement(By.xpath("//option[@value ='Please select']/ancestor :: select"));
		
		Select S = new Select(List1);
		
		List<WebElement> allOptions = S.getOptions();
		
		int count = allOptions.size();
		
		System.out.println(count);
		
		ArrayList <String> list = new ArrayList <String>();
		
		for(WebElement options : allOptions)
		{
			String text = options.getText();
			System.out.println(text);
			list.add(text);
		}
		
		Collections.sort(list);
		for(String value : list)
		{
			System.out.println(value);
		}
	}

}
