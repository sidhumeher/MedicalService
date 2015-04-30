package com.infy.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import com.opensymphony.xwork2.ActionSupport;
 
public class download extends ActionSupport{
 
	private InputStream fileInputStream;
 
	public InputStream getFileInputStream() {
		return fileInputStream;
	}
 
	public String execute() throws Exception {
	    fileInputStream = new FileInputStream(new File("C:\\Users\\siddardha_406442\\Project\\WebContent\\Image\\labreport_2.jpg"));
	    return SUCCESS;
	}
}