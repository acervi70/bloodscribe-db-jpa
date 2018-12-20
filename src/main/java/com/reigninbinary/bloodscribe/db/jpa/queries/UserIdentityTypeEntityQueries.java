package com.reigninbinary.bloodscribe.db.jpa.queries;

import java.util.List;

import com.reigninbinary.bloodscribe.db.jpa.BloodscribeEntityManager;
import com.reigninbinary.bloodscribe.db.jpa.entities.UserIdentityTypeEntity;


public class UserIdentityTypeEntityQueries {

	private static final String BASE_QUERY = "SELECT u FROM UserIdentityTypeEntity u";

	@SuppressWarnings("unchecked")
	public static List<UserIdentityTypeEntity> findAll() {
				
	    return BloodscribeEntityManager.getEntityManager()
	    		.createQuery(BASE_QUERY)
	    		.getResultList();
	}
}
