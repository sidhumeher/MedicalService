package com.infy.action;

import com.infy.service.infyMedicalService;
import com.opensymphony.xwork2.ActionSupport;

public class issueBookAction extends ActionSupport{

	private int issueId;
	private String issueText;
	
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
	
	public String execute() throws Exception{
		
		issueBookAction action=new issueBookAction();
		action.setIssueText(this.issueText);
		infyMedicalService medicalService=new infyMedicalService();
		
		if(action.getIssueText()==null){
			return ERROR;
		}
		else{
			medicalService.getIssue(action);
			return SUCCESS;
		}
	}
}
