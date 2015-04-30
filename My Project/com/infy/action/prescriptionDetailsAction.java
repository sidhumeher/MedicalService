package com.infy.action;

import com.infy.entity.PrescriptionEntity;
import com.infy.service.infyMedicalService;
import com.opensymphony.xwork2.ActionSupport;

public class prescriptionDetailsAction extends ActionSupport{

	private String patientName;
	private String doctorName;
	private String medicineName;
	private Integer timesPerDay;
	private String dose;
	
	
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getMedicineName() {
		return medicineName;
	}
	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}
	public Integer getTimesPerDay() {
		return timesPerDay;
	}
	public void setTimesPerDay(Integer timesPerDay) {
		this.timesPerDay = timesPerDay;
	}
	public String getDose() {
		return dose;
	}
	public void setDose(String dose) {
		this.dose = dose;
	}

	public String execute() throws Exception{
		
		infyMedicalService medicalService=new infyMedicalService();
		PrescriptionEntity prescriptionEntity=null;
		prescriptionEntity=medicalService.viewPrescriptionDetails(this.patientName);
		this.patientName=prescriptionEntity.getPatientName();
		this.doctorName=prescriptionEntity.getDoctorName();
		this.medicineName=prescriptionEntity.getMedicineName();
		this.timesPerDay=prescriptionEntity.getTimesPerDay();
		this.dose=prescriptionEntity.getDose();
		return SUCCESS;
	}
}
