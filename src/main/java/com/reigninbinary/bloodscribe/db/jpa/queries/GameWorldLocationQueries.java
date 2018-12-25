package com.reigninbinary.bloodscribe.db.jpa.queries;

import java.util.List;

import com.reigninbinary.bloodscribe.db.jpa.BloodscribeEntityManager;
import com.reigninbinary.bloodscribe.db.jpa.entities.GameWorldLocationEntity;


public class GameWorldLocationQueries {

	private static final String BASE_QUERY = "SELECT u FROM GameWorldLocationEntity u";
	
	public static GameWorldLocationEntity findByLocationId(int idLocation) {
		
	    return BloodscribeEntityManager
	    		.getEntityManager()
	    		.find(GameWorldLocationEntity.class, idLocation);
	}
	
	@SuppressWarnings("unchecked")
	public static List<GameWorldLocationEntity> findByParentId(int idParent) {
			
		final String COLUMN = "parent_location_id";
		final String PARAM = ":parent-location-id";
		
		final String QUERY = String.format("%s where %s = %s", BASE_QUERY, COLUMN, PARAM);

	    return BloodscribeEntityManager
	    		.getEntityManager()
	    		.createQuery(QUERY)
	    		.setParameter(PARAM, idParent)
	    		.getResultList();
	}
	
	@SuppressWarnings("unchecked")
	public static List<GameWorldLocationEntity> findByGameWorldId(int idGameWorld) {
			
		final String COLUMN = "game_world_id";
		final String PARAM = ":game-world-id";
		
		final String QUERY = String.format("%s where %s = %s", BASE_QUERY, COLUMN, PARAM);

	    return BloodscribeEntityManager
	    		.getEntityManager()
	    		.createQuery(QUERY)
	    		.setParameter(PARAM, idGameWorld)
	    		.getResultList();
	}
	
	@SuppressWarnings("unchecked")
	public static List<GameWorldLocationEntity> findLocationsWithNoParent(int idGameWorld) {
			
		final String COLUMN1 = "game_world_id";
		final String PARAM1 = ":game-world-id";
		final String COLUMN2 = "location_id";
		//final String PARAM2 = ":location-id";
		
		final String QUERY = String.format("%s where %s = %s and %s is null", 
				BASE_QUERY, COLUMN1, PARAM1, COLUMN2/*, PARAM2*/);

	    return BloodscribeEntityManager
	    		.getEntityManager()
	    		.createQuery(QUERY)
	    		.setParameter(PARAM1, idGameWorld)
	    		//.setParameter(PARAM2, null)
	    		.getResultList();
	}
}
