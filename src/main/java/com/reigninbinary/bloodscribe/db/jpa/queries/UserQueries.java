package com.reigninbinary.bloodscribe.db.jpa.queries;

import java.util.List;

import com.reigninbinary.bloodscribe.db.jpa.BloodscribeEntityManager;
import com.reigninbinary.bloodscribe.db.jpa.entities.UserEntity;


public class UserQueries {

	private static final String BASE_QUERY = "SELECT u FROM UserEntity u";
			
	@SuppressWarnings("unchecked")
	public static List<UserEntity> findAll() {
		
		return BloodscribeEntityManager
	    		.getEntityManager()
	    		.createQuery(BASE_QUERY)
	    		.getResultList();
	}
	
	public static UserEntity findByUserId(int idUser) {
		
	    return BloodscribeEntityManager
	    		.getEntityManager()
	    		.find(UserEntity.class, idUser);
	}
	
	public static UserEntity findByEmailAddress(String emailAddress) {
		
		final String COLUMN = "email_address";
		final String PARAM = ":email-address";		
		final String QUERY = String.format("%s where %s = %s", BASE_QUERY, COLUMN, PARAM);

	    return (UserEntity) BloodscribeEntityManager
	    		.getEntityManager()
	    		.createQuery(QUERY)
	    		.setParameter(PARAM, emailAddress)
	    		.getSingleResult();
	}
	
	public static UserEntity findByIdentityId(String idIdentity) {
		
		final String COLUMN = "identity_id";
		final String PARAM = ":identity-id";		
		final String QUERY = String.format("%s where %s = %s", BASE_QUERY, COLUMN, PARAM);
				
	    return (UserEntity) BloodscribeEntityManager
	    		.getEntityManager()
	    		.createQuery(QUERY)
	    		.setParameter(PARAM, idIdentity)
	    		.getSingleResult();
	}
}
