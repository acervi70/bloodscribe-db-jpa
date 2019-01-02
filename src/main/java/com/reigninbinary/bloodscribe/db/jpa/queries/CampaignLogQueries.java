package com.reigninbinary.bloodscribe.db.jpa.queries;

import java.util.List;

import com.reigninbinary.bloodscribe.db.jpa.BloodscribeEntityManager;
import com.reigninbinary.bloodscribe.db.jpa.entities.CampaignLogEntity;


public class CampaignLogQueries {

	private static final String BASE_QUERY = "SELECT u FROM CampaignLogEntity u";
	
	public static CampaignLogEntity findByLogId(int idLog) {
		
	    return BloodscribeEntityManager
	    		.getEntityManager()
	    		.find(CampaignLogEntity.class, idLog);
	}
	
	@SuppressWarnings("unchecked")
	public static List<CampaignLogEntity> findByCampaignId(int idCampaign) {
		
		final String COLUMN = "campaign_id";
		final String PARAM = ":campaign-id";		
		final String QUERY = String.format("%s where %s = %s", BASE_QUERY, COLUMN, PARAM);

	    return BloodscribeEntityManager
	    		.getEntityManager()
	    		.createQuery(QUERY)
	    		.setParameter(PARAM, idCampaign)
	    		.getResultList();
	}
}
