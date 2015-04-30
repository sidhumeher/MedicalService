
package com.infy.action;

import com.infy.entity.deliveryDetailsEntity;
import com.infy.service.infyMedicalService;
import com.opensymphony.xwork2.ActionSupport;

public class medsDeliveryAction extends ActionSupport{

	private String patientId;
	private Integer prescriptionId;
	private Boolean medsRequired;
	
	private Integer deliveryId;
	private String deliveryStatus;
	private Float amount;
	private String location;
	
	public String getPatientId() {
		return patientId;
	}
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}
	public Integer getPrescriptionId() {
		return prescriptionId;
	}
	public void setPrescriptionId(Integer prescriptionId) {
		this.prescriptionId = prescriptionId;
	}
	public Boolean getMedsRequired() {
		return medsRequired;
	}
	public void setMedsRequired(Boolean medsRequired) {
		this.medsRequired = medsRequired;
	}	
	public Integer getDeliveryId() {
		return deliveryId;
	}
	public void setDeliveryId(Integer deliveryId) {
		this.deliveryId = deliveryId;
	}
	public String getDeliveryStatus() {
		return deliveryStatus;
	}
	public void setDeliveryStatus(String deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}
	public Float getAmount() {
		return amount;
	}
	public void setAmount(Float amount) {
		this.amount = amount;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String execute() throws Exception{
		
		infyMedicalService medicalService=new infyMedicalService();
		if(medicalService.viewDeliveryDetails(this.getPatientId())==null){
			return ERROR;
		}
		else{
			deliveryDetailsEntity detailsEntity=medicalService.viewDeliveryDetails(this.getPatientId());
			this.setPatientId(detailsEntity.getPatientId());
			this.setPrescriptionId(detailsEntity.getPrescriptionId());
			this.setMedsRequired(detailsEntity.getMedsRequired());
			this.setDeliveryId(detailsEntity.getDeliveryId());
			this.setDeliveryStatus(detailsEntity.getDeliveryStatus());
			this.setAmount(detailsEntity.getAmount());
			this.setLocation(detailsEntity.getLocation());
			
			return SUCCESS;
		}
	}
}
