package com.qa.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * @author DELL
 * This Class has common methods to read the properties from config.properties file
 *
 */
public class ReadProperties {
	
/* 
 * @return this method will read properties and load Properties and return the object	
 */
	public static Properties loadProperties()
	{
		// Open the File
		
		File ObjFile=new File("AppConfig/config.properties");
		
		// Read the File
		
		FileInputStream objfis=null;
		
		try
		{
			objfis=new FileInputStream(ObjFile);
		} catch(FileNotFoundException e1)
		{
			e1.printStackTrace();
		}
		
		Properties objprop=new Properties();
		try{
			objprop.load(objfis);
		}catch(IOException e)
		{
		e.printStackTrace();	
		}
		
		return objprop;	
	}
	
	/**
	 * @return
	 * @throws IOException
	 * This method will read app url from config file
	 */
	public static String getappURL()
	{
		return loadProperties().getProperty("appURL");
	}
	
	
	/**
	 * @return This method will read implicit wait time from config file
	 */
	public static long implicitWaitTime()
	{
		return Long.parseLong(loadProperties().getProperty("implicitWaitTime"));
	}
	
	
	/**
	 * @return This Method will read  return username from config file
	 */
	public static String getAppUserName()
	{
		return loadProperties().getProperty("userName");
	}
	
	
	/**
	 * @return   This Method will read  return password from config file
	 */
	public static String getAppPassword()
	{
		return loadProperties().getProperty("password");
	}
	
	
	/**
	 * @return This will return fluent wait time
	 */
	public static long getFluentWaitTime()
	{
		return Long.parseLong(loadProperties().getProperty("fluentWaitTime"));
	}

}
