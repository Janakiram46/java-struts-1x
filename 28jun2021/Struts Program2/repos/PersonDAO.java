package com.repos;



import java.util.List;
import javax.persistence.Query;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.entity.Person;

public class PersonDAO
{
public static EntityManager em=JPARepository.getEntityManager();
public static List<Person> getPerson()
{
	  Query q =em.createQuery("Select p from Person p");//JPAQL
	  List<Person> l=q.getResultList();
	  System.out.println(l);
	  return l;
}
public static boolean addPerson(Person p)
{
	EntityTransaction t=em.getTransaction();
	try
	{
	t.begin();
	em.persist(p);
	t.commit();
	return true;
	}
	catch(Exception e)
	{
		return false;
	}
}
public static boolean remove(int id) {
	 EntityTransaction t= em.getTransaction();
	 try {
	 t.begin();
	 Person p=em.find(Person.class, id);
	 em.remove(p);
	 t.commit();
	 return true;
	 }
	 catch(Exception e) {
		 return false;
	 }
}
}

