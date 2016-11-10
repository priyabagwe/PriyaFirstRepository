package com.page;

import java.util.List;
import java.util.Set;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.Logs;

import com.base.BasePage;
import com.util.PageDriver;

public class HomePage extends BasePage {
	String socialLinks = "xpath_social-link";
	String loginLink = "id_login-link";
	 
	public HomePage ( PageDriver driver)
	{
		super(driver);
	}
	public void open(){
		driver.get("http://www.whitboxqa.com");	
		driver.timeOut(50);
		driver.maximize();
		//driver.manage().timeout().implicitlywait(20,TimeUnit.SECONDS);
	}
	
	public int countSocialIcons()
	{
		driver.timeOut(70);
		int count = 0 ;
		driver.maximize();
		List<WebElement> links= driver.findElements(socialLinks);
		if(links!=null)
			count = links.size();
		System.out.println("count social icons: "+count);
		return count;  
	}
	
	public int navbar() 
	{
		List<WebElement> elements = driver.findElements(".main-nav .navbar-nav li");

		//List<WebElement> elements = driver.findElements(By.cssSelector(".main-nav .navbar-nav li"));
		return elements.size();
	}
	
	public boolean isLogoPresent()
	{
		return driver.findElement(By.id("logo")).isDisplayed();
	}

		
	public String clickLogin()
	{
		driver.findElement(loginLink).click();
		return driver.getCurrentUrl();
	}
	
	public boolean options()
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.whiteboxqa.com");
		driver.manage().window().maximize();

		System.out.println(driver.manage().getCookieNamed("PHPSESSID")); 
		Set<Cookie> cookies = driver.manage().getCookies();
		for (Cookie ck : cookies)
		{
			System.out.println(ck.getName()+ "******" + ck.getValue());
		}
		//to create new cookie 
		Cookie c1 = new Cookie ("WD", "AprilBatch");
		driver.manage().addCookie(c1);
		System.out.println(driver.manage().getCookieNamed("WD"));
		//to manage logs
		Logs logs = driver.manage().logs();
		LogEntries logEntries = logs.get(LogType.DRIVER);
		
		for (LogEntry logEntry : logEntries)
		{
			System.out.println(logEntry.getMessage());
		}
		return true;
	}

		public boolean actions()
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.whiteboxqa.com/");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.className("dropdown-toggle"));
		Actions act = new Actions(driver);
		Action action = act.moveToElement(element).
					click().keyDown(element,Keys.SHIFT).sendKeys("Presentations").keyUp(element,Keys.SHIFT)
					.doubleClick(element)
					.build();
		action.perform();
		return true;
	}
	
	public boolean screenShot()
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://whiteboxqa.com");
		File screen = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(screen.getAbsolutePath()+"*********"+screen.getName());
		
			try {
				FileUtils.copyFile(screen, new File ("c:\\Screenshot\\index.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return true;
			}
	}	
 
		


	

