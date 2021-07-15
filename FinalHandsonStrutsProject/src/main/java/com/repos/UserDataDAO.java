package com.repos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import com.entity.UserDataEntity;
import com.entity.UserRegisterEntity;

public class UserDataDAO
{
	public static EntityManager em=JPARepository.getEntityManager();
	public static List<UserDataEntity> getUserData()
	{
		Query q=em.createQuery("select p from UserDataEntity p");
		List<UserDataEntity> l=q.getResultList();
		return l;
	}

	/*
	 * public static List<UserRegisterEntity> getRegister() { Query
	 * q=em.createQuery("select p from UserRegisterEntity p");
	 * List<UserRegisterEntity> register=q.getResultList(); return register; }
	 */
	public static boolean addUserData(UserDataEntity ude) {
		
		EntityTransaction t= em.getTransaction();
		System.out.println("Enter data");

		try {
			t.begin();		
			em.persist(ude);			
			t.commit();			
			return true;
		}
		catch(Exception e) {
			return false;
		}
	}
}
