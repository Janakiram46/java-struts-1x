package com.repos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import com.entity.UserRegisterEntity;

public class UserRegisterDAO 
{
	public static EntityManager em=JPARepository.getEntityManager();
	
	public static List<UserRegisterEntity> getProfile(String username){
		Query q=em.createQuery("select p from UserRegisterEntity p where p.username='"+username+"'");
		
		List<UserRegisterEntity> l=q.getResultList();
		return l;
	}

	public static boolean addUserData(UserRegisterEntity ure) {

		EntityTransaction t=em.getTransaction();
		try {			
			t.begin();			
			em.persist(ure);			
			t.commit();			
			return true;
		}
		catch(Exception e) {
			return false;
		}
	}
}
