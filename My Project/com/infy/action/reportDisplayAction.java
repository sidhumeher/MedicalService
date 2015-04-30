package com.infy.action;

import com.infy.entity.reportEntity;
import com.infy.service.infyMedicalService;
import com.opensymphony.xwork2.ActionSupport;

public class reportDisplayAction extends ActionSupport{

	private Integer reportId;
	private String patientId;
	private String reportFile;
	 
	public String getPatientId() {
		return patientId;
	}
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}
	public Integer getReportId() {
		return reportId;
	}
	public void setReportId(Integer reportId) {
		this.reportId = reportId;
	}
	public String getReportFile() {
		return reportFile;
	}
	public void setReportFile(String reportFile) {
		this.reportFile = reportFile;
	}
	
	public String execute() throws Exception{
		
		System.out.println("Action start");
		infyMedicalService demo=new infyMedicalService();
		reportEntity entityDemo=new reportEntity();
		entityDemo=demo.viewReport(this.patientId);
		
		System.out.println("Action returned");
		this.patientId=entityDemo.getPatientId();
		this.reportFile=entityDemo.getReportFile();
		System.out.println(this.reportFile);
		System.out.println("Completed");
		return SUCCESS;
	}
}
