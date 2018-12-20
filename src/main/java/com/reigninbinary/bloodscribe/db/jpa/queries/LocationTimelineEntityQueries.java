package com.reigninbinary.bloodscribe.db.jpa.queries;

import java.util.List;

import com.reigninbinary.bloodscribe.db.jpa.BloodscribeEntityManager;
import com.reigninbinary.bloodscribe.db.jpa.entities.LocationTimelineEntity;


public class LocationTimelineEntityQueries {

	private static final String BASE_QUERY = "SELECT u FROM LocationTimelineEntity u";
	

	public static LocationTimelineEntity findByTimelineId(int idTimeline) {
		
	    return BloodscribeEntityManager.getEntityManager()
	    		.find(LocationTimelineEntity.class, idTimeline);
	}
	
	@SuppressWarnings("unchecked")
	public static List<LocationTimelineEntity> findByLocationId(int idLocation) {
		
		final String COLUMN = "location_id";
		final String PARAM = ":location-id";		
		
		final String QUERY = String.format("%s where %s = %s", BASE_QUERY, COLUMN, PARAM);

	    return BloodscribeEntityManager.getEntityManager()
	    		.createQuery(QUERY)
	    		.setParameter(PARAM, idLocation)
	    		.getResultList();
	}
}
