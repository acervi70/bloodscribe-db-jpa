package com.reigninbinary.bloodscribe.db.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;


public class EntityManagerOps {

	public static void insert(Object o) {
		
		EntityManager em = BloodscribeEntityManager.getEntityManager();
		EntityTransaction tx = em.getTransaction();
		
		try {
			tx.begin();
			
			em.persist(o);
			em.refresh(o);
		}
		catch (Exception e) {
			
			tx.rollback();
		}
		finally {
			
			tx.commit();
		}
	}

	public static void update(Object o) {
		
		EntityManager em = BloodscribeEntityManager.getEntityManager();
		EntityTransaction tx = em.getTransaction();
		
		try {
			tx.begin();
			
			em.merge(o);
		}
		catch (Exception e) {
			
			tx.rollback();
		}
		finally {
			
			tx.commit();
		}
	}

	public static void insert(List<Object> list) {
		
		EntityManager em = BloodscribeEntityManager.getEntityManager();
		EntityTransaction tx = em.getTransaction();
		
		try {
			tx.begin();
			
			for (Object o : list) {
				em.persist(o);
				em.refresh(o);
			}
		}
		catch (Exception e) {
			
			tx.rollback();
		}
		finally {
			
			tx.commit();
		}
	}

}
