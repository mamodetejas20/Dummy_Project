package org.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConFig {
	public Properties prop() {
		 try {
		FileInputStream fis = new FileInputStream("F:\\WorkSpace\\Jiem_Project_01\\src\\test\\resourcess\\Properties\\propertiesFile");
	    Properties prop = new Properties();
			prop.load(fis);
			return prop;
		} catch (IOException e) {
			e.printStackTrace();
		}
		 return null;
	    
	}
	
	
	public String GettestData(String Key) {
		try {
		FileInputStream fis = new FileInputStream("F:\\WorkSpace\\Jiem_CBT_Exam\\src\\test\\resource\\PropertiesFile\\properties");
		Properties prop = new Properties();
		prop.load(fis);
		return prop.getProperty(Key);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
		
		}

}
