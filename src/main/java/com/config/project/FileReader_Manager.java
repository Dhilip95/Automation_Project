package com.config.project;

import java.io.IOException;

public class FileReader_Manager {
private FileReader_Manager() {
	
}
	
	public static FileReader_Manager getInstanceFRM() {
	FileReader_Manager frm = new FileReader_Manager();
	return frm;

	}
	
	
	
	
	
	
	
	public Configuration_Reader getInstanceCR() throws IOException {
	Configuration_Reader reader = new Configuration_Reader();
	return reader;
	}

	
	
}
