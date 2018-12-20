package com.reigninbinary.bloodscribe.db.jpa.queries;

import java.util.List;

import com.reigninbinary.bloodscribe.db.jpa.BloodscribeEntityManager;
import com.reigninbinary.bloodscribe.db.jpa.entities.UserProfileItemTypeEntity;


public class UserProfileItemTypeEntityQueries {

	private static final String BASE_QUERY = "SELECT u FROM UserProfileItemTypeEntity u";

	@SuppressWarnings("unchecked")
	public static List<UserProfileItemTypeEntity> findAll() {
				
	    return BloodscribeEntityManager.getEntityManager()
	    		.createQuery(BASE_QUERY)
	    		.getResultList();
	}
}
