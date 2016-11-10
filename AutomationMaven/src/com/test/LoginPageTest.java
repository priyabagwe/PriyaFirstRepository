package com.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.Assert.*; 

import com.base.BaseTest;
import com.page.LoginPage;
import com.util.ExcelUtil;

public class LoginPageTest extends BaseTest {
	LoginPage lp;
	
	@BeforeClass
	public void beforeClass()
	{
		lp = new LoginPage(driver);
	} 
	
	@DataProvider(name="userData")
	public Object[][]getUsers()
	{
		Object[][] data =ExcelUtil.getData("users");
		return data;
	}
	
	@Test(dataProvider="userData")
	public void performLogin(String userName,String passwd){
		assertTrue(lp.performLogin(userName, passwd));
	}
}
