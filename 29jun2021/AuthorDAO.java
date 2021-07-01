package com.repos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.entity.Author;

public class AuthorDAO
{
	 private static EntityManager em=JPARepository.getEntityManager();

	  public static List<Author> getAuthor() {
		  Query q =em.createQuery("Select p from Author p");  //JPQL
		  List<Author> l=q.getResultList();
		  return l;
	  }
}
