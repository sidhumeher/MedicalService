package com.infy.action;

import com.infy.service.infyMedicalService;
import com.opensymphony.xwork2.ActionSupport;

public class checkIssueAction extends ActionSupport{

	private int issueId;
	private String issueText;
	private String status="unresolved";
	
	public int getIssueId() {
		return issueId;
	}
	public void setIssueId(int issueId) {
		this.issueId = issueId;
	}
	public String getIssueText() {
		return issueText;
	}
	public void setIssueText(String issueText) {
		this.issueText = issueText;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String execute() throws Exception{ 
		
		infyMedicalService medicalService=new infyMedicalService();
		medicalService.checkIssue();
		return SUCCESS;
	}
}
