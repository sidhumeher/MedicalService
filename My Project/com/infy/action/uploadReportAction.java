package com.infy.action;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.infy.service.infyMedicalService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class uploadReportAction extends ActionSupport{

	private Integer reportId;
	private String patientId;
	private String reportFile;
	private String reportType;
	private String labAssistantId;
	private Date date;

	HttpServletRequest request;

	public HttpServletRequest getRequest() {
		return request;
	}
	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}
	public String getReportType() {
		return reportType;
	}
	public void setReportType(String reportType) {
		this.reportType = reportType;
	}
	public String getLabAssistantId() {
		return labAssistantId;
	}
	public void setLabAssistantId(String labAssistantId) {
		this.labAssistantId = labAssistantId;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Integer getReportId() {
		return reportId;
	}
	public void setReportId(Integer reportId) {
		this.reportId = reportId;
	}
	public String getPatientId() {
		return patientId;
	}
	public void setPatientId(String patientId) {
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
		
		Date date=new Date();
		this.date=date;
		ActionContext act=ActionContext.getContext();
		HttpServletRequest request=(HttpServletRequest)act.get(ServletActionContext.HTTP_REQUEST);
		HttpSession session=request.getSession();
		this.labAssistantId=(String)session.getAttribute("user");
		
		uploadReportAction action=new uploadReportAction();
		action.setPatientId(this.patientId);
		action.setDate(this.date);
		action.setLabAssistantId(this.labAssistantId);
		action.setReportType(this.reportType);
		action.setReportFile(this.reportFile);
		
		infyMedicalService medicalService=new infyMedicalService();
		medicalService.uploadReport(action);
		
		System.out.println("Action complete");
		return SUCCESS;
	}
}
