package testlayer;

import org.junit.Test;
import org.testng.Assert;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import basePackage.BaseClass;

import pompackage.PomLogin;


public class LoginTest extends BaseClass {
	PomLogin Log;
	public LoginTest() {
		super();
	}
	@BeforeMethod
	public void initsetup() {
		initiate();
		
		
		 Log = new PomLogin();	
	}
	private void initiate() {
		// TODO Auto-generated method stub
		
	}
	@Test
	public void Title() {
		String actual= Log.verify();
		Assert.assertEquals(actual,"OrangeHRM");
		 
		 
	 }
	 @AfterMethod
	 public void close() {
		 driver.close();
	 }

	}
	
    


