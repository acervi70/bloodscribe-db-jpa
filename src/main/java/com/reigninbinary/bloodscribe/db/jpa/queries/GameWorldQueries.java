package com.reigninbinary.bloodscribe.db.jpa.queries;

import java.util.List;

import com.reigninbinary.bloodscribe.db.jpa.BloodscribeEntityManager;
import com.reigninbinary.bloodscribe.db.jpa.entities.GameWorldEntity;


public class GameWorldQueries {

	private static final String BASE_QUERY = "SELECT u FROM GameWorldEntity u";
	
	@SuppressWarnings("unchecked")
	public static List<GameWorldEntity> findAll() {
		
		return BloodscribeEntityManager
	    		.getEntityManager()
	    		.createQuery(BASE_QUERY)
	    		.getResultList();
	}
	
	public static GameWorldEntity findByGameWorldId(int idGameWorld) {
		
	    return BloodscribeEntityManager
	    		.getEntityManager()
	    		.find(GameWorldEntity.class, idGameWorld);
	}
	
	@SuppressWarnings("unchecked")
	public static List<GameWorldEntity> findByUserId(int idUser) {
			
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
