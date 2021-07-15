package com.repos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import com.entity.StatusEntity;
import com.entity.TicketEntity;
import com.entity.UserDataEntity;
import com.entity.UserRegisterEntity;



public class TicketDAO 
{
public static EntityManager em=JPARepository.getEntityManager();
public static List<TicketEntity> getDetails(String username)
{
	Query q=em.createQuery("select p from TicketEntity p where p.byusername ='"+username+"'");
	
	List<TicketEntity> l=q.getResultList();
	return l;
}
public static List<UserDataEntity> getAdminList()
{
	Query q=em.createQuery("select p from UserDataEntity p where p.usertype='admin'");
	List<UserDataEntity> adminList=q.getResultList();
	return adminList;
	
}
public static List<StatusEntity> getStatus()
{
	Query q=em.createQuery("select p StatusEntity p");
	List<StatusEntity> status=q.getResultList();
	return status;
}
public static List<TicketEntity> getAdmin(String username)
{
	Query q=em.createQuery("select p from TicketEntity p where p.toadminname='"+username+"'");
	List<TicketEntity> admin=q.getResultList();
	return admin;
	
}
public static List<TicketEntity> getOpenList(String username)
{
	Query q=em.createQuery("select p from TicketEntity p where p.status='open'and  p.byusername ='"+username+"'");
	List<TicketEntity> adminList=q.getResultList();
	return adminList;
	
}

public static boolean addTicket(TicketEntity te) 
{
  	 EntityTransaction t= em.getTransaction();
  	 try {
  	 t.begin();
  	 em.persist(te);
  	 t.commit();
  	 return true;
  	 }
  	 catch(Exception e) {
  		 return false;
  	 }
   }
}

