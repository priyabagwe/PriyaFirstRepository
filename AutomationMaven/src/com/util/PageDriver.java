package com.util;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;


public class PageDriver implements WebDriver {
	WebDriver driver;
	Configuration config;
	
	//public PageDriver(WebDriver driver)
	public PageDriver(Configuration config)

	{
		this.config = config;
		start();
	}
	
	public void start()
	{
		String browser = config.BROWSER;
		//System.out.println("Browser: "+browser);
		//System.out.println("url: "+config.URL);
		switch (browser)
		{
		case "firefox":
		driver = startfirefox();
		break;
		case "chrome":
		driver = startchrome();
		break;
		case "ie":
		driver = startIE();
		break;
		default:
			driver = startSafari();
			break;
		
		}
		driver.get(config.URL);
		driver.manage().window().maximize();
	}
		
		public WebDriver startfirefox()
		{
			return new FirefoxDriver();
		}
		public WebDriver startchrome()
		{
			return new ChromeDriver();
		}
		public WebDriver startIE()
		{
			return new InternetExplorerDriver();
		}
		public WebDriver startSafari()
		{
			return new SafariDriver();
		}
				
	
	
	public void get(String url)
	{
		this.get(url);
	}  
	public WebElement findElement(String loc)
	{
		return driver.findElement(Locators.get(loc));
	}
	public List<WebElement> findElements(String loc)
	{
		return driver.findElements(Locators.get(loc));
	}
	
	public void timeOut(long time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
	
	public String getCurrentUrl()
	{
		return driver.getCurrentUrl();
	}
	public void quit() 
	{
		driver.quit();
	}

	public void maximize() {
		driver.manage().window().maximize();
		
	}

	public String getTitle() {
		return driver.getTitle();
	}
	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public WebElement findElement(By arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<WebElement> findElements(By arg0) {
		// TODO Auto-generated method stub
		return null;
	}
		
	@Override
	public String getPageSource() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getWindowHandle() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Set<String> getWindowHandles() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Options manage() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Navigation navigate() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public TargetLocator switchTo() {
		// TODO Auto-generated method stub
		return null;
	}
	

	}



