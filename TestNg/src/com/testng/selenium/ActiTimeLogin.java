package com.testng.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimeLogin  {

	
	    @FindBy(xpath="//input[@name='username']")
		static WebElement username;
	     
	     @FindBy(xpath = "//input[@name='pwd']")
	      static WebElement password;
	     
	     @FindBy(xpath ="//a[@id ='loginButton']/ancestor :: td[@id='loginButtonContainer']")
	     static WebElement login;
	     
	     public void ActiTimeLogin(WebDriver driver)
	     {
	    	 PageFactory.initElements(driver, this);
	     }
	     
	     public static void setUsername(String name)
	     {
	    	 username.sendKeys(name);
	     }
	     
	     public static void setpassword(String pwd)
	     {
	    	 password.sendKeys(pwd);
	     }
	     
	     public static void setLogin()
	     {
	    	 login.click();
	     }
	
	     
	}


