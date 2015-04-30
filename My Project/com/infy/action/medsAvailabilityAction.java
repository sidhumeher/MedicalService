package com.infy.action;

import com.infy.entity.medicineEntity;
import com.infy.service.infyMedicalService;
import com.opensymphony.xwork2.ActionSupport;

public class medsAvailabilityAction extends ActionSupport{

	private String medicineId;
	private String medicineName;
	private Integer quantity;
	private Integer price;
	
	public String getMedicineId() {
		return medicineId;
	}
	public void setMedicineId(String medicineId) {
		this.medicineId = medicineId;
	}
	
	public String getMedicineName() {
		return medicineName;
	}
	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	
	public String execute() throws Exception{
		
		infyMedicalService medicalService=new infyMedicalService();
		if(medicalService.getMedicineDetails(this.getMedicineName())==null){
			return ERROR;
		}
		else{
			medicineEntity medEntity=medicalService.getMedicineDetails(this.getMedicineName());
			this.setMedicineId(medEntity.getMedicineId());
			this.setMedicineName(medEntity.getMedicineName());
			this.setPrice(medEntity.getPrice());
			this.setQuantity(medEntity.getQuantity());
			return SUCCESS;
		}
	}
}
