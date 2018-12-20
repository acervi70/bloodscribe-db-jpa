package com.reigninbinary.bloodscribe.db.jpa.queries;

import java.util.List;

import com.reigninbinary.bloodscribe.db.jpa.BloodscribeEntityManager;
import com.reigninbinary.bloodscribe.db.jpa.entities.GameWorldDescriptionEntity;


public class GameWorldDescriptionEntityQueries {

	private static final String BASE_QUERY = "SELECT u FROM GameWorldDescriptionEntity u";
	
	public static GameWorldDescriptionEntity findByDescriptionId(int idDescription) {
		
	    return BloodscribeEntityManager
	    		.getEntityManager()
	    		.find(GameWorldDescriptionEntity.class, idDescription);
	}
	
	@SuppressWarnings("unchecked")
	public static List<GameWorldDescriptionEntity> findByGameWorldId(int idGameWorld) {
				
		final String COLUMN = "game_world_id";
		final String PARAM = ":game-world-id";		
		final String QUERY = String.format("%s where %s = %s", BASE_QUERY, COLUMN, PARAM);
				
	    return BloodscribeEntityManager
	    		.getEntityManager()
	    		.createQuery(QUERY)
	    		.setParameter(PARAM, idGameWorld)
	    		.getResultList();
	}
}
