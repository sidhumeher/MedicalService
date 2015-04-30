package com.infy.demo;

import java.io.File;

import com.opensymphony.xwork2.ActionSupport;

public class reportDetailsdemoAction extends ActionSupport{

	private Integer reportId;
	private Integer patientId;
	private String reportFile;
	
	public Integer getReportId() {
		return reportId;
	}
	public void setReportId(Integer reportId) {
		this.reportId = reportId;
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
		reportDetailsdemoAction detailsdemoAction=new reportDetailsdemoAction();
		detailsdemoAction.setPatientId(this.patientId);
		detailsdemoAction.setReportFile(this.reportFile);
		
		infyServiceDemo service=new infyServiceDemo();
		service.uploadReport(detailsdemoAction);
		return SUCCESS;
	}
	
}
