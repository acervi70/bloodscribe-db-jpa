package com.reigninbinary.bloodscribe.db.jpa.queries;

import java.util.List;

import com.reigninbinary.bloodscribe.db.jpa.BloodscribeEntityManager;
import com.reigninbinary.bloodscribe.db.jpa.entities.UserProfileItemEntity;


public class UserProfileItemQueries {

	private static final String BASE_QUERY = "SELECT u FROM UserProfileItemEntity";

	public static UserProfileItemEntity findByItemId(int idItem) {
		
	    return BloodscribeEntityManager
	    		.getEntityManager()
	    		.find(UserProfileItemEntity.class, idItem);
	}
	
	@SuppressWarnings("unchecked")
	public static List<UserProfileItemEntity> findByUserId(int idUser) {
		
		final String COLUMN = "user_id";
		final String PARAM = ":user-id";
		
		final String QUERY = String.format("%s where %s = %s", BASE_QUERY, COLUMN, PARAM);
				
	    return BloodscribeEntityManager
	    		.getEntityManager()
	    		.createQuery(QUERY)
	    		.setParameter(PARAM, idUser)
	    		.getResultList();
	}
	
}
