package com.testng.selenium;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HashMapExample_prinheOcuurance extends Base {
	
	@Test
	
	public void occurances()
	{
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/Chowd/Desktop/Browsers/HTML%20web%20apps/CityMenu.Html");
		
		WebElement list = driver.findElement(By.name("Places in India"));
		Select S = new Select(list);
		
		List <WebElement> allOptions = S.getOptions();
		
		HashMap <String, Integer> HM = new HashMap<String, Integer>();
		
		for(WebElement Element : allOptions)
		{
			String text = Element.getText();
			
			if(HM.containsKey(text))
			{
				Integer value = HM.get(text);
				value++;
				HM.put(text, value);
			}
			else
			{
				HM.put(text, 1);
			}
			Set<String> s = HM.keySet();
			for(String key : s)
			{
				Integer value = HM.get(key);
				System.out.println(key+" "+value);
			
			
			if(value > 1)
			{
				System.out.println("Occurance of " +key+ " is :" + value); 	
			}
		
	}
		}
	}
}


