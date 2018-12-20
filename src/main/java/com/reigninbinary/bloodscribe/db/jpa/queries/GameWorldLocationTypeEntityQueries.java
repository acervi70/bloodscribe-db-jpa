package com.reigninbinary.bloodscribe.db.jpa.queries;

import java.util.List;

import com.reigninbinary.bloodscribe.db.jpa.BloodscribeEntityManager;
import com.reigninbinary.bloodscribe.db.jpa.entities.GameWorldLocationTypeEntity;

public class GameWorldLocationTypeEntityQueries {

	private static final String BASE_QUERY = "SELECT u FROM GameWorldLocationTypeEntity u";
	
	public static GameWorldLocationTypeEntity findByLocationTypeId(int idGameWorld, int idLocationType) {
		
		final String COLUMN1 = "game_world_id";
		final String PARAM1 = ":game-world-id";		
		final String COLUMN2 = "location_type_id";
		final String PARAM2 = ":location-type-id";
		
		final String QUERY = String.format("%s where %s = %s and %s = %s", 
								BASE_QUERY, COLUMN1, PARAM1, COLUMN2, PARAM2);
	
	    return (GameWorldLocationTypeEntity) 
	    		BloodscribeEntityManager.getEntityManager()
		    		.createQuery(QUERY)
		    		.setParameter(PARAM1, idGameWorld)
		    		.setParameter(PARAM2, idLocationType)
		    		.getSingleResult();
	}

	@SuppressWarnings("unchecked")
	public static List<GameWorldLocationTypeEntity> findByGameWorldId(int idGameWorld) {
		
		final String COLUMN1 = "game_world_id";
		final String PARAM1 = ":game-world-id";		
		
		final String QUERY = String.format("%s where %s = %s and %s = %s", BASE_QUERY, COLUMN1, PARAM1);
	
	    return BloodscribeEntityManager.getEntityManager()
	    		.createQuery(QUERY)
	    		.setParameter(PARAM1, idGameWorld)
	    		.getResultList();
	}

}
