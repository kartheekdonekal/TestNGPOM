package com.testng.selenium;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class PrinttheDUPLICATEItem_intheList_HashSet extends Base {
	
	@Test
	
	public void PrintDuplicate()
	{
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Chowd/Desktop/Browsers/HTML%20web%20apps/CityMenu.Html");
		WebElement list = driver.findElement(By.name("Places in India"));
		
		Select S = new Select(list);
		
		List <WebElement> option = S.getOptions();
		 int count = option.size();
		 
		 System.out.println(count);
		 
		 HashSet <String> Hs = new HashSet<String>();
		 for(int i =0 ;i<count ;i++)
		 {
			 String text = option.get(i).getText();
			 
			 if(!Hs.add(text))
			 {
				 System.out.println(text+ "is the duplicate item in the listbox");
				 
			 }
		 }
			System.out.println(Hs.size());
			System.out.println(Hs);
			driver.close();
	}

}
