package com.repos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import com.entity.TicketEntity;
import com.entity.TicketHistoryEntity;

public class AdminDAO
{
	public static EntityManager em=JPARepository.getEntityManager();
	public static List<TicketEntity> getIdDetails(String username)
	{
		Query q=em.createQuery("select p from TicketEntity p where p.toadminname='"+username+"' ");
		
		List<TicketEntity> id=q.getResultList();
		return id;
	}
	public static List<TicketHistoryEntity> getHistoryDetails()
	{
		Query q=em.createQuery("select p from TicketHistoryEntity p ");
		
		List<TicketHistoryEntity> details=q.getResultList();
		return details;
	}
	
	public static boolean addTicket(TicketHistoryEntity the) 
	{
	  	 EntityTransaction t= em.getTransaction();
	  	 try {
	  	 t.begin();
	  	 em.persist(the);
	  	 t.commit();
	  	 return true;
	  	 }
	  	 catch(Exception e) {
	  		 return false;
	  	 }
	   }
}
