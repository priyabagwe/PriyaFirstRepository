package com.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class Locators {
	
	static HashMap<String,String> Locators;
	public static void readLocators()
	{
		Properties Prop = new Properties();
		FileReader fr;
		Locators = new HashMap<String,String>();
		try {
			fr = new FileReader(new File ("locators.properties"));
			Prop.load(fr);
			  Enumeration<?> en = Prop.propertyNames();
			  while(en.hasMoreElements())

			
			for(Map.Entry Val : Prop.entrySet())
			{
				 String key = (String)en.nextElement();
				  String value = Prop.getProperty(key);
				  Locators.put(key, value);
			}}
			  
			//String key = (String)Val.getKey();
			//String value = (String)Val.getValue();
			//System.out.println("key :"+key);
			//System.out.println("value :"+value);
			//Locators.put(key, value);
			

		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


public static By get(String key)
{
	System.out.println("key from By :"+key);
	if (key.contains("_"))
	{
		String[]val = key.split("_");
		if (val[0].equals("css"))
		{
		return By.cssSelector(Locators.get(key));
		}
		else if (val[0].equals("xpath"))
		{
		System.out.println("value from By :"+Locators.get(key));
		By by=By.xpath(Locators.get(key));
		System.out.println("By value:"+by.toString());
		return by;
		}
		else if (val[0].equals("id"))
		{
		return By.id(Locators.get(key));
		}else if (val[0].equals("name"))
		{
		return By.name(Locators.get(key));
		}else if (val[0].equals("link"))
		{
		return By.linkText(Locators.get(key));
		}else if (val[0].equals("plink"))
		{
		return By.partialLinkText(Locators.get(key));
		}else if (val[0].equals("tname"))
		{
		return By.tagName(Locators.get(key));
		}else if (val[0].equals("classname"))    
		{
		return By.className(Locators.get(key));
		}
	}
	return By.cssSelector(Locators.get(key));
	
		}}