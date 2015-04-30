package com.infy.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import com.opensymphony.xwork2.ActionSupport;

public class reportDisplayAction_demo extends ActionSupport{

	private Integer patientId;
	private String reportFile;
	private InputStream fileInputStream;
	private String userImageContentType;
	private String userImageFileName;
	
	public String getUserImageContentType() {
		return userImageContentType;
	}
	public void setUserImageContentType(String userImageContentType) {
		this.userImageContentType = userImageContentType;
	}
	public String getUserImageFileName() {
		return userImageFileName;
	}
	public void setUserImageFileName(String userImageFileName) {
		this.userImageFileName = userImageFileName;
	}	 
	public InputStream getFileInputStream() {
		return fileInputStream;
	}
	public Integer getPatientId() {
		return patientId;
	}
	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}
	public String getReportFile() {
		return reportFile;
	}
	public void setReportFile(String reportFile) {
		this.reportFile = reportFile;
	}
	
	public String execute() throws Exception{
		
		System.out.println("Action start");
		infyServiceDemo demo=new infyServiceDemo();
		reportEntityDemo entityDemo=null;
		entityDemo=demo.viewReport(this.patientId);
		System.out.println("Action returned");
		this.patientId=entityDemo.getPatientId();
		this.reportFile=entityDemo.getReportFile();
		System.out.println(this.reportFile);
		
		/*fileInputStream = new FileInputStream(new File(this.reportFile,"Done"));	
		File file=new File(this.reportFile,"Done");
		file.createNewFile();
		System.out.println(file.getAbsolutePath());
		*/
		System.out.println("Completed");
		return SUCCESS;
	}
}
