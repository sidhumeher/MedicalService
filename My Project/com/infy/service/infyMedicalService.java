package com.infy.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;



import com.infy.action.issueBookAction;
import com.infy.action.uploadReportAction;
import com.infy.entity.PrescriptionEntity;
import com.infy.entity.deliveryDetailsEntity;
import com.infy.entity.issueBookEntity;
import com.infy.entity.labAsstEntity;
import com.infy.entity.medicineEntity;
import com.infy.entity.pharmacistEntity;
import com.infy.entity.reportEntity;;

public class infyMedicalService {

	public reportEntity viewReport(String patientId) throws Exception{

		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Project");
		EntityManager em=emf.createEntityManager();
		reportEntity demo=null;

		try{
			System.out.println("Try start");
			Query query=em.createQuery("select re from reportEntity re where re.patientId=?1");
			query.setParameter(1,patientId);
			demo=(reportEntity) query.getSingleResult();
			System.out.println("Try complete");
			return demo;
		}
		catch(Exception e){
			throw e;
		}
		finally{
			if(em!=null){
				em.close();
			}
		}
	}

	public void uploadReport(uploadReportAction action) throws Exception{

		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Project");
		EntityManager em=emf.createEntityManager();
		reportEntity entity= new reportEntity();	
		try{
			System.out.println("Persisting");
			entity.setDate(action.getDate());
			entity.setLabAssistantId(action.getLabAssistantId());
			entity.setPatientId(action.getPatientId());
			entity.setReportFile(action.getReportFile());
			entity.setReportType(action.getReportType());
			em.getTransaction().begin();
			em.persist(entity);
			em.getTransaction().commit();
			System.out.println("Persisted");
		}
		finally{
			if(em!=null){
				em.close();
			}
		}

	}

	public PrescriptionEntity viewPrescriptionDetails(String patientName) throws Exception{

		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Project");
		EntityManager em=emf.createEntityManager();
		PrescriptionEntity prescriptionEntity=new PrescriptionEntity();

		try{
			Query query=em.createQuery("select pe from PrescriptionEntity pe where pe.patientName=?1");
			query.setParameter(1,patientName);
			prescriptionEntity=(PrescriptionEntity) query.getSingleResult();
			return prescriptionEntity;
		}
		finally{
			if(em!=null){
				em.close();
			}
		}
	}

	public medicineEntity getMedicineDetails(String medicineName) throws Exception{

		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Project");
		EntityManager em=emf.createEntityManager();
		medicineEntity entity=new medicineEntity();
		try{
			Query query=em.createQuery("select me from medicineEntity me where me.medicineName=?1");
			query.setParameter(1,medicineName);
			entity=(medicineEntity) query.getSingleResult();
			return entity;
		}
		finally{
			if(em!=null){
				em.close();
			}
		}
	}

	public deliveryDetailsEntity viewDeliveryDetails(String patientId) throws Exception{


		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Project");
		EntityManager em=emf.createEntityManager();
		deliveryDetailsEntity detailsEntity=null;

		try{
			detailsEntity=em.find(deliveryDetailsEntity.class,patientId);
			if(detailsEntity==null){
				throw new Exception("No delivery details are found");
			}
			return detailsEntity;
		}
		finally{
			if(em!=null){
				em.close();
			}
		}
	}


	public labAsstEntity getLabAsstDetails(String userId,String password) throws Exception{

		System.out.println("Persistence start");
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Project");
		EntityManager em=null;
		labAsstEntity asstEntity=null;
		try{
			System.out.println("try start");
			em=emf.createEntityManager();
			Query query=em.createQuery("select le from labAsstEntity le where le.userId=?1 and le.password=?2");
			query.setParameter(1,userId);
			query.setParameter(2,password);
			asstEntity=(labAsstEntity) query.getSingleResult();
			//return asstEntity;
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			if(em!=null){
				em.close();
			}
		}
		return asstEntity;

	}

	public pharmacistEntity getPharmacistDetails(String userId,String password) throws Exception{

		System.out.println("Persistence start");
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Project");
		EntityManager em=null;
		pharmacistEntity entity=null;

		try{
			System.out.println("try start");
			em=emf.createEntityManager();
			Query query=em.createQuery("select pe from pharmacistEntity pe where pe.userId=?1 and pe.password=?2");
			query.setParameter(1,userId);
			query.setParameter(2,password);
			entity=(pharmacistEntity) query.getResultList().get(0);
			return entity;
		}
		catch(Exception e){
			throw e;
		}
		finally{
			if(em!=null){
				em.close();
			}
		}

	}

	public void getIssue(issueBookAction action) throws Exception{

		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Project");
		EntityManager em=emf.createEntityManager();
		issueBookEntity bookEntity=new issueBookEntity();

		try{
			em.getTransaction().begin();
			bookEntity.setIssueText(action.getIssueText());
			em.persist(bookEntity);
			em.getTransaction().commit();
		}

		finally{
			if(em!=null){
				em.close();
			}
		}
	}

	public List<issueBookEntity> checkIssue() throws Exception{

		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Project");
		EntityManager em=emf.createEntityManager();

		try{
			Query query=em.createQuery("select ibe from issueBookEntity ibe where ibe.status='unresolved'");
			List<issueBookEntity> list=query.getResultList();
			if(list.isEmpty()){
				throw new Exception("No unchecked issues are found");
			}
			return list;
		}
		finally{
			if(em!=null){
				em.close();
			}
		}
	}
}
