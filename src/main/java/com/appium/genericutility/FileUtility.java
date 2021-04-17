package com.appium.genericutility;

import java.io.FileInputStream;
import java.util.Properties;

public class FileUtility {
	/**
	 * readdatafrompropfile
	 * @param key
	 * @return
	 * @throws Throwable
	 */
	public String readdatafrompropfile(String key) throws Throwable
	{
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream(Pathconstants.propfilepath);
		prop.load(fis);
		return prop.getProperty(key);

}}
