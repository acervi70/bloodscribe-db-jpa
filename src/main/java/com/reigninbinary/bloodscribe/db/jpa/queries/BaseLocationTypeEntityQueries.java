package com.reigninbinary.bloodscribe.db.jpa.queries;

import java.util.List;

import com.reigninbinary.bloodscribe.db.jpa.BloodscribeEntityManager;
import com.reigninbinary.bloodscribe.db.jpa.entities.BaseLocationTypeEntity;


public class BaseLocationTypeEntityQueries {

	private static final String BASE_QUERY = "SELECT u FROM BaseLocationTypeEntity u";
	
	@SuppressWarnings("unchecked")
	public static List<BaseLocationTypeEntity> findAll() {
		
		return BloodscribeEntityManager
	    		.getEntityManager()
	    		.createQuery(BASE_QUERY)
	    		.getResultList();
	}

	public static BaseLocationTypeEntity findByLocationTypeId(int idLocationType) {
		
	    return BloodscribeEntityManager
	    		.getEntityManager()
	    		.find(BaseLocationTypeEntity.class, idLocationType);
	}
}
