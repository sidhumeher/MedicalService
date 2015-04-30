package com.infy.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="issueBooking")
public class issueBookEntity {

	@Id
	private int patientId;
	private String issueText;
	private String status="unchecked";
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getIssueText() {
		return issueText;
	}
	public void setIssueText(String issueText) {
		this.issueText = issueText;
	}
}
