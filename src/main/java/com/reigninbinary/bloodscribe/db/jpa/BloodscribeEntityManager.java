package com.reigninbinary.bloodscribe.db.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
//import javax.persistence.FlushModeType;
import javax.persistence.Persistence;

import com.reigninbinary.core.CoreConfig;
import com.reigninbinary.core.CoreLogging;

public class BloodscribeEntityManager {
	
	private static class BloodscribeEntityManagerInstance {
		
		private static final BloodscribeEntityManager INSTANCE = new BloodscribeEntityManager();
	}
	
	private final EntityManagerFactory emf;

	private BloodscribeEntityManager() {
		
		emf = Persistence.createEntityManagerFactory(getPersistenceUnit());
	}
	
	private String getPersistenceUnit() {
		
		final String PERSISTENCE_UNIT 			= "PERSISTENCE_UNIT";
		final String PERSISTENCE_UNIT_DEFAULT 	= "bloodscribe-jpa";

		String pu = CoreConfig.getConfigParam(PERSISTENCE_UNIT, PERSISTENCE_UNIT_DEFAULT);
		CoreLogging.logInfo("JPA Persistence Unit: " + pu);
		return pu;
	}
	
	private static BloodscribeEntityManager getInstance() {
		
		return BloodscribeEntityManagerInstance.INSTANCE;
	}
	
	public static EntityManager getEntityManager() {
		
		EntityManager em = getInstance().emf.createEntityManager();
		
		// TODO: deal wth this at some point - config setting?
		// COMMIT - Flushing occurs only at transaction commit, or when flush() is called.
		// AUTO - (Default) Flushing occurs before any query execution.
		// em.setFlushMode(FlushModeType.AUTO);
		
		return em;
	}
}
