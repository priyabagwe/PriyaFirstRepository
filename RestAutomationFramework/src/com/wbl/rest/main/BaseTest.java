package com.wbl.rest.main;

import org.testng.annotations.BeforeSuite;

import com.wbl.rest.util.ConfigUtil;

public class BaseTest {
	@BeforeSuite
	public void beforeSuite(){
		ConfigUtil.loadProperties(); 
	}
}
