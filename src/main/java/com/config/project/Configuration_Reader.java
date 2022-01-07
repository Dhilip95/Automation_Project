package com.config.project;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {
	public Properties p;
	public Configuration_Reader() throws IOException {
		
		File f = new File("C:\\Users\\Lenovo\\eclipse-workspace\\eclipse-java-2019-12-R-win32-x86_64\\eclipse\\Automation_Practice1\\src\\main\\java\\com\\config\\project\\ConfigurationProperties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);
	}
	
	public String getUrl() {
		String url = p.getProperty("url");
		return url;
		
	}
	
	public String getUsername() {
		String username = p.getProperty("username");
		return username;
	}
	public String getPassword() {
String password = p.getProperty("password");
return password;
	
	}
	
	
	
	
}
