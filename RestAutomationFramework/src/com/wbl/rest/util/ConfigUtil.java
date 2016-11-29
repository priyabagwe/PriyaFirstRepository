package com.wbl.rest.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigUtil {
	
	public static String URI;
	
	public static void loadProperties(){
		Properties prop = new Properties();
		try {
			prop.load(new FileInputStream(System.getProperty("user.dir")+"//resources//config.properties"));
			URI = prop.getProperty("uri");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
