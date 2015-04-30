package com.infy.action;

import com.infy.service.infyMedicalService;
import com.opensymphony.xwork2.ActionSupport;

public class pharmacistAction extends ActionSupport{

	private String userId;
	private String password;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

	public String execute() throws Exception{

		try{
			System.out.println("Action start");
			infyMedicalService medicalService=new infyMedicalService();
			if(medicalService.getPharmacistDetails(getUserId(),getPassword())==null){
				return ERROR;
			}
			else{
				return SUCCESS;
			}
		}
		catch(Exception e){
			e.printStackTrace();
			return ERROR;
		}

	}

	public String logout(){
		
		return SUCCESS;
	}
}
