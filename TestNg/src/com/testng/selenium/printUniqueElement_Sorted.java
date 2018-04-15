package com.testng.selenium;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class printUniqueElement_Sorted extends Base {
	@Test
	
	public void printElement_Sorted()
	{
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/Chowd/Desktop/Browsers/HTML%20web%20apps/CityMenu.Html");
		
		WebElement list = driver.findElement(By.name("Places in India"));
		Select s= new Select(list);
		
		List <WebElement> option = s.getOptions();
		int count = option.size();
		System.out.println(count);
		
		TreeSet <String> tree = new TreeSet<String>();
		
		for(WebElement alloptions : option)
		{
			String text = alloptions.getText();
			System.out.println(text);
			tree.add(text);
		}
		
		System.out.println(tree);
		driver.close();
	}

}
