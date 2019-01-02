package com.reigninbinary.bloodscribe.db.jpa.queries;

import java.util.List;

import com.reigninbinary.bloodscribe.db.jpa.BloodscribeEntityManager;
import com.reigninbinary.bloodscribe.db.jpa.entities.CampaignInformationEntity;


public class CampaignInformationQueries {

	private static final String BASE_QUERY = "SELECT u FROM CampaignInformationEntity u";
	
	public static CampaignInformationEntity findByInformationId(int idInformation) {
		
	    return BloodscribeEntityManager
	    		.getEntityManager()
	    		.find(CampaignInformationEntity.class, idInformation);
	}
	
	@SuppressWarnings("unchecked")
	public static List<CampaignInformationEntity> findByCampaignId(int idCampaign) {
		
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
