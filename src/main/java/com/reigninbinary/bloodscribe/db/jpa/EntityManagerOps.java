package com.reigninbinary.bloodscribe.db.jpa;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class EntityManagerOps {

	public static void save(Object o) {
		
		EntityManager em = BloodscribeEntityManager.getEntityManager();
		EntityTransaction tx = em.getTransaction();
		
		tx.begin();
		try {
			em.persist(o);
			em.refresh(o);
		} 
		catch(EntityExistsException e) {
			em.merge(o);
		}
		finally {
			tx.commit();
		}
	}

}
