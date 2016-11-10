package com.test;

import com.page.HomePage;
import static org.testng.Assert.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.base.BaseTest;


public class HomePageTest extends BaseTest {

	HomePage hp;
	
	@BeforeClass
	public void initialize()
	{
		hp = new HomePage(driver);
	}
	
	@Test
	public void testCountSocialIcons()
	{
		System.out.println("SocialIcons::"+hp);
		int actual = hp.countSocialIcons();
		assertEquals(4,actual);
	}
	@Test
	public void testnavbar()
	{
		assertEquals(6,hp.navbar());
	}
	@Test
	public void testisLogoPresent()
	{
		System.out.println(hp.isLogoPresent());
		boolean actual = hp.isLogoPresent();
		assertEquals(true,actual);
	}
	@Test 
	public void testLoginLink()
	{
		assertEquals("http://www.whiteboxqa.com/login.php",hp.clickLogin());
	}
	@Test
	public void testoptions()
	{
		//boolean actual = hp.options();
		assertTrue(hp.options());
	}
	@Test
	public void testactions()
	{
		//boolean actual = hp.actions();
		assertTrue(hp.options());
	}
	@Test
	public void testscreenShot()
	{
		assertTrue(hp.screenShot());
	}
}


	
