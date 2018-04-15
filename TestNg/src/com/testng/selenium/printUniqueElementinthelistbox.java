package com.testng.selenium;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class printUniqueElementinthelistbox extends Base {
	@Test
	
	public void printElement()
	{
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Chowd/Desktop/Browsers/HTML%20web%20apps/CityMenu.Html");
		
		//Get the location of the dropdown in the page
		
		WebElement list = driver.findElement(By.name("Places in India"));
		Select s = new Select(list);
		
	     List <WebElement> options = s.getOptions();
	     int count = options.size();
	     
	     System.out.println(count);
	     
	     HashSet<String> hashset = new HashSet<String>();
	     
	     for(WebElement alloptions : options)
	     {
	    	 String text = alloptions.getText();
	    	 System.out.println(text);
	    	 hashset.add(text);
	     }
	     System.out.println(hashset);
	     driver.close();
	}

}
