package com.infy.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="prescription")
public class PrescriptionEntity {

	@Id
	private String patientName;
	private String doctorName;
	private String medicineName;
	private Integer timesPerDay;
	private String dose;
	
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
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientId(String patientName) {
		this.patientName = patientName;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	
}
