package com.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Configuration {
  
	public String URL;
	public  String BROWSER;
	 
	// creating the constructor
	public Configuration()
	{
		readproperties();
	}

	public  void readproperties()
{
	Properties prop = new Properties();
	FileReader fr;
	
	try {
		fr = new FileReader(new File("config.properties"));
		prop.load(fr);
		
		BROWSER = prop.getProperty("browser");
		URL = prop.getProperty("url");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
