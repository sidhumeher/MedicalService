package com.infy.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="reportDetails")
public class reportEntity {

	@Id
	@SequenceGenerator(name="reportId",sequenceName="reportId",initialValue=100,allocationSize=1)
	@GeneratedValue(generator="reportId",strategy=GenerationType.SEQUENCE)
	private Integer reportId;
	private String reportType;
	private String labAssistantId;
	private String patientId;
	@Temporal(TemporalType.DATE)
	@Column(name="uploadedDate")
	private Date date;
	private String reportFile;
	
	public Integer getReportId() {
		return reportId;
	}
	public void setReportId(Integer reportId) {
		this.reportId = reportId;
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
	public String getPatientId() {
		return patientId;
	}
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getReportFile() {
		return reportFile;
	}
	public void setReportFile(String reportFile) {
		this.reportFile = reportFile;
	}
	
}
