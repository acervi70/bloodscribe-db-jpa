package com.reigninbinary.bloodscribe.db.jpa.queries;

import java.util.List;

import com.reigninbinary.bloodscribe.db.jpa.BloodscribeEntityManager;
import com.reigninbinary.bloodscribe.db.jpa.entities.CampaignEntity;


public class CampaignQueries {

	private static final String BASE_QUERY = "SELECT u FROM CampaignEntity u";
	
	public static CampaignEntity findByCampaignId(int idCampaign) {
		
	    return BloodscribeEntityManager
	    		.getEntityManager()
	    		.find(CampaignEntity.class, idCampaign);
	}
	
	@SuppressWarnings("unchecked")
	public static List<CampaignEntity> findByGameWorldId(int idGameWorld) {
		
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
