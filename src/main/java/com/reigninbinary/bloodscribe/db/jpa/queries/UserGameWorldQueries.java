package com.reigninbinary.bloodscribe.db.jpa.queries;

import java.util.List;

import com.reigninbinary.bloodscribe.db.jpa.BloodscribeEntityManager;
import com.reigninbinary.bloodscribe.db.jpa.entities.UserGameWorldEntity;


public class UserGameWorldQueries {

	private static final String BASE_QUERY = "SELECT u FROM UserGameWorldEntity u";

	@SuppressWarnings("unchecked")
	public static List<UserGameWorldEntity> findAll() {
				
	    return BloodscribeEntityManager.getEntityManager()
	    		.createQuery(BASE_QUERY)
	    		.getResultList();
	}
}
