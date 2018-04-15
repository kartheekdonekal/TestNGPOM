package com.testng.selenium;

import org.testng.annotations.Test;

public class AddNums extends Base{
	
	@Test
	
	public void display()
	{
		int a = 0 , b = 20;
		
		int c = a+b;
		System.out.println(c);
	}

}
