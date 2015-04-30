package com.infy.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class infyServiceDemo {

	public void uploadReport(reportDetailsdemoAction detailsdemoAction) throws Exception{
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Project");
		EntityManager em=emf.createEntityManager();
		
		try{
			reportEntityDemo demo=new reportEntityDemo();
			demo.setPatientId(detailsdemoAction.getPatientId());
			demo.setReportFile(detailsdemoAction.getReportFile());
			
			em.getTransaction().begin();
			em.persist(demo);
			em.getTransaction().commit();
			System.out.println("Perisisted");
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			if(em!=null){
				em.close();
			}
		}
		
	}

	public reportEntityDemo viewReport(Integer patientId) throws Exception{
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Project");
		EntityManager em=emf.createEntityManager();
		reportEntityDemo demo=null;
		
		try{
			System.out.println("Try start");
			Query query=em.createQuery("select re from reportEntityDemo re where re.patientId=?1");
			query.setParameter(1,patientId);
			demo=(reportEntityDemo) query.getSingleResult();
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

}
