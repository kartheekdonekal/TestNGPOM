package com.testng.selenium;

import org.testng.annotations.Test;

public class ActiTimeLoginTest extends Base {
	
	@Test
	
	public void loginTest() throws InterruptedException
	{
		
		driver.navigate().to("http://localhost/login.do");
		ActiTimeLogin AT = new ActiTimeLogin();
		     AT.ActiTimeLogin(driver);
		     AT.setUsername("Kartheek");
		     AT.setpassword("kartheek");
		     AT.setLogin();
		     
		     Thread.sleep(1000);
		     
		     System.out.println("Invalid Login..!");
		     AT.setUsername("admin");
		     AT.setpassword("manager");
		     AT.setLogin();
		     driver.close();
		     
		     
			}

}
